package com.company;

import java.util.ArrayList;

public class cryptography {
    public static String caesarShift(String password, int key){
        char[] passwordChars=password.toCharArray();
        for (int i = 0; i < passwordChars.length; i++) {
            if((int) passwordChars[i] != 32) {
                passwordChars[i] = (char) ((int) passwordChars[i] + key);
            }
        }
        return String.valueOf(passwordChars);
    }

    public static String unCaesarShift(String scrambledPassword, int key){
        return caesarShift(scrambledPassword,-key);
    }

    public static String unCaesarShift(String input){
        int key= (int) toolBox.mostCommonCharacterInString(input)-101;
        System.out.println(key);

        return unCaesarShift(input,key);

    }




}
