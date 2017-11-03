package com.company;

public class IHATETHISCLASS {
    public static void main(String[] args) {

        int happens = 0;
        int nothap = 0;

        for(int i = 0; i < 20; i++){

            System.out.println(i+ " ");
            if(Math.random()*100 >= 50){
                System.out.println("happen");
                happens++;
            }
            else{
                System.out.println("nothappens");
                nothap++;
            }
        }
        System.out.println((double) happens / 20.0);
    }
}
