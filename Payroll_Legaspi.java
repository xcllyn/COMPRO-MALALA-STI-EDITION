/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payroll;

/**
 *
 * @author Huna
 */
public class Payroll_Legaspi {
    
    public static void main(String[] args) {
        String user = "Legaspi, Peter Seth B."; //employee name
        System.out.println("Employee Name:          " + user);
        
        float GP = 110000f; //gross pay
        System.out.println("Gross Pay:              " + GP);
        System.out.println("______________________________________________"); //istitik line for formatting
        System.out.println("Deductions              Amount");
        
        //deduction output
        float wtax = GP * 0.15f;
        System.out.println("Witholding Tax:         " + wtax);
        
        float sss = GP * 0.0363f;
        System.out.println("SSS Contribution:       " + sss);
        
        float medc = GP * 0.0125f;
        System.out.println("Medicare:               " + medc);
        
        float valonalang = 100;
        System.out.println("Pagibig Contribution:   " + valonalang);
        System.out.println("______________________________________________"); //istitik line ulit
        
        //totalD is +, net pay is -
        double LF = wtax + sss + medc + valonalang; //totalD
        double DUO = GP - LF; //netpay
        System.out.println("Net Pay:                " + DUO);

    }
}
