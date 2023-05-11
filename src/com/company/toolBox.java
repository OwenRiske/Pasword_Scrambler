package com.company;

import java.util.ArrayList;

public class toolBox {

    public static int[] stringToIntArray(String input){
        char[] chars=input.toCharArray();
        int[] output=new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            output[i]=(int) chars[i];
        }
        return output;
    }

    public static int mostCommonNuminArray(int[] array){
        int mostCommon=array[0];
        int count=0;
        for (int i = 0; i < array.length; i++) {
            int tempCount=countNumInArray(array,array[i]);
            System.out.println((char)array[i]+"  "+tempCount);
            if(tempCount>count && mostCommon==32){
                mostCommon=array[i];
                count=tempCount;
            }

        }

        return mostCommon;
    }

    public static int countNumInArray(int[] array, int numToBeCounted){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==numToBeCounted){
                count++;
            }
        }
        return count;
    }

    public static String removeFromString(String input, String toBeRemoved){
        return input.replace(toBeRemoved,"");
    }

    public static char mostCommonCharacterInString(String input){
        

    }
}
