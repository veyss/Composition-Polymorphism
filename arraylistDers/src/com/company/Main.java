package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*
        int sayılarım[] = new int[3];
        sayılarım[0] = 15;
        sayılarım[1] = 65;
        sayılarım[2] = 35;
        // sayılarım[3]=45;
        int sayılarım1[] = new int[4];
        for (int i = 0; i < sayılarım.length; i++) {
            //System.out.println(sayılarım[i]);
            sayılarım1[i] = sayılarım[i];
        }
        System.out.println("*********");
        System.out.println("Array sıralanmamıs");
        for (int value:sayılarım ) {
            System.out.println(value);
        }
        System.out.println("*********");
        Arrays.sort(sayılarım);
        System.out.println("Array sıralanmıs");
        for (int value:sayılarım ) {
            System.out.println(value);
        }
        sayılarım1[3] = 35;


/*
//swap
        int sayılarım4[] = new int[3];
        sayılarım4[0] = 15;
        sayılarım4[1] = 25;
        int temp = sayılarım4[1];
        sayılarım4[1] = 35;
        sayılarım4[2] = temp;
*/

//generic yapı tip gunenligi saglıyour < > arasındaki tip
        ArrayList<Integer> sayılarım2 = new ArrayList<Integer>();
        sayılarım2.add(15);
        sayılarım2.add(5);
        sayılarım2.add(8);
        System.out.println("eski index 1 degeri = " + sayılarım2.get(1));
        sayılarım2.add(1, 45);
        System.out.println("yeni index 1 degeri = " + sayılarım2.get(1));

        System.out.println("arraylistin buyuklugu = " + sayılarım2.size());
        System.out.println("*********");
        for (int i = 0; i < sayılarım2.size(); i++) {
            System.out.println(sayılarım2.get(i));
        }
        System.out.println("*********");

        Collections.sort(sayılarım2);

        System.out.println("*********");
        for (int i = 0; i < sayılarım2.size(); i++) {
            System.out.println(sayılarım2.get(i));
        }
        System.out.println("*********");
        sayılarım2.remove(1);
        System.out.println("****8 silindi*****");
        for (int i = 0; i < sayılarım2.size(); i++) {
            System.out.println(sayılarım2.get(i));
        }
        System.out.println("*********");

        sayılarım2.clear();
        System.out.println("****Hepsi silindi*****");
        for (int i = 0; i < sayılarım2.size(); i++) {
            System.out.println(sayılarım2.get(i));
        }
        System.out.println("*********");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String car: cars ) {
            System.out.println(car);
        }

        System.out.println("*************");
        ArrayList test = new ArrayList();
        test.add(5);
        test.add("Bugra");
        test.add(true);
        for (int i = 0; i <test.size() ; i++) {
            System.out.println(test.get(i));
        }
        System.out.println("*************");
        for (Object value: test ) {
            System.out.println(value);
        }
    }
}
