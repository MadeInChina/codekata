
package com.hrw.codekata.emailtemplate;

public class Template {

    private String mVariableValue;

    private String templateText;

    public Template(String string) {
        this.templateText = string;
    }

    public void set(String variable, String value) {
        this.mVariableValue = value;

    }

    public String evaluate() {
        return templateText.replaceAll("\\$\\{name\\}", mVariableValue);
    }

}
