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
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue( int value, String creator,int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

   

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    
    public void outputStatue(){
        super.output();
        System.out.println("weight: "+weight);
        System.out.println("colour: "+colour);
    }
    public void inputStatue(){
    super.input();
     Scanner sc=new Scanner(System.in);
        System.out.println("Input a weight: ");
        weight=sc.nextInt();
        System.out.println("Input a colour: ");
        sc=new Scanner(System.in);
        colour =sc.nextLine();           
    }
}
