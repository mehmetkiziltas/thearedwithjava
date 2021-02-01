
package threaddeene4;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YiyecekIcecek {
    
        ArrayList BirinciKonukPastaSayisi = new ArrayList();
        ArrayList BirinciKonukBorekSayisi = new ArrayList();
        ArrayList BirinciKonukIcecekSayisi = new ArrayList();
        
        ArrayList IkinciKonukPastaSayisi = new ArrayList();
        ArrayList IkinciKonukBorekSayisi = new ArrayList();
        ArrayList IkinciKonukIcecekSayisi = new ArrayList();
        
        ArrayList UcuncuKonukPastaSayisi = new ArrayList();
        ArrayList UcuncuKonukBorekSayisi = new ArrayList();
        ArrayList UcuncuKonukIcecekSayisi = new ArrayList();
        
        ArrayList DortduncuKonukPastaSayisi = new ArrayList();
        ArrayList DortduncuKonukBorekSayisi = new ArrayList();
        ArrayList DortduncuKonukIcecekSayisi = new ArrayList();
        
        ArrayList BesinciKonukPastaSayisi = new ArrayList();
        ArrayList BesinciKonukBorekSayisi = new ArrayList();
        ArrayList BesinciKonukIcecekSayisi = new ArrayList();
        
        ArrayList AltinciKonukPastaSayisi = new ArrayList();
        ArrayList AltinciKonukBorekSayisi = new ArrayList();
        ArrayList AltinciKonukIcecekSayisi = new ArrayList();
        
        ArrayList YedinciKonukPastaSayisi = new ArrayList();
        ArrayList YedinciKonukBorekSayisi = new ArrayList();
        ArrayList YedinciKonukIcecekSayisi = new ArrayList();
        
        ArrayList SekizinciKonukPastaSayisi = new ArrayList();
        ArrayList SekizinciKonukBorekSayisi = new ArrayList();
        ArrayList SekizinciKonukIcecekSayisi = new ArrayList();
        
        ArrayList DokuzuncuKonukPastaSayisi = new ArrayList();
        ArrayList DokuzuncuKonukBorekSayisi = new ArrayList();
        ArrayList DokuzuncuKonukIcecekSayisi = new ArrayList();
        
        ArrayList OnuncuKonukPastaSayisi = new ArrayList();
        ArrayList OnuncuKonukBorekSayisi = new ArrayList();
        ArrayList OnuncucuKonukIcecekSayisi = new ArrayList();
    
        Random random = new Random();
        
        Integer bekle = random.nextInt(1000);


        //Tapsidedi yiyecek İçeçek Sayısını tutma
        BlockingQueue<Integer> queueP = new ArrayBlockingQueue<Integer>(5);
        BlockingQueue<Integer> queueB = new ArrayBlockingQueue<Integer>(5);
        BlockingQueue<Integer> queueI = new ArrayBlockingQueue<Integer>(5);
        
        public int queuePSayisi = 15;
        public int queueBSayisi = 30;
        public int queueISayisi = 30;
    
    public void Ekle(){
        while (true) {
            if (queueP.size() <= 4) {
                try {
                    Thread.sleep(bekle);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                if (queueP.size() < 5) {
                    Integer value = random.nextInt(100);
                    try {
                        if (queuePSayisi != 0) {
                            queuePSayisi--;

                            queueP.put(value);
                            System.out.println(Thread.currentThread().getName() + " Tepsiye pasta ekliyor. Eklenen Pasta Sayısıdır : " + queueP.size());
                            System.out.println("Toplam Pasta Kaldı : " + queuePSayisi);
                        }

                    } catch (InterruptedException ex) {
                        Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
            if (queueB.size() <= 4) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (queueB.size() < 5) {
                    Integer value = random.nextInt(100);
                    try {
                        if (queueBSayisi != 0) {
                            queueBSayisi--;
                            queueB.put(value);
                            System.out.println(Thread.currentThread().getName() + " Tepsiye Borek ekliyor. Eklenen Borek Sayısıdır : " + queueB.size());
                            System.out.println("Toplam Borek Kaldı : " + queueBSayisi);

                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                }
            }
            if (queueI.size() <= 4) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (queueI.size() < 5) {
                    Integer value = random.nextInt(100);
                    try {
                        if (queueISayisi != 0) {
                            queueISayisi--;
                            queueI.put(value);
                             System.out.println(Thread.currentThread().getName() + " Tepsiye İcecek ekliyor. Eklenen İcecek Sayısıdır : " + queueI.size());
                            System.out.println("Toplam İçeçek Kaldı : " + queueISayisi);

                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
            if (queueBSayisi + queueISayisi + queuePSayisi == 0) {
                break;
            }
        }
    }
    Integer sayisi = random.nextInt(100);
    public void PastaYe(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (queueP.size() > 0) {
            try {
                queueP.take();
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(Thread.currentThread().getName() + " Pasta Yedi Kalan Pasta : " + queueP.size());
            if (Thread.currentThread().getName().equals("Birinci Konuk")) {
                    BirinciKonukPastaSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + BirinciKonukPastaSayisi.size());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                } 
            else if(Thread.currentThread().getName().equals("İkinci Konuk")){
                IkinciKonukPastaSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + IkinciKonukPastaSayisi.size());
                try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if(Thread.currentThread().getName().equals("Üçüncü Konuk")){
                UcuncuKonukPastaSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + UcuncuKonukPastaSayisi.size());
                try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if(Thread.currentThread().getName().equals("Dördüncü Konuk")){
                DortduncuKonukPastaSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + DortduncuKonukPastaSayisi.size());
                try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if(Thread.currentThread().getName().equals("Beşinci Konuk")){
                BesinciKonukPastaSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + BesinciKonukPastaSayisi.size());
                try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if(Thread.currentThread().getName().equals("Altıncı Konuk")){
                AltinciKonukPastaSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + AltinciKonukPastaSayisi.size());
                try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if(Thread.currentThread().getName().equals("Yedinci Konuk")){
                YedinciKonukPastaSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + YedinciKonukPastaSayisi.size());
                try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if(Thread.currentThread().getName().equals("Sekizinci Konuk")){
                SekizinciKonukPastaSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + SekizinciKonukPastaSayisi.size());
                try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if(Thread.currentThread().getName().equals("Dokuzuncu Konuk")){
                DokuzuncuKonukPastaSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + DokuzuncuKonukPastaSayisi.size());
                try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else{
                OnuncuKonukPastaSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Pasta Yadi " + OnuncuKonukPastaSayisi.size());
                try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
        
    }
    public void BorekYe(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (queueB.size() > 0) {
            try {
                queueB.take();
                Thread.sleep(5000);
                //System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi");
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(Thread.currentThread().getName() + " Borek Yedi. Kalan Borek : " + queueB.size());
            if (Thread.currentThread().getName().equals("Birinci Konuk")) {
                    BirinciKonukBorekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + BirinciKonukBorekSayisi.size());
                    try {
                    Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    } 
            else if(Thread.currentThread().getName().equals("İkinci Konuk")){
                IkinciKonukBorekSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + IkinciKonukBorekSayisi.size());
                try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            else if(Thread.currentThread().getName().equals("Üçüncü Konuk")){
                UcuncuKonukBorekSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + UcuncuKonukBorekSayisi.size());
                try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            else if(Thread.currentThread().getName().equals("Dördüncü Konuk")){
                DortduncuKonukBorekSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + DortduncuKonukBorekSayisi.size());
                try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            else if(Thread.currentThread().getName().equals("Beşinci Konuk")){
                BesinciKonukBorekSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + BesinciKonukBorekSayisi.size());
                try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            else if(Thread.currentThread().getName().equals("Altıncı Konuk")){
                AltinciKonukBorekSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + AltinciKonukBorekSayisi.size());
                try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            else if(Thread.currentThread().getName().equals("Yedinci Konuk")){
                YedinciKonukBorekSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + YedinciKonukBorekSayisi.size());
                try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            else if(Thread.currentThread().getName().equals("Sekizinci Konuk")){
                SekizinciKonukBorekSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + SekizinciKonukBorekSayisi.size());
                try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            else if(Thread.currentThread().getName().equals("Dokuzuncu Konuk")){
                DokuzuncuKonukBorekSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + DokuzuncuKonukBorekSayisi.size());
                try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                OnuncuKonukBorekSayisi.add(sayisi);
                System.out.println(Thread.currentThread().getName() + " Tane Borek Yedi " + OnuncuKonukBorekSayisi.size());
                try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
    }
    public void IcecekIc(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (queueI.size() > 0) {
            try {
                queueI.take();
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(Thread.currentThread().getName() + " İcecek Yedi. Kalan icecek : " + queueI.size());
            if (Thread.currentThread().getName().equals("Birinci Konuk")) {
                    BirinciKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + BirinciKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                } 
                else if(Thread.currentThread().getName().equals("İkinci Konuk")){
                    IkinciKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + IkinciKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                else if(Thread.currentThread().getName().equals("Üçüncü Konuk")){
                    UcuncuKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + UcuncuKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                else if(Thread.currentThread().getName().equals("Dördüncü Konuk")){
                    DortduncuKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + DortduncuKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                else if(Thread.currentThread().getName().equals("Beşinci Konuk")){
                    BesinciKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + BesinciKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                else if(Thread.currentThread().getName().equals("Altıncı Konuk")){
                    AltinciKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + AltinciKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                else if(Thread.currentThread().getName().equals("Yedinci Konuk")){
                    YedinciKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + YedinciKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                else if(Thread.currentThread().getName().equals("Sekizinci Konuk")){
                    SekizinciKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + SekizinciKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                else if(Thread.currentThread().getName().equals("Dokuzuncu Konuk")){
                    DokuzuncuKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + DokuzuncuKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                else{
                    OnuncucuKonukIcecekSayisi.add(sayisi);
                    System.out.println(Thread.currentThread().getName() + " Tane İçeçek İçti." + OnuncucuKonukIcecekSayisi.size());
                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YiyecekIcecek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
        }
    }
}
/*                            int digerKonukBorekSayisi = iy.IkinciKonukBorekSayisi.size() + iy.UcuncuKonukBorekSayisi.size() +
                                    iy.DortduncuKonukBorekSayisi.size() +iy.BesinciKonukBorekSayisi.size() +
                                    iy.AltinciKonukBorekSayisi.size() +iy.YedinciKonukBorekSayisi.size() +iy.SekizinciKonukBorekSayisi.size() +
                                    iy.DokuzuncuKonukBorekSayisi.size() +  iy.OnuncuKonukBorekSayisi.size();
*/