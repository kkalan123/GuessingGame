package com.AlJaJo;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the best guessing game on the planet");
        int answer_count = 1;
        int answer = new Random().nextInt(100);
        System.out.println("Guess " + answer_count + ":");


        System.out.println(answer);

    }
}
