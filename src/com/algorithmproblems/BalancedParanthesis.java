package com.algorithmproblems;
import java.util.Stack;
import java.util.Scanner;
public class BalancedParanthesis {
    public boolean paranthesis(String str)
    {
        Stack stack = new Stack();
        char charArray[] = str.toCharArray();
        for(int i=0; i<charArray.length;i++)
        {
            char brackets = charArray[i];
            stack.push(brackets);
            System.out.print("The Characters Are : ");
            System.out.println(stack);
        }
        stack.pop();
        if(stack.isEmpty()==false)
            System.out.println("Balanced Paranthesis");
        else
            System.out.println("Un-Balanced Paranthesis");
        return stack.empty();
    }
    public static void main(String[] args)
    {
        BalancedParanthesis object = new BalancedParanthesis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String Value");
        String str = scanner.next();
        object.paranthesis(str);
    }
}
