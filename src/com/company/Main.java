package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       // yearCheck(2020);
        //textValidation("jgksdperdfg");


        int [] array = {5,1,2,4,6};
        reverseArray(array);



    }


    public static void yearCheck (int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не являестя високосным");
        }
    }


    public static void mobileOsCheck(int clientOS, int clientDeviceYear){

        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }


    public static int deliveryCard (int deliveryDistance){

        int deliveryDay = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + deliveryDay );
        }else if (deliveryDistance >= 20 && deliveryDistance < 60){
            deliveryDay = 2;
            System.out.println("Потребуется дней: " + deliveryDay );
        }else if (deliveryDistance >= 60 && deliveryDistance < 100){
            deliveryDay = 3;
            System.out.println("Потребуется дней: " + deliveryDay );
        }
        return deliveryDay;


    }

    public static void textValidation (String text){
        for (int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i) == text.charAt(i+1)){
                System.out.println(i + "-й символ задублирован. Это символ " + text.charAt(i) );
                return;
            }
        }
        System.out.println("Дублей нет");
    }

    public static void reverseArray (int[] array){

        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        String printArray = Arrays.toString(array);

        System.out.println(printArray);

    }




}
