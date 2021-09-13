/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo2;

/**
 *
 * @author amoonmainali
 */
public class NewClass {
    public static void main(String[] args) {
        int [] arr = new int[5];
        
        for(int i=0; i< arr.length; i++) {
            arr [i] = 10 + i;
        }
        
        for(int i=0; i< arr.length; i++) {
            System.out.println("Arr["+i+"]: " + arr [i]);
        }
        
        
    }
    
}
