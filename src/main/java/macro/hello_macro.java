package main.java.macro;

import org.junit.Test;
public class hello_macro {
    public static boolean equal(Integer n1,Integer n2){
        return n1==n2;
    }
    public static void main(String[] args) {
        System.out.println("hello macro!");
        int n1=2;
        Integer n2 = new Integer(2);
        System.out.println(2==new Integer(2));
        System.out.println(equal(n1,n2));
        System.out.println(equal(2,new Integer(2)));
    }
    @Test
    public void test(){
        Integer n1 = Integer.valueOf(127);
        Integer n2 = Integer.valueOf(127);
        Integer n3 = Integer.valueOf(128);
        Integer n4 = Integer.valueOf(128);
        System.out.println((n1==n2)+","+(n3==n4));

    }
    @Test
    public void test_1(){
        int n = 127;
        Integer n1 = new Integer(127);
        int m = 128;
        Integer n2 = new Integer(128);
        System.out.println((n==n1)+","+ (n1.equals(n)) +","+(m==n2)+","+ (n2.equals(m)));
        System.out.println(3*0.1);
    }


}
