/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikenaikanlevel;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class UjiKenaikanLevel {

    /**
     * @param args the command line arguments
     */
    public  void nama() {
        Scanner masukan = new Scanner (System.in);
        String[] nilai = {"Nilai Harian 1:", "Nilai Harian 2:", "Ulangan:", "UTS:", "PAS:"};
        System.out.println("==========\\==========");
        System.out.println("DAFTAR NAMA KELAS X TKJ");
        System.out.println("1.Adam");
        System.out.println("2.Bashir");
        System.out.println("3.Devon");
        System.out.println("4.Fathan");
        System.out.println("5.Lukman");
        System.out.println("6.Syihab");
        System.out.println("7.Yeremi");
        System.out.println("==========\\==========");
        String ulang;
        do{
            System.out.println("Masukan Nama:");
            String pilih = masukan.next();
            
            if (pilih.equals("adam")) {
                System.out.println(nilai[0]);
                double input = masukan.nextInt();
                System.out.println(nilai[1]);
                double input1 = masukan.nextInt();
                System.out.println(nilai[2]);
                double input2 = masukan.nextInt();
                System.out.println(nilai[3]);
                double input3 = masukan.nextInt();
                System.out.println(nilai[4]);
                double input4 = masukan.nextInt();
                double ratarata = (input*10/100+input1*10/100+input2*20/100+input3*20/100+input4*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Adam:"+ratarata);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata >= 94)
                System.out.println("nilai A");
                else if (ratarata >=83)
                System.out.println("nilai B");
                else if (ratarata >=75)
                System.out.println("nilai C");
                else if (ratarata >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                
                
            }else if(pilih.equals("bashir")) {
                System.out.println(nilai[0]);
                int input = masukan.nextInt();
                System.out.println(nilai[1]);
                int input1 = masukan.nextInt();
                System.out.println(nilai[2]);
                int input2 = masukan.nextInt();
                System.out.println(nilai[3]);
                int input3 = masukan.nextInt();
                System.out.println(nilai[4]);
                int input4 = masukan.nextInt();
                
                double ratarata1 = (input*10/100+input1*10/100+input2*20/100+input3*20/100+input4*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Bashir:"+ratarata1);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata1 >= 94)
                System.out.println("nilai A");
                else if (ratarata1 >=83)
                System.out.println("nilai B");
                else if (ratarata1 >=75)
                System.out.println("nilai C");
                else if (ratarata1 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                
            }else if(pilih.equals("devon")) {
                System.out.println(nilai[0]);
                int input = masukan.nextInt();
                System.out.println(nilai[1]);
                int input1 = masukan.nextInt();
                System.out.println(nilai[2]);
                int input2 = masukan.nextInt();
                System.out.println(nilai[3]);
                int input3 = masukan.nextInt();
                System.out.println(nilai[4]);
                int input4 = masukan.nextInt();
                
                double ratarata2 = (input*10/100+input1*10/100+input2*20/100+input3*20/100+input4*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Devon:"+ratarata2);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata2 >= 94)
                System.out.println("nilai A");
                else if (ratarata2 >=83)
                System.out.println("nilai B");
                else if (ratarata2 >=75)
                System.out.println("nilai C");
                else if (ratarata2 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                
            }else if (pilih.equals("fathan")) {
                System.out.println(nilai[0]);
                int input = masukan.nextInt();
                System.out.println(nilai[1]);
                int input1 = masukan.nextInt();
                System.out.println(nilai[2]);
                int input2 = masukan.nextInt();
                System.out.println(nilai[3]);
                int input3 = masukan.nextInt();
                System.out.println(nilai[4]);
                int input4 = masukan.nextInt();  
                
                double ratarata3 = (input*10/100+input1*10/100+input2*20/100+input3*20/100+input4*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Fathan:"+ratarata3);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata3 >= 94)
                System.out.println("nilai A");
                else if (ratarata3 >=83)
                System.out.println("nilai B");
                else if (ratarata3 >=75)
                System.out.println("nilai C");
                else if (ratarata3 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                
            }else if (pilih.equals("lukman")) {
                System.out.println(nilai[0]);
                int input = masukan.nextInt();
                System.out.println(nilai[1]);
                int input1 = masukan.nextInt();
                System.out.println(nilai[2]);
                int input2 = masukan.nextInt();
                System.out.println(nilai[3]);
                int input3 = masukan.nextInt();
                System.out.println(nilai[4]);
                int input4 = masukan.nextInt();
                
                 double ratarata4 = (input*10/100+input1*10/100+input2*20/100+input3*20/100+input4*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Lukman:"+ratarata4);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata4 >= 94)
                System.out.println("nilai A");
                else if (ratarata4 >=83)
                System.out.println("nilai B");
                else if (ratarata4 >=75)
                System.out.println("nilai C");
                else if (ratarata4 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                
            }else if(pilih.equals("syihab")) {
                System.out.println(nilai[0]);
                int input = masukan.nextInt();
                System.out.println(nilai[1]);
                int input1 = masukan.nextInt();
                System.out.println(nilai[2]);
                int input2 = masukan.nextInt();
                System.out.println(nilai[3]);
                int input3 = masukan.nextInt();
                System.out.println(nilai[4]);
                int input4 = masukan.nextInt(); 
                
                 double ratarata5 = (input*10/100+input1*10/100+input2*20/100+input3*20/100+input4*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Syihab:"+ratarata5);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata5 >= 94)
                System.out.println("nilai A");
                else if (ratarata5 >=83)
                System.out.println("nilai B");
                else if (ratarata5 >=75)
                System.out.println("nilai C");
                else if (ratarata5 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                
            }else if(pilih.equals("yeremi")) {
                System.out.println(nilai[0]);
                int input = masukan.nextInt();
                System.out.println(nilai[1]);
                int input1 = masukan.nextInt();
                System.out.println(nilai[2]);
                int input2 = masukan.nextInt();
                System.out.println(nilai[3]);
                int input3 = masukan.nextInt();
                System.out.println(nilai[4]);
                int input4 = masukan.nextInt();
                
                 double ratarata6 = (input*10/100+input1*10/100+input2*20/100+input3*20/100+input4*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Yeremi:"+ratarata6);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata6 >= 94)
                System.out.println("nilai A");
                else if (ratarata6 >=83)
                System.out.println("nilai B");
                else if (ratarata6 >=75)
                System.out.println("nilai C");
                else if (ratarata6 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
            }else if (pilih.equals("semua")) {
                System.out.println("==========\\==========");
                System.out.println("NILAI ADAM");
                System.out.println(nilai[0]);
                double input = masukan.nextInt();
                System.out.println(nilai[1]);
                double input1 = masukan.nextInt();
                System.out.println(nilai[2]);
                double input2 = masukan.nextInt();
                System.out.println(nilai[3]);
                double input3 = masukan.nextInt();
                System.out.println(nilai[4]);
                double input4 = masukan.nextInt();
                double ratarata1 = (input*10/100+input1*10/100+input2*20/100+input3*20/100+input4*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Adam:"+ratarata1);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata1 >= 94)
                System.out.println("nilai A");
                else if (ratarata1 >=83)
                System.out.println("nilai B");
                else if (ratarata1 >=75)
                System.out.println("nilai C");
                else if (ratarata1 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                System.out.println("==========\\==========");
                System.out.println("==========\\==========");
                System.out.println("NILAI BASHIR");
                System.out.println(nilai[0]);
                double input5 = masukan.nextInt();
                System.out.println(nilai[1]);
                double input6 = masukan.nextInt();
                System.out.println(nilai[2]);
                double input7 = masukan.nextInt();
                System.out.println(nilai[3]);
                double input8 = masukan.nextInt();
                System.out.println(nilai[4]);
                double input9 = masukan.nextInt();
                double ratarata2 = (input6*10/100+input5*10/100+input7*20/100+input8*20/100+input9*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Bashir:"+ratarata2);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata2 >= 94)
                System.out.println("nilai A");
                else if (ratarata2 >=83)
                System.out.println("nilai B");
                else if (ratarata2 >=75)
                System.out.println("nilai C");
                else if (ratarata2 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                System.out.println("==========\\==========");
                System.out.println("==========\\==========");
                System.out.println("NILAI DEVON");
                System.out.println(nilai[0]);
                double input11 = masukan.nextInt();
                System.out.println(nilai[1]);
                double input12 = masukan.nextInt();
                System.out.println(nilai[2]);
                double input13 = masukan.nextInt();
                System.out.println(nilai[3]);
                double input14 = masukan.nextInt();
                System.out.println(nilai[4]);
                double input15 = masukan.nextInt();
                double ratarata3 = (input11*10/100+input12*10/100+input13*20/100+input14*20/100+input15 *40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai Devon:"+ratarata3);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata3 >= 94)
                System.out.println("nilai A");
                else if (ratarata3 >=83)
                System.out.println("nilai B");
                else if (ratarata3 >=75)
                System.out.println("nilai C");
                else if (ratarata3 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                System.out.println("==========\\==========");
                System.out.println("==========\\==========");
                System.out.println("NILAI FATHAN");
                System.out.println(nilai[0]);
                double input16 = masukan.nextInt();
                System.out.println(nilai[1]);
                double input17 = masukan.nextInt();
                System.out.println(nilai[2]);
                double input18 = masukan.nextInt();
                System.out.println(nilai[3]);
                double input19 = masukan.nextInt();
                System.out.println(nilai[4]);
                double input20 = masukan.nextInt();
                double ratarata4 = (input16*10/100+input17*10/100+input18*20/100+input19*20/100+input20*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai fathan:"+ratarata4);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata4 >= 94)
                System.out.println("nilai A");
                else if (ratarata4 >=83)
                System.out.println("nilai B");
                else if (ratarata4 >=75)
                System.out.println("nilai C");
                else if (ratarata4 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                System.out.println("==========\\==========");
                System.out.println("==========\\==========");
                System.out.println("NILAI LUKMAN");
                System.out.println(nilai[0]);
                double input21 = masukan.nextInt();
                System.out.println(nilai[1]);
                double input22 = masukan.nextInt();
                System.out.println(nilai[2]);
                double input23 = masukan.nextInt();
                System.out.println(nilai[3]);
                double input24 = masukan.nextInt();
                System.out.println(nilai[4]);
                double input25 = masukan.nextInt();
                double ratarata5 = (input21*10/100+input22*10/100+input23*20/100+input24*20/100+input25*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai lukman:"+ratarata5);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata5 >= 94)
                System.out.println("nilai A");
                else if (ratarata5 >=83)
                System.out.println("nilai B");
                else if (ratarata5 >=75)
                System.out.println("nilai C");
                else if (ratarata5 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                System.out.println("==========\\==========");
                System.out.println("==========\\==========");
                System.out.println("NILAI SYIHAB");
                System.out.println(nilai[0]);
                double input26 = masukan.nextInt();
                System.out.println(nilai[1]);
                double input27 = masukan.nextInt();
                System.out.println(nilai[2]);
                double input28 = masukan.nextInt();
                System.out.println(nilai[3]);
                double input29 = masukan.nextInt();
                System.out.println(nilai[4]);
                double input30 = masukan.nextInt();
                double ratarata6 = (input26*10/100+input27*10/100+input28*20/100+input29*20/100+input30*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai syihab:"+ratarata6);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata6 >= 94)
                System.out.println("nilai A");
                else if (ratarata6 >=83)
                System.out.println("nilai B");
                else if (ratarata6 >=75)
                System.out.println("nilai C");
                else if (ratarata6 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                System.out.println("==========\\==========");
                System.out.println("==========\\==========");
                System.out.println("NILAI YEREMI");
                System.out.println(nilai[0]);
                double input31 = masukan.nextInt();
                System.out.println(nilai[1]);
                double input32 = masukan.nextInt();
                System.out.println(nilai[2]);
                double input33 = masukan.nextInt();
                System.out.println(nilai[3]);
                double input34 = masukan.nextInt();
                System.out.println(nilai[4]);
                double input35 = masukan.nextInt();
                double ratarata7 = (input31*10/100+input32*10/100+input33*20/100+input34*20/100+input35*40/100)+5;
                
                System.out.println("==========\\==========");
                System.out.println("Rata-rata Nilai yeremi:"+ratarata7);
                System.out.println("==========\\==========");
                
                System.out.println("Predikat siswa:");
                if(ratarata7 >= 94)
                System.out.println("nilai A");
                else if (ratarata7 >=83)
                System.out.println("nilai B");
                else if (ratarata7 >=75)
                System.out.println("nilai C");
                else if (ratarata7 >=50)
                System.out.println("nilai D");
                else
                System.out.println("nilai E");
                System.out.println("==========\\==========");
                
                System.out.println("NILAI AKHIR SISWA");
                System.out.println("Adam:"+ratarata1);
                System.out.println("Bashir:"+ratarata2);
                System.out.println("Devon:"+ratarata3);
                System.out.println("Fathan:"+ratarata4);
                System.out.println("Lukman:"+ratarata5);
                System.out.println("Syihab:"+ratarata6);
                System.out.println("Yeremi:"+ratarata7);
       
            }else 
                System.out.println("maaf nama yang anda input tidak tersedia");
                System.out.println("==============TERIMA KASIH==============");
                   
        
                
            
            System.out.println("apakah Anda ingin menginput nilai lainnya?");
            ulang = masukan.next();
        } while (ulang.equals("iya") || ulang.equals("ya") || ulang.equals("yo"));
        
       
}
        
       
        
    }
    

