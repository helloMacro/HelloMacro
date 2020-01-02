package test.java.macro.array;

import main.java.macro.array.Array;
import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArray(){
        int[] arrNum = new int[5];
        System.out.println(Arrays.toString(arrNum));

        boolean[] arrBool = new boolean[3];
        System.out.println(Arrays.toString(arrBool));

        String[] arrStr = new String[4];
        System.out.println(Arrays.toString(arrStr));

        //所有变量在使用前必须初始化！
        int[] arr = {2,3,4,5,6};
        System.out.println(Arrays.toString(arr));

    }
}
