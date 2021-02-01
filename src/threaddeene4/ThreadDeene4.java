
package threaddeene4;

import java.awt.HeadlessException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class ThreadDeene4 {

    public static void main(String[] args) {
      
        
        YiyecekIcecek iy = new YiyecekIcecek();
        
        
        Thread Asci = new Thread(new Runnable() {
            
            @Override
            public void run() {
             
                iy.Ekle();
            }
        });
        
        Thread BirinciKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                
                while (true) {
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.BirinciKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.BirinciKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                           //System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.BirinciKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.BirinciKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                           // System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.BirinciKonukIcecekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.BirinciKonukIcecekSayisi.size() < 5) {
                                iy.IcecekIc();
                            }
                            //System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });
        
    Thread IkinciKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {                    
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.IkinciKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.IkinciKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                           //System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.IkinciKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.IkinciKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                            //System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.IkinciKonukIcecekSayisi.size() >= 2) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.IkinciKonukIcecekSayisi.size() < 5) {
                                iy.IcecekIc();
                            }
                            //System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });
        Thread UcuncuKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {                    
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.UcuncuKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.UcuncuKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                           //System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.UcuncuKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.UcuncuKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                           // System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.UcuncuKonukIcecekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.UcuncuKonukIcecekSayisi.size() < 5) {
                                iy.IcecekIc();
                            }
                           // System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });
        Thread DorduncuKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {                    
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.DortduncuKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.DortduncuKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                          // System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.DortduncuKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.DortduncuKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                            //System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.DortduncuKonukIcecekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.DortduncuKonukPastaSayisi.size() < 5) {
                                iy.IcecekIc();
                            }
                            //System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });
        Thread BesinciKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {                    
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.BesinciKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.BesinciKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                           //System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.BesinciKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.BesinciKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                            //System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.BesinciKonukIcecekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.BesinciKonukIcecekSayisi.size() < 5) {
                                iy.IcecekIc();
                            }
                            //System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });
        Thread AltinciKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {                    
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.AltinciKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.AltinciKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                           //System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.AltinciKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.AltinciKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                            //System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.AltinciKonukIcecekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.AltinciKonukIcecekSayisi.size() < 5) {
                                iy.IcecekIc();
                            }
                            //System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });
        Thread YedinciKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {                    
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.YedinciKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.YedinciKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                          // System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.YedinciKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.YedinciKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                           // System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.YedinciKonukIcecekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.YedinciKonukIcecekSayisi.size() < 5) {
                                iy.IcecekIc();
                            }
                           // System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });
        Thread SekizinciKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {                    
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.SekizinciKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.SekizinciKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                           //System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.SekizinciKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.SekizinciKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                           // System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.SekizinciKonukIcecekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.SekizinciKonukIcecekSayisi.size() < 2) {
                                iy.IcecekIc();
                            }
                           // System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });
        Thread DokuzuncuKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {                    
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.DokuzuncuKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.DokuzuncuKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                           //System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.DokuzuncuKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.DokuzuncuKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                            System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.DokuzuncuKonukIcecekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.DokuzuncuKonukIcecekSayisi.size() < 5) {
                                iy.IcecekIc();
                            }
                            System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });
        Thread OnuncuKonuk = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {                    
                    
                Random rmd1 = new Random();
                Integer value1= rmd1.nextInt(3) + 1;
                int value = rmd1.nextInt(5000);
                try {
                    Thread.sleep(15000);
                    Thread.sleep(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(value1){
                    case 1: {
                        System.out.println(Thread.currentThread().getName() + " Canım Borek Çekti .... ");
                        if (iy.queueB.size() != 0) {
                            if (iy.OnuncuKonukBorekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.OnuncuKonukBorekSayisi.size() < 5 ) {
                                iy.BorekYe();
                            }
                           System.out.println("Kalan Borek sayısı : " + iy.queueB.size());
                        }
                        else{
                           System.out.println("Tepsi müsait değil : " + iy.queueB.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println(Thread.currentThread().getName() + " Canım Pasta Çekti... ");
                        if (iy.queueP.size() != 0) {
                            if (iy.OnuncuKonukPastaSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin ÇAlışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.OnuncuKonukPastaSayisi.size() < 2) {
                                iy.PastaYe();
                            }
                            System.out.println("Kalan Pasta Sayısı : " + iy.queueP.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueP.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(Thread.currentThread().getName() + " Susadım... ");
                        if (iy.queueI.size() != 0) {
                            if (iy.OnuncucuKonukIcecekSayisi.size() >= 1) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + " Diğerlerinin Çalışmasını Bekliyor");
                                    Thread.sleep(10000);
                                    Thread.sleep(value);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (iy.OnuncucuKonukIcecekSayisi.size() < 5) {
                                iy.IcecekIc();
                            }
                            System.out.println("Kalan İcecek Sayısı : " + iy.queueI.size());
                        }
                        else{
                            System.out.println("Tepsi müsait değil : " + iy.queueI.size());
                            try {
                                Thread.sleep(value);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    }
                }
                int toplam = iy.queueB.size() + iy.queueI.size() + iy.queueP.size();
                if (toplam == 0) {
                    break;
                }
                }
            }
        });

        Asci.setName("Aşçı");
        BirinciKonuk.setName("Birinci Konuk");
        IkinciKonuk.setName("İkinci Konuk");
        UcuncuKonuk.setName("Üçüncü Konuk");
        DorduncuKonuk.setName("Dördüncü Konuk");
        BesinciKonuk.setName("Beşinci Konuk");
        AltinciKonuk.setName("Altıncı Konuk");
        YedinciKonuk.setName("Yedinci Konuk");
        SekizinciKonuk.setName("Sekizinci Konuk");
        DokuzuncuKonuk.setName("Dokuzuncu Konuk");
        OnuncuKonuk.setName("Onuncu Konuk");
        Asci.setPriority(Thread.MAX_PRIORITY);
        Asci.start();
        BirinciKonuk.start();
        IkinciKonuk.start();
        UcuncuKonuk.start();
        DorduncuKonuk.start();
        BesinciKonuk.start();
        AltinciKonuk.start();
        YedinciKonuk.start();
        SekizinciKonuk.start();
        DokuzuncuKonuk.start();
        OnuncuKonuk.start();
        
        try {
            Asci.join();
            BirinciKonuk.join();
            IkinciKonuk.join();
            UcuncuKonuk.join();
            DorduncuKonuk.join();
            BesinciKonuk.join();
            AltinciKonuk.join();
            YedinciKonuk.join();
            SekizinciKonuk.join();
            DokuzuncuKonuk.join();
            OnuncuKonuk.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadDeene4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Program bitti..");
        System.out.println("Birinci Konuk " + iy.BirinciKonukBorekSayisi.size() + " tane Börek Yedi");
        System.out.println("İkinci Konuk " + iy.IkinciKonukBorekSayisi.size() + " tane Börek Yedi");
        System.out.println("Üçüncü Konuk " + iy.UcuncuKonukBorekSayisi.size() + " tane Börek Yedi");
        System.out.println("Dördüncü Konuk " + iy.DortduncuKonukBorekSayisi.size() + " tane Börek Yedi");
        System.out.println("Beşinci Konuk " + iy.BesinciKonukBorekSayisi.size() + " tane Börek Yedi");
        System.out.println("Altıncı Konuk " + iy.AltinciKonukBorekSayisi.size() + " tane Börek Yedi");
        System.out.println("Yedinci Konuk " + iy.YedinciKonukBorekSayisi.size() + " tane Börek Yedi");
        System.out.println("Sekizinci Konuk " + iy.SekizinciKonukBorekSayisi.size() + " tane Börek Yedi");
        System.out.println("Dokuzuncu Konuk " + iy.DokuzuncuKonukBorekSayisi.size() + " tane Börek Yedi");
        System.out.println("Onuncu Konuk " + iy.OnuncuKonukBorekSayisi.size() + " tane Börek Yedi");
        
        
        System.out.println("Birinci Konuk " + iy.BirinciKonukIcecekSayisi.size() + " tane İçeçek içti");
        System.out.println("İkinci Konuk " + iy.IkinciKonukIcecekSayisi.size() + " tane İçeçek içti");
        System.out.println("Üçüncü Konuk " + iy.UcuncuKonukIcecekSayisi.size() + " tane Börek Yedi");
        System.out.println("Dördüncü Konuk " + iy.DortduncuKonukIcecekSayisi.size() + " tane İçeçek içti");
        System.out.println("Beşinci Konuk " + iy.BesinciKonukIcecekSayisi.size() + " tane İçeçek içti");
        System.out.println("Altıncı Konuk " + iy.AltinciKonukIcecekSayisi.size() + " tane İçeçek içti");
        System.out.println("Yedinci Konuk " + iy.YedinciKonukIcecekSayisi.size() + " tane İçeçek içti");
        System.out.println("Sekizinci Konuk " + iy.SekizinciKonukIcecekSayisi.size() + " tane İçeçek içti");
        System.out.println("Dokuzuncu Konuk " + iy.DokuzuncuKonukIcecekSayisi.size() + " tane İçeçek içti");
        System.out.println("Onuncu Konuk " + iy.OnuncucuKonukIcecekSayisi.size() + " tane İçeçek içti");
        
        
        System.out.println("Birinci Konuk " + iy.BirinciKonukPastaSayisi.size() + " tane Pasta Yedi");
        System.out.println("İkinci Konuk " + iy.IkinciKonukPastaSayisi.size() + " tane Pasta Yedi");
        System.out.println("Üçüncü Konuk " + iy.UcuncuKonukPastaSayisi.size() + " tane Pasta Yedi");
        System.out.println("Dördüncü Konuk " + iy.DortduncuKonukPastaSayisi.size() + " tane Pasta Yedi");
        System.out.println("Beşinci Konuk " + iy.BesinciKonukPastaSayisi.size() + " tane Pasta Yedi");
        System.out.println("Altıncı Konuk " + iy.AltinciKonukPastaSayisi.size() + " tane Pasta Yedi");
        System.out.println("Yedinci Konuk " + iy.YedinciKonukPastaSayisi.size() + " tane Pasta Yedi");
        System.out.println("Sekizinci Konuk " + iy.SekizinciKonukPastaSayisi.size() + " tane Pasta Yedi");
        System.out.println("Dokuzuncu Konuk " + iy.DokuzuncuKonukPastaSayisi.size() + " tane Pasta Yedi");
        System.out.println("Onuncu Konuk " + iy.OnuncuKonukPastaSayisi.size() + " tane Pasta Yedi");
        
        
    }
    
}
