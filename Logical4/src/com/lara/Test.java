package com.lara;

import java.util.Scanner;

import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        String original = "hello";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
    }
}
