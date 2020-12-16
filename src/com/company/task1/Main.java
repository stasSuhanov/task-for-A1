package com.company.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        Long number;
        Scanner in = new Scanner(System.in);
        System.out.println("1. из цифр в адрес || 2. из адреса в цифры");
        System.out.println("введите число");
        choice = in.nextInt();
        switch (choice){
            case 1:
                String counter = "";
                System.out.println("введите число");
                number = in.nextLong();
                String binary = Long.toBinaryString(number);
                if(binary.length()<33){
                    int count = 32 - binary.length();
                    for(int i = 0; i < count;i++){
                        counter =counter + "0";
                    }
                }
                String binaryPlus = counter + binary;
                String str1 = binaryPlus.substring(0,8);
                String str2 = binaryPlus.substring(8,16);
                String str3 = binaryPlus.substring(16,24);
                String str4 = binaryPlus.substring(24);
                System.out.println("ваш IP: "+Integer.parseInt(str1, 2)+"."+Integer.parseInt(str2, 2)+"."+Integer.parseInt(str3, 2)+"."+Integer.parseInt(str4, 2));
                break;
            case 2:
                String counter1 = "";
                String counter2 = "";
                String counter3 = "";
                String counter4 = "";
                int num1;
                int num2;
                int num3;
                int num4;
                System.out.println("введите 4 числа по очереди");
                System.out.println("введите 1 число");
                num1 = in.nextInt();
                System.out.println("введите 2 число");
                num2 = in.nextInt();
                System.out.println("введите 3 число");
                num3 = in.nextInt();
                System.out.println("введите 4 число");
                num4 = in.nextInt();
                System.out.println("ваш Ip: "+num1+"."+num2+"."+num3+"."+num4);
                String binary1 = Integer.toBinaryString(num1);
                if(binary1.length()<8){
                    int count = 8 - binary1.length();
                    for(int i = 0; i < count;i++){
                        counter1 =counter1 + "0";
                    }
                }
                String binary1Full = counter1 + binary1;
                String binary2 = Integer.toBinaryString(num2);
                if(binary2.length()<8){
                    int count = 8 - binary2.length();
                    for(int i = 0; i < count;i++){
                        counter2 =counter2 + "0";
                    }
                }
                String binary2Full = counter2 + binary2;
                String binary3 = Integer.toBinaryString(num3);
                if(binary3.length()<8){
                    int count = 8 - binary3.length();
                    for(int i = 0; i < count;i++){
                        counter3 =counter3 + "0";
                    }
                }
                String binary3Full = counter3 + binary3;
                String binary4 = Integer.toBinaryString(num4);
                if(binary4.length()<8){
                    int count = 8 - binary4.length();
                    for(int i = 0; i < count;i++){
                        counter4 =counter4 + "0";
                    }
                }
                String binary4Full = counter4 + binary4;
                String binaryBig = binary1Full + binary2Full + binary3Full + binary4Full;
                System.out.println(Long.parseLong(binaryBig, 2));
                break;
        }
    }
}
