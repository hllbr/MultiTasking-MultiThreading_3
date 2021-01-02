
package com.prince.thread3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        //ANONYMOUS(anonim class yöntemi ile threadlerimizi oluşturuyoruz)
    /*    Thread printer = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Çalışıyor");
                for(int i = 0 ;i<= 10;i++){
                    try {
                        System.out.println("Yazıyor... : "+i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        printer.start();*/
    
         new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Çalışıyor");
                for(int i = 0 ;i<= 10;i++){
                    try {
                        System.out.println("Yazıyor... : "+i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();//tek bir sefer çalışacak bir thread oluşturduk.Bu Thread başka bir yerde kullanılamayacak
         
        System.out.println("Main Thread Calışıyor");
        
    }
}
