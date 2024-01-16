/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;
import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        
        //Buat objek
         Player hero = new Player();
         Player Criminal = new Player();
         
         
         hero.damage = 10;
         Criminal.damage = 100;
         hero.name = "Ibek";
         hero.speed = 60;
         hero.healthPoin = 1;
         hero.armor = 60;
         
         hero.run();
         hero.attack(Criminal.damage);
         hero.defend();
         
         if(hero.isDead()){
             System.out.println("Game Over : Noob");
         }else{
             System.out.println("masih hidup");
         }
     
        System.out.println(" ");
        System.out.println("===================");
        System.out.println(" ");
         
         Criminal.name = "Afgan";
         Criminal.speed = 90;
         Criminal.healthPoin = 1;
         Criminal.armor = 100;
         
         Criminal.run();
         Criminal.attack(hero.damage);
         Criminal.defend();
    
         if(Criminal.isDead()){
             System.out.println("Game Over : Noob");
         }else{
             System.out.println("masih hidup");
         }
    
        
    
    
    
                 }
}