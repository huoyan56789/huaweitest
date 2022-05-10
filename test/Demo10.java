package com.nsy.api.product.utils.test;

/**
 * Description:
 *
 * @Author chenyiling
 * @Date 2022/05/08 9:07 PM
 * @Since 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2020/11/7
 * Time: 14:40
 * Description:
 * 输出排序结果，各正整数以空格分割
 和小明身高差绝对值最小的小朋友排在前面
 和小明身高差绝对值最大的小朋友排在后面
 如果两个小朋友和小明身高差一样
 则个子较小的小朋友排在前面
 
 * 100 10
 95 96 97 98 99 101 102 103 104 105
 
 
 99 101 98 102 97 103 96 104 95 105
 */
public class Demo10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int h = scanner.nextInt();
            int n = scanner.nextInt();
            List<Integer> highs = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                highs.add(scanner.nextInt());
            }
            solution(h, highs);
        }
    }

    private static void solution(int h, List<Integer> highs) {
        highs.sort((h1, h2) -> {
            int diff1 = Math.abs(h1 - h);               
            int diff2 = Math.abs(h2 - h);
            return diff1 == diff2 ? h1 - h2 : diff1 - diff2;
        });

        for (int i = 0; i < highs.size(); i++) {
            System.out.print(highs.get(i));
            if (i != highs.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
