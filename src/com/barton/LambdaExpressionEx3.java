package com.barton;

public class LambdaExpressionEx3 {
    public static void main(String[] args) {
        Sayable s=()->{
          return "I have a world of things to say";
        };
        System.out.println(s.say());
    }
}
