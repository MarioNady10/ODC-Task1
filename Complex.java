/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexnumbers;

/**
 *
 * @author mario
 */
public class Complex {
    double Real;
    double Imagine;

    public Complex() {
    }
    

    Complex(double Real , double Imagine) {
        this.Real=Real;
        this.Imagine=Imagine;
    }
    public static void printNum(Complex c1){
        System.out.println("num = " +c1.Real +"+" + c1.Imagine + " i");
    }
    public static void addComplex(Complex c1,Complex c2){
        Complex num = new Complex();
        num.Real=c1.Real+c2.Real;
        num.Imagine=c1.Imagine+c2.Imagine;
        System.out.println("sum = " + num.Real+"+"+ num.Imagine +" I");
    }
    public static void subComplex(Complex c1,Complex c2){
        Complex num = new Complex();
        num.Real=c1.Real-c2.Real;
        num.Imagine = c1.Imagine-c2.Imagine;
        if(num.Imagine<0){
        System.out.println("num = " + num.Real +" " +num.Imagine +" i");
    }else{
            System.out.println("num = " + num.Real +" + " +num.Imagine +" i");
        }
    }
}

