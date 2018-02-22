// Joseph Htet
// CS 212 - Homework 1 

import java.util.Scanner;

public class Homework1 {

    public static String getStars(int n) {
        char star = '*';
        String result = "";

        for (int i=0; i<n; i++) {
            result += star;
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        int numStars[] = new int[5]; // array for storing number of stars for each store
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<5; i++) {
            System.out.println("Enter today's sales for store " + (i+1) + ":");
            numStars[i] = (int) sc.nextFloat() /100;  // takes float input and converts to int (downcasted) /100
        }
       
        sc.close();
        
        System.out.println("SALES BAR CHART \n");
        
        for(int i=0; i<5; i++) {
            System.out.println("Store " + (i+1) + ": " + getStars(numStars[i]));
        }
    }
}

