//Kendi Threadimizi oluşturmamız için kullandığımız yöntemlerden biri = 
package com.prince.thread1;
//bu class bir başka classtan extends ederek bir thread class oluşturmak istiyoruz

import java.util.logging.Level;
import java.util.logging.Logger;

public class Printer extends Thread{//Bu yapının thread gibi davranması isteniyorsa bir metodu override etmek gerekiyor.(run metodu)
    private String isim ;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
      //bu alan sayesinde yapı bir thread gibi çalışacak 
      //printer classtan üretilen obje bir thread gibi çalışacak 
        System.out.println(isim+" çaşılıyor....");
        for(int i = 0;i<10;i++){
            try {
                System.out.println(isim+" yazıyor : "+ i);
                
                Thread.sleep(1000);//thread.sleep() metodu static bir metoddur.İçerisine milisaniye cinsinden veri giriyoruz.
            } catch (InterruptedException ex) {
                System.out.println("Thread Kesintiye Uğradı");
            }
        }
        System.out.println(isim+ " işini bitirdi");
        //bu alanda kurulan yapı sayesinde printer class bir thread gibi kullanılmış olacak thread başlatıldığında direkt run metodu çalışacak
    }
    
}
