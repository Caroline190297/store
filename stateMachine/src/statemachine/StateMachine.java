/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Carolina
 */
public class StateMachine {
 
    int stareCurenta;
    int actiune;
    protected HashMap< Integer, HashMap<Integer ,Integer>> hmTransition;
   
    public void execute(int action)
    {
         Scanner scanner = new Scanner(System.in);
        
        
        while(true)
        {
            System.out.println("Creditul Dumneavoastra este de: " + stareCurenta);
            System.out.println("Introduceti bani: ");

            actiune = scanner.nextInt();
            if(actiune == 5 || actiune ==10)
            {
                if(hmTransition.get(stareCurenta).get(actiune)!=null)
                {
                    stareCurenta = hmTransition.get(stareCurenta).get(actiune);

                }
                 if(stareCurenta == 15)
                {
                    stareCurenta = 0;
                    System.out.println("Ai cumparat cafea!!!");
                }
                 if(stareCurenta == 20)
                 {
                    stareCurenta = 5;
                    System.out.println("Ai cumparat cafea!!!");
                 }
            }
            else
            {
                System.out.println("Introdu doar banuti de 5 si 10.");
            }


        }
    }
}
    
    

