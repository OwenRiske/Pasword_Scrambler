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
        ArrayList<Character> saveChar=new ArrayList();
        ArrayList<Integer> charCount=new ArrayList();

        char[] chars=input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < saveChar.size(); j++) {
                if(saveChar.get(j)==chars[i]){
                    charCount.set(j, charCount.get(j)+1);
                }
                if(j==saveChar.size()){
                    saveChar.add(chars[i]);
                    charCount.add(1);
                }
            }
        }

        int most=0;
        char output=' ';
        for (int j = 0; j < charCount.size(); j++) {
            if(charCount.get(j)>most){
                most=charCount.get(j);
                output=saveChar.get(j);
            }
        }
        System.out.println("hi");
        return output;

    }
}
