package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
        System.out.println((char) 92);
       String password=file.fileRead("encrypted");
        System.out.println(password);

        System.out.println(cryptography.unCaesarShift(password,5));


        System.out.println(cryptography.unCaesarShiftWithoutKey(password));


 */

        System.out.println((char) 113);
        String temp=cryptography.caesarShift("The red fox jumped over the brown dog",5);

        System.out.println(temp);
       cryptography.unCaesarShift(temp);

 
    }
}
