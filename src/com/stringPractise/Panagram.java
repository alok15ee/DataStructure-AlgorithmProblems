package com.stringPractise;

import java.util.ArrayList;



public class Panagram {
    public Panagram() {
    }

    public void findPanagram(String input){
        //Integer[] resultArray = new Integer[26];
        ArrayList<Character> resultArray = new ArrayList<Character>();

        input = input.replaceAll("\\s+", "").toUpperCase();
        Integer length = input.length();
        if (length < 26){
            System.out.println("Not a panagram");
            System.exit(0);
        }
        for (int i= 0; i < length; i++ ){

        System.out.println(input.charAt(i));

                    boolean blnFound = resultArray.contains(input.charAt(i));

        System.out.println(blnFound);

                    if (blnFound == false){
        System.out.println("Adding" +i);

                resultArray.add(input.charAt(i));
            }


        }

        for (Character temp : resultArray) {
            System.out.println(temp);
        }
        System.out.println(resultArray.size());
        if (resultArray.size() == 26){
            System.out.println("A panagram");
        }else {
            System.out.println("Not a panagram");
        }

    }
}
