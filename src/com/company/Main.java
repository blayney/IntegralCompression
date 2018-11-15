package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args)throws Exception {
        //creates hash map for letters of the alphabet:
        HashMap<String, Integer> hashMap = new HashMap<>();
                    hashMap.put("a", 0);
                    hashMap.put("b", 1);
                    hashMap.put("c", 2);
                    hashMap.put("d", 3);
                    hashMap.put("e", 4);
                    hashMap.put("f", 5);
                    hashMap.put("g", 6);
                    hashMap.put("h", 7);
                    hashMap.put("i", 8);
                    hashMap.put("j", 9);
                    hashMap.put("k", 10);
                    hashMap.put("l", 11);
                    hashMap.put("m", 12);
                    hashMap.put("n", 13);
                    hashMap.put("o", 14);
                    hashMap.put("p", 15);
                    hashMap.put("q", 16);
                    hashMap.put("r", 17);
                    hashMap.put("s", 18);
                    hashMap.put("t", 19);
                    hashMap.put("u", 20);
                    hashMap.put("v", 21);
                    hashMap.put("w", 22);
                    hashMap.put("x", 23);
                    hashMap.put("y", 24);
                    hashMap.put("z", 25);
                    hashMap.put(" ", 26);
        System.out.println("Compression Algorithm - Generate");
	    System.out.println("ID's the most efficient way of segregating the array.");
	    System.out.println("Slowest compression protocol in the west");
        // assigns a new file directory to file type file, called file
        File file = new File("C:\\Users\\WBlayney\\IdeaProjects\\Integral Compression\\src\\com\\company\\input.txt");
        // creates new bufferedReader object called br and assigns it to read type file
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(file);
        // we just need to use \\Z as delimiter
        sc.useDelimiter("\\Z");
        String input = sc.next();
        input = input.toLowerCase();
        analysis an = new analysis();
        //the following code checks how many times each letter appears in the input file
            int[] counter = new int[29];
            char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
            for(int j=0; j<alphabet.length; j++ ) {
                counter[j] = 0;
                for(int h=0; h<input.length(); h++){
                    if(input.charAt(h)==alphabet[j]){
                        counter[j]++;
                    }
                }
                System.out.println("Letter " + alphabet[j] + " has been found " + counter[j] + " times");
            }
            char[] query = new char[2];
            int[][] resultsTable = new int[28][28];
            for(int k=0; k<alphabet.length; k++ ) {
                query[0] = alphabet[k];
                for(int l = 0; l< alphabet.length; l++){
                    query[1] = alphabet[l];
                    for(int m=0; m<input.length()-1; m++){
                        if((input.charAt(m)==query[0])&&(input.charAt(m+1)==query[1])){
                            resultsTable[k][l] ++;
                            /*System.out.println("input characters are " + query[0] + query[1]);
                            System.out.println("Found characters are " + input.charAt(m) + input.charAt(m+1));
                            System.out.println(k);
                            System.out.println(l);
                            System.out.println(resultsTable[k][l]);*/
                        }
                    }
                }

            }
                    // search function
        Scanner in = new Scanner(System.in);
                System.out.print("Please enter a first letter: ");
                String letterOne = in.next();
                System.out.print("Please enter a second letter: ");
                String letterTwo = in.next();
                int x = hashMap.get(letterOne);
                int y = hashMap.get(letterTwo);
                System.out.println("Letters "+ alphabet[x] + alphabet[y] + " Appear together " +  resultsTable[x][y] + " times");

              /*    Any distributive function's a goal, ammirite???
                 GOALS:
                    calculate probability that four letters appear next to each other - if above certain p, then tokenize them
                    after they've been tokenized, replace all instances of that combination with compressed version of the string

                    then go through and do the same for three letter collisions. the threshold should be slightly higher than p1 in the
                    first function. again, replace all instances with the compressed version of the string

                    then do the same thing for two letter combinations, with an even higher p value threshold. Replace all instances.

                    Save the dictionary (hash map) to a separate file in a readable format for the decompressor.

                    Calculate the file size delta. calculate the compression ratio as a function of the size of the file.

                    Write a decompressor using the saved dictionary

                    EXTRAS

                    Generate graphs to show the distributions of collisions in the set.
                    Prove the tokens generated are the most efficient tokens for the set based using binomial distribution.

                    integrate the function into the ORPTLIS protocol
                 */

    }
}
