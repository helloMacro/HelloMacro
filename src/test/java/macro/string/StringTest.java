package test.java.macro.string;

import main.java.macro.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    @Test
    public void testString(){
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);
        String str3 = "helloworld";
        String str4 = str1 + "world";
        System.out.println(str3==str4);

        String str5 = new String("hello");
        String str6 = new String("hello");
        System.out.println(str5==str6);

        String str7 = str5.intern();
        System.out.println(str7==str1);

    }

    @Test
    public void test(){

    }

    @Test
    public void testLength(){
        String str = "hello china!";
        System.out.println(str.length());
        System.out.println(str.substring(10,11));
    }

    @Test
    public void testFormat(){
        /*//System.out.println("hello, %s %n","world!");
        System.out.println(String.format("hello, %s %n","world!"));
        String str = "大写a: "+"A"+" "+"\n";
        System.out.println(str);
        //System.out.println("大写a: %c","A");
        String str1 = String.format("大写a: %S","A");
        System.out.println(str1);*/

        /*System.out.println(String.format("100>5: %b %n",100>5));
        System.out.println(String.format("100除以2： %d %n",100/2));
        System.out.println(String.format("100除以2： %f %n",100/2.0));
        System.out.println(String.format("100的十六进制：%x %n",100));
        System.out.println(String.format("100的八进制：%o %n",100));
        System.out.println(String.format("100元打8.5折扣是：%f %n",100*0.85));
        System.out.println(String.format("100元打8.5折扣的十六进制是：%a %n",100*0.85));
        System.out.println(String.format("100元打折扣是：%d %% %n",85));*/

        String strIndex = "hello world! love ambition!";
        System.out.println(strIndex.indexOf('o'));
    }

    @Test
    public void testIndex(){
        String strIndex = "hello world! love ambition!";
        //System.out.println(strIndex.indexOf('o'));
        int alt = -1;
        int pos = 0;
        do {
            pos = strIndex.indexOf('o',alt+1);
            if(pos==-1){
                break;
            }else {
                System.out.println("o出现的位置："+pos);
            }
            alt = pos;
        }while (true);

        int alt1 = strIndex.length();
        int pos1 = strIndex.length()-1;
        do{
            pos1 = strIndex.lastIndexOf('o',alt1-1);
            if(pos1!=-1){
                System.out.println("o从后往前的位置："+pos1);
                alt1 = pos1;
            }else {
                break;
            }
        }while (true);

        System.out.println("hello,world!".replace("o","A"));


    }

    @Test
    public void teestNew(){
        StringBuilder sb = new StringBuilder();//默认为16；多次扩容，抛弃重建赋值（浪费空间）
        StringBuilder sb2 = new StringBuilder(100);
        sb.append("hello");sb2.append("world");
        sb.append(sb2);sb.append(1.4);
        sb.setLength(10);
        System.out.println(sb.toString());

        sb.setLength(20);
        System.out.println(sb.toString());
        System.out.println(sb.length());
    }

    @Test
    public void teestNew2(){
        StringBuffer sb = new StringBuffer();//默认为16；多次扩容，抛弃重建赋值（浪费空间）
        StringBuffer sb2 = new StringBuffer  (100);
        sb.append("hello");sb2.append("world");
        sb.append(sb2);sb.append(1.4);
        sb.setLength(10);
        System.out.println(sb.toString());

        sb.setLength(20);
        System.out.println(sb.toString());
        System.out.println(sb.length());
    }

    @Test
    public void testOpt1(){
        String str1 = "hello"+",world!";
        System.out.println(str1);
    }
    @Test
    public void testOpt2(){
        String str1 = "hello,world!";
        System.out.println(str1);
    }

    @Test
    public  void testOpt3(){
        long start = System.currentTimeMillis();
        String  str = "";
        for(int n=0;n<2000;n++){
            str+=n;
        }
        System.out.println(str.length());
        System.out.println(System.currentTimeMillis()-start);

        //JVM本身会有一部分优化操作
        //javap -c class文件（反编译）


    }

    @Test
    public void testReverse(){
        Assert.assertEquals(StringUtils.reverse("hello"),"olleh");
    }
}
