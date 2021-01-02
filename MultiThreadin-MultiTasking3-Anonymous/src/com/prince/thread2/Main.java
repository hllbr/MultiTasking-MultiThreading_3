
package com.prince.thread2;
public class Main {
    public static void main(String[] args) {
        /*
        
        burada yapımızın çalışması biraz değişecek tanımlarken Thread printer1 = new Thread(new Printer("printer1")) ifade edebiliriz.
        
        */
          Thread printer1 = new Thread(new PrinterSecond("hllbr1"));
         
          Thread printer2 = new Thread(new PrinterSecond("@prince1"));
          
          printer1.start();
          
          printer2.start();
          
          
          System.out.println("Main Thread Çalışıyor...\n"
                  + "(Printer Second Main)");
          
          
          
          
          
          
        /*Printer printer1 = new Printer("hllbr");
        Printer printer2 = new Printer("@prince");
        printer1.start();
        printer2.start();*/
        
        System.out.println("Main Thread çalışıyor....");
    }
}
