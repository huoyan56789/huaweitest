package com.nsy.api.product.utils.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2020/11/18
 * Time: 13:46
 * Description:     二叉树也可以用数组来存储，
 给定一个数组，树的根节点的值储存在下标1，
 对于储存在下标n的节点，他的左子节点和右子节点分别储存在下标2*n和2*n+1，
 并且我们用-1代表一个节点为空，
 给定一个数组存储的二叉树，
 试求从根节点到最小的叶子节点的路径，
 路径由节点的值组成。
 */
public class Demo12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String treeStr = scanner.nextLine();
            solution(treeStr);
        }
    }

    private static void solution(String treeStr) {
        String[] split = ("0 " + treeStr).split(" ");
        int min = Integer.MAX_VALUE;
        int minPos = 0;
        //不算根节点  ，记录最小数所在位置
        for (int i = 2; i < split.length; i++) {
            int tmp = Integer.parseInt(split[i]);
            if (tmp != 0 && tmp != -1 && tmp < min) {
                min = tmp;
                minPos = i;
            }
        }
        List<String> path = new ArrayList<>();
        back(split, minPos, path);

        for (int i = path.size() - 1; i >= 0; i--) {
            System.out.print(path.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }

    }

    private static void back(String[] split, int minPos, List<String> path) {
        path.add(split[minPos]);
        if (minPos == 1) {
            return;
        }
        if (minPos % 2 == 0) {
            back(split, minPos / 2, path);
        } else {
            back(split, (minPos - 1) / 2, path);
        }
    }
}