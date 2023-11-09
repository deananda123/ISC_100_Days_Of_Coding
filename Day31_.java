package Day31;

import java.util.Scanner;

public class Day31_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.print("perkalian: ");
        int x= De.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ "*"+ x+" = " +(i*x));
            
        }
        
    }}