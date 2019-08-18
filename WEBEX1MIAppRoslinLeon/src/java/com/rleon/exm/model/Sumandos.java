/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rleon.exm.model;

/**
 *
 * @author RLEON
 */
public class Sumandos {
    
    private int num1;
    private int num2;
    private String result;

    public Sumandos() {
    }

    public Sumandos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    
}
