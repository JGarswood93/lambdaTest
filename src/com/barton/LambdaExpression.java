package com.barton;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("Joel");
        list.add("Jack");
        list.add("Alek");
        list.add("Mike");

        list.forEach(
                (n)-> System.out.println(n)
        );
        /**
         * Testing the ordering of an arraylist
         */
    }
}
