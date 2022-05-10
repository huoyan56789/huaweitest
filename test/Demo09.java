package com.nsy.api.product.utils.test;

/**
 * Description: ????
 *
 * @Author chenyiling
 * @Date 2022/05/08 9:12 PM
 * @Since 1.0
 */
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2020/11/2
 * Time: 16:41
 * Description:
 *    一天一只顽猴想要从山脚爬到山顶
 途中经过一个有n个台阶的阶梯，但是这个猴子有个习惯，每一次只跳1步或3步
 试问？猴子通过这个阶梯有多少种不同的跳跃方式
 
 * 50
 * 122106097
 */
public class Demo09 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            solution(n);
        }
    }
    private static void solution(int n) {
        int step1 = 1, step2 = 1, step3 = 2;
        int step4 = n == 1 || n == 2 ? 1 : 2;
        for (int i = 4; i <= n; i++) {
            step4 = step3 + step1;     //4阶 是3阶或者1阶迈上来的
            step1 = step2;
            step2 = step3;
            step3 = step4;
        }
        System.out.println(step4);
    }
//    private static void solution(int n) {
//        int step1 = 1, step2 = 1, step3 = 2;
//        int step4 = n == 1 || n == 2 ? 1 : 2;
//        for (int i = 4; i <= n; i++) {
//            step4 = step3 + step1;     //4阶 是3阶或者1阶迈上来的
//            step1 = step2;
//            step2 = step3;
//            step3 = step4;
//        }
//        System.out.println(step4);
//    }
}
