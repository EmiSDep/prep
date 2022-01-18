package com.emisdep;

//Given a string, create a new string made up of its last two letters, reversed and seperated by a space.
// " bat " returns "t a"
// string word/returns string

public class LastAndSecondLast {

    public static void solution(String str){
        String word = str.charAt(str.length() - 1) + " " + str.charAt(str.length() - 2);
        System.out.println(word);
    }


}
