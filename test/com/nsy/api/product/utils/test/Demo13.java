package com.nsy.api.product.utils.test;

/**
 * Description:
 *
 * @Author chenyiling
 * @Date 2022/05/08 8:31 PM
 * @Since 1.0
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2020/11/18
 * Time: 13:46
 * Description:    ???
 */
public class Demo13 {

    public static void main(String[] args) {
        /*
        二叉树也可以用数组来存储
        给定一个数组
        树的根节点的值储存在下标1
        对于储存在下标n的节点，
        他的左子节点和右子节点分别储存在下标2*n和2*n+1
        并且我们用-1代表一个节点为空
        给定一个数组存储的二叉树
        试求从根节点到最小的叶子节点的路径
        路径由节点的值组成

        输入描述
        输入一行为数组的内容
        数组的每个元素都是正整数，元素间用空格分割
        注意第一个元素即为根节点的值
        即数组的第n元素对应下标n
        下标0在树的表示中没有使用
        所以我们省略了
        输入的树最多为7层

        输出描述
         输出从根节点到最小叶子节点的路径上各个节点的值
         由空格分割
         用例保证最小叶子节点只有一个

         例子
          输入
          3 5 7 -1 -1 2 4
          输出
           3 7 2

          例子
           输入
          5 9 8 -1 -1 7 -1 -1 -1 -1 -1 6
           输出
          5 8 7 6
         */

        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split(" ");
        ArrayList<Integer> tree = new ArrayList<>();
        tree.add(Integer.MAX_VALUE);
        for (String s : split) {
            tree.add(Integer.parseInt(s));
        }

        int min = Integer.MAX_VALUE;
        //不算根节点
        for (Integer i : tree) {
            if (i != 0 && i != -1 && i < min && !i.equals(tree.get(1))) min = i;
        }

        int index = tree.indexOf(min);
        ArrayList<String> res = new ArrayList<>();
        res.add(tree.get(index) + "");
        for (int i = index; i > 1; ) {
            if (i % 2 == 0) i = i / 2;
            else i = (i - 1) / 2;
            res.add(tree.get(i) + "");
        }
        StringBuilder builder = new StringBuilder();
        for (int i = res.size() - 1; i >= 0; i--) {
            builder.append(res.get(i)).append(" ");
        }

        System.out.println(builder.substring(0, builder.length() - 1));

        in.close();
    }

}