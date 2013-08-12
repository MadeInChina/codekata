package com.hrw.codekata.stringcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    Pattern pattern = Pattern.compile("^//(.)\n(.*)");//以//开头(除换行的任何字符) 换行 （除换行的任何字符一个或者多个）

    String DEFAULT_DELIMITERS = "\n|,";

    public int add(String values) {
        if (values.isEmpty()) {
            return 0;
        } else {
            //  //;\n1;2
            Matcher matcher = pattern.matcher(values);
            if (matcher.find()) {
                matcher.group();//matcher.group(0);-----//; 换行 1;2
                DEFAULT_DELIMITERS = matcher.group(1);//------;
                values = matcher.group(2);//-------1;2

            }
            return getSumValue(values);
        }

    }

    private int getSumValue(String values) {
        int sum = 0;
        String[] delimiterValue = values.split(DEFAULT_DELIMITERS);
        for (String value : delimiterValue) {
            sum += getIntValue(value);
        }
        return sum;
    }

    private Integer getIntValue(String value) {
        return Integer.valueOf(value);
    }
}
