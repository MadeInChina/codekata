
package com.hrw.codekata.warmup;

public class StartOz {

    private static final String START_PREFIX_OZ = "oz";

    private static final String START_PREFIX_O = "o";

    private static final String START_PREFIX_Z_AT_OFFSET_ONE = "z";
    
    
//    Solution:
//        public String startOz(String str) {
//          String result = "";
//          
//          if (str.length() >= 1 && str.charAt(0)=='o') {
//            result = result + str.charAt(0);
//          }
//          
//          if (str.length() >= 2 && str.charAt(1)=='z') {
//            result = result + str.charAt(1);
//          }
//          
//          return result;
//        }
    
    public static String startOz(String string) {
        if (string.startsWith(START_PREFIX_OZ)) {
            return START_PREFIX_OZ;
        } else if (string.startsWith(START_PREFIX_Z_AT_OFFSET_ONE, 1)) {
            return START_PREFIX_Z_AT_OFFSET_ONE;
        } else if (string.startsWith(START_PREFIX_O)) {
            return START_PREFIX_O;
        }
        return null;
    }

}
