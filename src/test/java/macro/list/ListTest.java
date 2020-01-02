package test.java.macro.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    //ArrayList:数组实现
    //LinkedList:双向链表
    //创建：无参数构建；有参数构建：1指定容量大小 2复制以存在的List来创建
    //添加：1 头插 2 尾插 3 中间插入
    //删除：1 头删 2 尾删 3 中间删除
    //遍历：
    // 1 for 循环
    // 2 使用迭代器 Iterator，ListIterator
    // 3 使用迭代器对List进行添加、删除操作
    // 4 迭代器使用注意事项：使用迭代器对列表进行操作时，原对象不能发生结构性变化，
    //   否则，迭代器操作会抛异常。

    // 底层实现原理及主要JDK源码：内部存储结构、添加/删除/遍历操作的流程
    // 对 List 进行排序：冒泡、插入、选择

    private static void addNumberToList(List arrayList,int count,int number){
        Long start = System.currentTimeMillis();
        for(int i=0;i<count;i++){
            arrayList.add(number);
        }
        System.out.println("耗时："+(System.currentTimeMillis()-start)+"ms");
    }

    private static void studyArrayListOp1(){
        //创建ArrayList时，如果未指定容量大小，则会创建一个空数组！！【默认为10】
        // 第一次调用add方法时，将容量扩充为默认容量大小，DEFAULT_CAPACITY
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        int count = 100000;
        //addNumberToList(list,count,1);
        Iterator<Integer> iterator = list.iterator();
        System.out.println("next:"+iterator.next());
        iterator.remove();
        System.out.println(list);
        list.add(7);
        //迭代器操作元素的时候，set 和 remove方法和迭代器的状态有关，更新或者删除的是上一次调用 next 或者 previous方法返回的元素
        //add只和迭代器的位置有关，在当前迭代器位置之前添加元素

        //如果在创建ArrayList时，能预估数据规模，我们就可以指定一个初始容量大小，以减少扩容操作。
        List<Integer> list2 = new ArrayList<>(100);
        /*for(Integer n :list){
            list2.add(n);
        }*/
        //addNumberToList(list2,count,1);
        /*System.out.println("list2:"+list2);
*/
        //数组有容量大小限制，当add操作时，如果数组已满，就会引发扩容
        // 1.计算新的容量大小：1.5*原
        // 2.按新的容量大小创建一个新的数组
        // 3.将旧的数组里的元素全部复制到新创建的数组中
        // 4.丢弃旧的数组


    }

    public static void linkedListTrain(){
        List list1 = new LinkedList();
        list1.add("A");
        list1.add("B");
        System.out.println(list1);

        List list2 = new LinkedList(list1);
        System.out.println(list2);
    }

    private static void listOpTime(List<Integer>list){
        long start = System.currentTimeMillis();
        for(int i=0;i<list.size();i++){
            list.get(i);
        }
        System.out.printf("[%s]for循环遍历耗时：%d ms",list.getClass().getSimpleName(),System.currentTimeMillis()-start);
        //Iterator


        //for-each


        //在第五位插入10000个


    }

    public static void main(String[] args) {
        //studyArrayListOp1();
        linkedListTrain();

        // ArrayList 和 LinkedList区别
        // ArrayList 长于随即快速访问，删除、插入元素很慢
        // LinkedList 长于删除、插入元素，但随机访问很慢
        //随机访问：list.get(index),拖过索引来访问


    }

    @Test
    private static void studyArrayListOp(){
        //创建ArrayList时，如果未指定容量大小，则会创建一个空数组！！【默认为10】
        // 第一次调用add方法时，将容量扩充为默认容量大小，DEFAULT_CAPACITY
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }


}
