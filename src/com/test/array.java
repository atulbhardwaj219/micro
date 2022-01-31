package com.test;

import java.util.*;

public class array {

    public static void main(String[] args){

        String[]  abc = new String[3];
        abc[1] = "sv";
        System.out.println(abc[1]);

        List<String> array = new ArrayList<String>();
        array.add("ab");
        array.add("cd");
        array.add("vf");
        array.add("cd");
        array.add("cd");
        array.add("cd");
        array.add("cd");array.add("cd");
        array.add("ef");

        HashSet<String> arr = new LinkedHashSet<String>();

        arr.addAll(array);

        Iterator<String> it = arr.iterator();

        System.out.println(
                "Iterate HashSet using iterator : ");

        // Iterate HashSet with the help of hasNext() and
        // next() method
        while (it.hasNext()) {

            // Print HashSet values
            System.out.println(it.next() + " ");
        }

       // int x=20;

        //String ans = (x < 15) ? "Small" : (x < 22)? "Medium" : "Large";

       // System.out.println(ans);


        int x= 0;

        int y= 0;

        for (int z = 0; z < 5; z++)

        {

            if (( ++x > 2 ) && (++y > 2))

            {

                x++;

            }

        }

        System.out.println(x + " " + y);

        int ardr[] = { 65, 66, 67, 68};

        String t = new String(ardr, 1, 3);

        System.out.println(t);

        }






    }


