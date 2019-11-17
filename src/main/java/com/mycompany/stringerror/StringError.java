/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringerror;
import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class StringError {
    public static void main (String[] args) {
        Scanner myInput = new Scanner(System.in);
        String myString = myInput.next();
        try {
            checkString(myString);
            System.out.println("Tu string es correcto: " + myString);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        Scanner myInput1 = new Scanner(System.in);
        String myString1 = myInput1.next();
        try {
            checkString(myString1);
            System.out.println("Tu string es correcto: " + myString1);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        Scanner myInput2 = new Scanner(System.in);
        String myString2 = myInput2.next();
        try {
            checkString(myString2);
            System.out.println("Tu string es correcto: " + myString2);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static String checkString(String myString) throws Exception {
        if (myString.length() > 30) {
            throw new Exception("El string contiene mas de 30 caracteres");
        }
        for (char ch: myString.toCharArray()) {
            if (!Character.isLetter(ch)) {
                throw new Exception("El string contiene caracteres que no son letras alfabeticas");
            }
        }
        return myString;
    } 
}
