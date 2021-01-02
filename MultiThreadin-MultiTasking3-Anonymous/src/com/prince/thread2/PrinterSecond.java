//Kendi Threadimizi oluşturmamız için kullandığımız yöntemlerden ikincisi = 
//Burada Thread classından extends etmeden bu yapıyı thread olarak tasarlamaya ve çalışır duruma getirmeye gayret edicez
//bir classı eğer thread olarak kullanmak istiyorsak Runnable Interface implemente edersek  ve bu yapının içerisindeki run metodunu override edersek yapıyı direkt oalrak thread olarak kullanılabilir hale getirmiş oluruz.
package com.prince.thread2;


public class PrinterSecond implements Runnable{
    private String isim;

    public PrinterSecond(String isim) {
        this.isim = isim;
    }
    
    @Override
    public void run() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
    
    
    }
    
}
