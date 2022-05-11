package com.nsy.api.product.utils.test;

/**
 * Description:
 *
 * @Author chenyiling
 * @Date 2022/05/07 9:17 PM
 * @Since 1.0
 */


import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2021/5/8
 * Time: 19:04
 * Description:   ??????? 最短时间
 */
public class Main48
{
    public static void main(String[] args)
    {
        /*
         为了充分发挥Gpu算力，
         需要尽可能多的将任务交给GPU执行，
         现在有一个任务数组，
         数组元素表示在这1s内新增的任务个数，
         且每秒都有新增任务，
         假设GPU最多一次执行n个任务，
         一次执行耗时1s，
         在保证Gpu不空闲的情况下，最少需要多长时间执行完成。

         输入描述
           第一个参数为gpu最多执行的任务个数
           取值范围1~10000
           第二个参数为任务数组的长度
           取值范围1~10000
           第三个参数为任务数组
           数字范围1~10000

         输出描述
           执行完所有任务需要多少秒

         例子
           输入
            3   ---最多执行的任务个数
            5     任务数组的长度 1 2 3 
            1 2 3 4 5
           输出
            6

            说明，一次最多执行3个任务  最少耗时6s

          例子2
            输入
             4
             5
             5 4 1 1 1
            输出
             5

           说明，一次最多执行4个任务  最少耗时5s
         */

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        int len = Integer.parseInt(in.nextLine().trim());
        String[] split = in.nextLine().split(" ");
        in.close();
        int[] jobs = new int[len];
        for (int i = 0; i < len; i++)
        {
            jobs[i] = Integer.parseInt(split[i]);
        }

        int time = 0;
        //用more变量削峰  n为一次最多执行任务数量
        int more = 0;
        for(int job:jobs)  {
            if(job+more>n){
                more = more +job-n;
            }  else {
                more = 0;
            }
            time++;
        }
           while(more>0){
            more = more-n;
            time++;
           }
        System.out.println(time);
//        Arrays.sort(jobs);
//        //流水线多，则作业时间最长的为结果
//        if (len <= n) {
//            System.out.println(jobs[jobs.length - 1]);
//            return;
//        }
//
//        ArrayList<Integer> res = new ArrayList<>();
//        //                   m个流水
//        for (int i = 0; i < n; i++) {
//            res.add(jobs[i]);
//        }
//        //        res最开始为2，3，4，min 为最小值，2+ 8 =10非最小后，循环
//        for (int i = n; i < jobs.length; i++) {
//            //            TreeSet排序     2 3 4 8 10 11 13
//            Integer min = new ArrayList<>(new TreeSet<>(res)).get(0);
//            int index = res.indexOf(min);
//            res.set(index, res.get(index) + jobs[i]);
//        }
//
//        ArrayList<Integer> r = new ArrayList<>(new TreeSet<>(res));
//
//        System.out.println(r.get(r.size() - 1));
        
    }
}
