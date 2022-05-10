package com.nsy.api.product.utils.test;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.Stack;

/**
 * Description:
 *
 * @Author chenyiling
 * @Date 2022/05/09 5:30 PM
 * @Since 1.0
 */
public class Demo
{
    public static void main(String[] args)
    {

        String s = "([]{})";
        s = s.replace("()", "");
        System.out.println(isValid("(((("));
        System.out.println(isValid("([]{})"));
        
    }
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }
}
