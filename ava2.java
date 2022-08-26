/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao;

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class ava2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario = 1000,novosalario,ano = 2022,percentual,anoini = 1997; 
        
        percentual = 1.5/100;
        
        novosalario = salario + percentual * salario;
        
        while (anoini <= ano){
            
         percentual = 2 * percentual;    
        
         novosalario = novosalario + percentual * novosalario;
         
         anoini = anoini+1;
         
        }
        
        System.out.println(" o salario atual é = " + novosalario);
    }
    
}
