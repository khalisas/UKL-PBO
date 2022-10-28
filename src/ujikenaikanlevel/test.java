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
public class test extends UjiKenaikanLevel{
    public static void main(String[] args){
        Scanner masukan = new Scanner (System.in);
        boolean a = true;
        while(a = true){
            test rpl = new test();
            rpl.nama();
            
            
            System.out.println();
            String ulang = masukan.next();
            
            if(ulang.equals("tidak")){
                a = false;
       
                
            }
            
            
        }
 
        }
    
}
