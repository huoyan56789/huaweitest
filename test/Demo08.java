package com.nsy.api.product.utils.test;

/**
 * Description:       ????
 *
 * @Author chenyiling
 * @Date 2022/05/08 9:24 PM
 * @Since 1.0
 */
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2020/12/15
 * Time: 22:54
 * Description:
 *
 * 如果三个正整数A、B、C ,A²+B²=C²则为勾股数
 如果ABC之间两两互质，即A与B，A与C，B与C均互质没有公约数，
 则称其为勾股数元组。
 请求出给定n~m范围内所有的勾股数元组
  1
 20

 3 4 5
 5 12 13
 8 15 17
 */
public class Demo08 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            solution(n, m);
        }
    }

    private static void solution(int n, int m) {
        int count = 0;
        for (int a = n; a < m - 1; a++) {
            for (int b = a + 1; b < m; b++) {
                for (int c = b + 1; c < m + 1; c++) {
                    if (relativelyPrime(a, b) && relativelyPrime(b, c) && relativelyPrime(a, c) && a * a + b * b == c * c) {
                        count++;
                        System.out.printf("%d %d %d\n", a, b, c);
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Na");
        }
    }

    private static boolean relativelyPrime(int x, int y) {
        int min = Math.min(x, y);
        double sqrt = Math.sqrt(min);
        for (int i = 2; i < sqrt; i++) {
            if (x % i == 0 && y % i == 0) {
                return false;
            }
        }
        return true;
    }
}