/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Ava3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tmptot, tmphr, tmpmn, tmpsg;
        float msinicial, msfinal;

        System.out.println("Escreva a massa inicial");
        msinicial = sc.nextFloat();

        msfinal = msinicial;
        
        tmptot = 0;

        while (msfinal <= 0.5) {

            msfinal = msfinal / 2;

            tmptot = tmptot + 50;
        }
        
        tmphr = (tmptot / 3600);
        tmpmn = (tmptot % 3600) / 60;
        tmpsg = (tmptot % 3600) % 60;

        System.out.println("A Massa inicial é " + msinicial);
        System.out.println("A Massa final é " + msfinal);

       

        System.out.println(" o tempo total é " + tmphr + " horas " + tmpmn + " minutos " + " e " + tmpsg + " segundos ");

    }

}
