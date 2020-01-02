package main.java.macro.string;

public class StringUtils {
    public static String trimAll(String str){
        StringBuffer sb = new StringBuffer(50);
        char[] chars = str.toCharArray();
        /*for(int index=0;index<str.length();index++){
            if(str.charAt(index)==' '){
                continue;
            }else {
                sb.append(str.charAt(index));
            }
        }*/
        for(int index=0;index<str.length();index++){
            if(chars[index]==' '){
                continue;
            }else {
                sb.append(chars[index]);
            }
        }
        return sb.toString();
    }

    public static String reverse(String string){
        //方法1:数组直接对调
        /*char[] chars = string.toCharArray();
        for(int index=0;index<chars.length/2;index++){
            char temp = chars[index];
            chars[index] = chars[chars.length-1-index];
            chars[chars.length-1-index] = temp;
        }
        return String.copyValueOf(chars);*/

        //方法2：采用Stringbuffer
        StringBuilder sb = new StringBuilder();
        for(int index=string.length()-1;index>=0;index--){
            sb.append(string.charAt(index));
        }
        return sb.toString();
    }

}
