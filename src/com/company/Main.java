package com.company;

public class Main {
    public static void main(String[] args) {
        int i =1;
        while(i<=10){
            int j = 1;
            while(j<=10){
                System.out.println(j+"x"+i+"="+j*i+"\t");
                j++;

            }
            System.out.println();
            i++;
        }
    }


}
