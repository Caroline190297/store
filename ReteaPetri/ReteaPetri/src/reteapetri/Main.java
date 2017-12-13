/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reteapetri;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        PetriNet inst = new CoffeeMachinePetri();
       Scanner scanner = new Scanner(System.in);
       int input ;
       input = scanner.nextInt();
       while(input!=0)
        {
            System.out.println("Introduceti optiunea: ");
            input = scanner.nextInt();
            inst.exec(input);
            
            System.out.println(inst.getStareCurenta());
		}
        inst.exec(0);
    }
}
