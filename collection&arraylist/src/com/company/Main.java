package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int sayılar[] = new int[3];
        sayılar[0] = 5;
        sayılar[1] = 25;
        sayılar[2] = 15;
        int sayılarım2[] = {5, 9, 78};
        // istediğim veri tipini ekleyebiliryorum
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Veysi");
        arrayList1.add("Ezra");
        arrayList1.add(12);
        arrayList1.add(2.8);
        arrayList1.set(1, "Adil");
        //sadece belli bir veri tipin eklemek istersem eger generic yapıyı kullanıyoruz
        // type guvenmliği saglıyurz <> içersine yazıyoruz
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Şeyma");
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        arrayList3.add(5);


        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("***********");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("***********");

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        System.out.println("*******Poliformizm****");
        ArrayList liste1 = new ArrayList();
        List liste2 = new ArrayList();
        Collection liste3 = new ArrayList();
        System.out.println("***********");
        System.out.println("*******object clasın kulllanımı****");
        for (Object deger : arrayList1) {
            System.out.println(deger);
        }
        System.out.println("***********");

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Turkiye", "Ankara");
        capitalCities.put("England", "Adana");
        System.out.println(capitalCities.get("Turkiye"));
        System.out.println(capitalCities.get("England"));
        System.out.println("*****keySet ile keye gore degeri yakalama******");
        for (String key : capitalCities.keySet()) {
            System.out.println("key: " + key + " value: " + capitalCities.get(key));
        }
        System.out.println("***********");
        System.out.println("*****Value gore degeri yakalama******");
        for (String value : capitalCities.values()) {
            System.out.println(" value: " + value);
        }
        System.out.println("****HashMap start *******");
        HashMap<Integer, String> ogreniciler = new HashMap<Integer, String>();
        ogreniciler.put(123, "Şeyma");
        ogreniciler.put(321, "Naciye");
        ogreniciler.put(741, "Adil");
        //ogreniciler.put(321, "Veysi");
        // şeyma bana 321 nolu ogeren cinin bilgisini getirirmisin?
        System.out.println("HasMap 321 key degeri = "+ogreniciler.get(321));
        System.out.println("****HashMap end *******");
        System.out.println("***** Arraylist listele start ******");

        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("Ali");
        arrayList4.add("Veli");
        arrayList4.add("Deli");
        arrayList4.add("Ali");
        arrayList4.add("Ali");

        for (String isim:arrayList4 ) {
            System.out.println(isim);
        }
        System.out.println("***** Arraylist listele end ******");
        System.out.println("*** HashSet listele start ********");
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("Volvo");
        hashSet1.add("BMW");
        hashSet1.add("Ford");
        hashSet1.add("Volvo");
        hashSet1.add("Volvo");
        for (String deger:hashSet1 ) {
            System.out.println(deger);
        }
        System.out.println("***********volvo silindi****************");
        hashSet1.remove("Volvo");
        for (String deger:hashSet1 ) {
            System.out.println(deger);
        }
        System.out.println("*** HashSet listele end ********");
        System.out.println(hashSet1.contains("Volvo"));
    }
}
