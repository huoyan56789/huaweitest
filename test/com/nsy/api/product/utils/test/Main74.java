package com.nsy.api.product.utils.test;

/**
 * Description:
 *
 * @Author chenyiling
 * @Date 2022/05/07 2:47 PM
 * @Since 1.0
 */

        import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2021/7/8
 * Time: 13:44
 * Description: 90
 */
public class Main74 {
    public static void main(String[] args) {
        /*
        给定一个字符串S

        变化规则:
         交换字符串中任意两个不同位置的字符

        输入描述：
         一串小写字母组成的字符串
        输出描述：
         按照要求变换得到最小字符串

        实例1：
         输入：、
         abcdef
        输出
         abcdef

        实例2：
         输入
         bcdefa
         输出
         acdefb

        s都是小写字符组成
        1<=s.length<=1000
         */

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        char[] chars = str.toCharArray();
        char tmp = chars[0];  //第一个
        int pos = 0;      //位置1
        for (int i = 1; i < chars.length; i++) {
            char cur = chars[i];
            //记录最小的字母位置
            if (cur <= tmp) {
                tmp = cur;
                pos = i;
            }
        }

        if (pos != 0) {
            chars[pos] = chars[0];
            chars[0] = tmp;
        }

        System.out.println(new String(chars));

    }
}