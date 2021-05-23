package cn.lzw.collection.Questions;


import org.junit.Test;

import java.util.*;

/**
 * @author lzw
 * @version 2021/5/22 19:15
 * 1.请从键盘随机输入10个整数保存到List中，并按倒序、从大
 * 到小的顺序显示出来
 *
 */

public class Question01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input ten integers: ");

        List list = new ArrayList();

        while( scanner.hasNextInt() ){
            int i = scanner.nextInt();
            if( i == 0 ){
                System.out.println("-------结束--------");
                break;
            }
            list.add(i);
        }
        Iterator iterator = list.iterator();

        //    遍历list集合中的元素并输出
        while( iterator.hasNext() ){
            System.out.println(iterator.next());
        }

        //    排序输出
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        scanner.close();
    }


    @Test
    public void test(){

    }
}
