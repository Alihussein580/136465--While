/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.*;

/**
 *
 * @author Babli
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag = true;
        int Guess;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int randomNumber = rand.nextInt(11);
        //program starts in the loop
        do{
            System.out.println("Guess the number");
            Guess = input.nextInt();
            if(Guess == randomNumber){
                System.out.println("Sucess!");
                flag = false;
            }
        }while(flag = true);
 
    }
    
}
