package test.java.macro;

import org.junit.Test;

import java.util.Random;


public class test {
    @Test
    public void test(){
        System.out.println("macro!");
    }

    @Test
    public void testWhile(){
        boolean flag = true;
        int count = 0;
        while (flag){
            int temp = new Random().nextInt(1000);
            if(temp%30==0){
                flag = false;
                System.out.println(temp+"整除30，结束");
                System.out.println("共执行了"+ count+1 +"次");
            }else{
                count++;
                System.out.println(temp+"不能整除30，继续");
            }
        }
    }

    @Test
    public void testDoWhile(){
        int count = 0;
        boolean flag = true;
        do {
            int temp = new Random().nextInt(1000);
            if(temp%3==0){
                flag = false;
                System.out.println(temp+"整除3");
                System.out.println(count+1+"次执行");

            }else {
                count++;
                System.out.println(temp+"不能整除3，继续");
            }
        }while (flag);
    }

    @Test
    public void testFor(){
        int count = 0;
        for(int i=0;i<=100;i++){
            if(i%2==1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

    /*练习：假如你有⼀个机器⼈，你通过输⼊数字指令来指挥机器⼈，⽐如输⼊ 1 让机器⼈扫地，输⼊ 2 让机
    器⼈打开灯。具体指令如下：*/
    @Test
    public void robot(){
        int rand = new Random().nextInt(8);
        switch (rand){
            case 1:{
                System.out.printf("play");
                break;
            }
            case 2:{
                System.out.printf("eat");
                break;
            }
            case 3:{
                System.out.printf("listen");
                break;
            }


        }
    }

    /*编写⼀个⽅法 int getMaxNumRem7(int n1, int n2) 找出 0 ~ n2 范围内除以 n1 余 7 的最⼤的
    数，找到则返回该数，如果找不到则返回 -1。*/
    public int getMaxNUmRem7(int n1,int n2){
        for (int i = n2;i>0;i--){
            if(i%n1==7){
                System.out.println(i);
                return i;
            }
        }
        System.out.println("未找到结果！");
        return -1;
    }
    //求和
    public int getMaxNUmRem7Sum(int n1,int n2){
        int total = 0;
        for(int i=n2;i>=0;i--){
            if(i%n1==0){
                total+=i;
            }
        }
        return total;
    }

    @Test
    public void testG(){
        int n1 = 7;
        int n3 = 100;
        //getMaxNUmRem7(n1,n3);
        System.out.println(getMaxNUmRem7Sum(n1,n3));
    }
}
