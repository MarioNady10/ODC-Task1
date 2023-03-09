/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complexnumbers;

/**
 *
 * @author mario
 */
public class ComplexNumbers {

    public static void main(String[] args) {
        Complex n1 = new Complex(9, 10);
        Complex n2 = new Complex(5, 9);
        Complex.printNum(n1);
        Complex.printNum(n2);
        Complex.addComplex(n1, n2);
        Complex.subComplex(n1, n2);
        
    }
}
