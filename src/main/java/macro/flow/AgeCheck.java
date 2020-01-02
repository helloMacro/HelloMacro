package main.java.macro.flow;

public class AgeCheck {
    public static String getAge(int age){
        if(age<7){
            return "儿童";
        }
        if(age<19){
            return "学生";
        }
        if(age<65){
            return "成人";
        }
        if(age<200){
            return "老人";
        }

        return null;
    }
}
