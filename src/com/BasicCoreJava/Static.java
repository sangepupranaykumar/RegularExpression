package com.BasicCoreJava;

public class Static {

        static int a = 9;
        static int b = 7;
        static int add()
        {
            return a+b;
        }

    public static void main(String[] args) {
        Static obj = new Static();
        System.out.println("Output is = "+obj.add());
    }
    }
