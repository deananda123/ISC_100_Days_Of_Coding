/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day17;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Day17_ {
     public static void main(String[] args) {
         Scanner De = new Scanner(System.in);
         System.out.println("masukkan jam:");
         int jam = De.nextInt();
         
         if (jam>=05 && jam <=10){
             System.out.println("pagi");
         }else if (jam>=11 && jam<=13){
             System.out.println("siang");
         }else if (jam>=14 && jam<=18){
             System.out.println("sore");
         }else if (jam>=19 && jam<=24){
             System.out.println("malam");
         }else if (jam>=01 && jam<=04){
             System.out.println("dini hari");
         }
     }
    
}
