package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buffer {

    public static void main(String[] args) throws IOException {


        BufferedReader ab = new BufferedReader(new InputStreamReader(System.in));

        String inp = ab.readLine();

        System.out.println("Your Output of buffer reader is :"+inp);


        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        System.out.println("Your value of Scanner is: "+ a);

    }

}
