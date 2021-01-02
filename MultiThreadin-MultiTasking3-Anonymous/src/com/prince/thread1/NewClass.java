
package com.prince.thread1;

public class NewClass {
    public static void main(String[] args) {
      
        Printer printer1 = new Printer("hllbr");
        Printer printer2 = new Printer("@prince");
        //Printer thread classtan türetildiği için printer objeleri kendi içlerinde thread gibi davranacak .run metodu çalıştırıolsın diye start() metodunu kullanıcaz.
        printer1.start();
        printer2.start();
        /*
        şuan 3 threadimiz oluşmuş durumda main threadimiz printer1 ve printer2 
        */
        System.out.println("Main Thread çalışıyor....");
}}

