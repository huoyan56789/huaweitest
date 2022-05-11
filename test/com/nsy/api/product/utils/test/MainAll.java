package com.nsy.api.product.utils.test;

/**
 * Description:
 *
 * @Author chenyiling
 * @Date 2022/05/07 10:52 PM
 * @Since 1.0
 */
public class MainAll
{
    public static void main(String[] args)
    {
        String[] stringlist = {"3,3,7,4,4,4,4,7"};
        String string = "1234567";
        //a到z的ASCII代码分别是097到122
        //大写字符A到Z的ASCII代码分别是065到090
        String out=string.substring(1);  //234567
        String o1=string.substring(0,1);  //1
        
        System.out.println(out);
        /**
         * toIntList 整数转列表
         * map.stream.sort.filter.map.forEach
         *  list.sort(Integer::compareTo);
         */
        Main105.main(stringlist);
        Main105.toIntList(string);
        
        /**
         * Main104 A、Ctrl-C、Ctrl-X、Ctrl-V、Ctrl-A
         * switch case builder.replace
         */
        Main104.main(stringlist);

        /**
         * 输入
         4589,101,41425,9999
         输出
         9999458941425101
         Arrays.stream(nums.split(",")).sort.forEach(builder::append);
         char2.compareTo(char1)
         */

         Main103.main(stringlist);
        /**
         * 　输入：
         bb12-34aa
         　输出：
         -31
         说明：1+2-(34)=-31
         Character.isDigit(chars[i]), sum += Character.digit(c, 10)
         */
        Main96.main(stringlist);
        /**  双排序，由小到大，用对象，序号+体重+身高
         *  输入:
         4
         100 100 120 130
         40 30 60 50
         输出:
         2134
         */
        Main93.main(stringlist);
        /**  123 结果相乘，排序找？？？
         *  输入:
         3
         3
         输出：
         213
         说明
         3的排列有123,132,213...,那么第三位置就是213
         */
        Main92.main(stringlist);
        /**   时间换算并排序
         * 输入
         2
         22:41:08.023
         22:41:08.23
         输出
         22:41:08.023
         22:41:08.23
         时间相同保持输入顺序
         */
        Main90.main(stringlist);
        /**
         * 
         */
        Main89.main(stringlist);
        Main88.main(stringlist);
        Main87.main(stringlist);
        Main85.main(stringlist);
        Main82.main(stringlist);
        Main81.main(stringlist);
        Main78.main(stringlist);
        Main77.main(stringlist);
        Main76.main(stringlist);
        Main74.main(stringlist);
        Main73.main(stringlist);
        Main72.main(stringlist);
        Main67.main(stringlist);
        Main60.main(stringlist);
        Main58.main(stringlist);
        Main57.main(stringlist);
        Main55.main(stringlist);
        Main54.main(stringlist);
        Main51.main(stringlist);
        Main50.main(stringlist);
        Main48.main(stringlist);
        Main47.main(stringlist);

    }
}
