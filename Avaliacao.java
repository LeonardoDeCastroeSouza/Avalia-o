/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.avaliacao;

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class Avaliacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vet = new int[5];

        int a,num=0;
        for (a=0;a<vet.length;a++){
            System.out.print ("Digite um numero a ser inserido :");
            vet[a] =sc.nextInt();

                if (num<vet[a]){
                    num=vet[a];
                }
        }
        System.out.println("o maior numero é :"+num);

    }

}



