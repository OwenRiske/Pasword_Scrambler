package com.company;

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
        char[] temp=input.toCharArray();
        int[] save= new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            save[i]=temp[i];
        }
        int key= 101-toolBox.mostCommonNuminArray(save);
        System.out.println(key+101);


        System.out.println(key);
        return unCaesarShift(input,key);

    }




}
