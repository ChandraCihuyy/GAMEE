/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.util.Scanner;
public class Player {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
   }
    //atribut
    String name;
    int speed, healthPoin, damage, armor;
    
    //method
    void run(){
        System.out.println(name+" is Running ...");
        System.out.println("speed "+speed);
    }
   

     void attack(int value){
         System.out.println(name+ " is attacking ...");
         damage = value;
         System.out.println("damage "+damage);
         armor -= damage;
         healthPoin = armor;
    }
      
     void defend(){
         System.out.println("defend "+ armor);
         System.out.println(" ");
     }
   
        boolean isDead(){
        if(healthPoin<=0) return true;
        return false;
        }
    
    
     
} 


