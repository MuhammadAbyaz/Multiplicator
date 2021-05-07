package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number whose multiplication is required: ");
        number = sc.nextInt();
        if(number < 1 || number > 1000000)
            break;
        else
        for(int i = 1; i <=10 ; i++){
            System.out.println(number + " * " + i +" = " + i*number);
        }
        }
    }
}
