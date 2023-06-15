/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Item {

    Scanner sc = new Scanner(System.in);
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }

    public void input() {
         int check = 1;
        do {
          
            try {
                    
                System.out.println("input value > 0: ");
                value = Integer.parseInt(sc.nextLine());
                System.out.println("input creator not empty: ");
                creator = sc.nextLine();
                if(value < 0 || creator.trim().isEmpty()) throw new Exception();
                check = 0;
                
            } catch (Exception e) {
                System.out.println("please input again");
                check = 1;
            }
        } while (check == 1);
    }
}
