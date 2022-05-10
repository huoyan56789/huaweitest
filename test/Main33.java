package com.nsy.api.product.utils.test;

/**
 * Description:
 *
 * @Author chenyiling
 * @Date 2022/05/08 12:39 AM
 * @Since 1.0
 */


import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2021/4/23
 * Time: 17:14
 * Description:
 */
public class Main33
{
    public static void main(String[] args)
    {
        /*
        给定一个元素类型为小写字符串的数组
        请计算两个没有相同字符的元素长度乘积的最大值
        如果没有符合条件的两个元素返回0

        输入描述
          输入为一个半角逗号分割的小写字符串数组
          2<= 数组长度 <=100
          0< 字符串长度 <=50
        输出描述
          两个没有相同字符的元素长度乘积的最大值

        示例一
          输入
            iwdvpbn,iuop,hk,iikd,kadgpf
          输出
            14
          说明
           数组中有5个元组  第一个和第二个元素没有相同字符
           满足条件 输出7*2=14

         */

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        in.close();

        String[] strings = line.trim().split(",");

        int max = 0;
        for (int i = 0; i < strings.length; i++)
        {
            for (int j = i; j < strings.length; j++)
            {
                char[] chars = strings[j].toCharArray();
                int k = 0;
//                后一个字符串的k字符是否存在于前一个字符串中
                while(k < chars.length)
                {
                    if (strings[i].indexOf(chars[k]) != -1)
                    {
                        break;
                    }
                    k++;
                }
                int tmp = strings[i].length() * strings[j].length();
//                k == chars.length说明后一个字符串遍历完全
                if (k == chars.length && tmp > max)
                {
                    max = tmp;
                }
            }
        }

        System.out.println(max);
    }
}