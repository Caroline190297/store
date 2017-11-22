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
public class CoffeeMachineString extends StateMachineString 
{
    String currentState;
    String actiune;
    public HashMap< String, HashMap<String ,String>> hmTransition;
    
    public CoffeeMachineString()
    {
        currentState = "0";    
        hmTransition = new HashMap<String, HashMap<String, String> >() ;
        HashMap<String, String> state0 = new HashMap<String, String>();
        HashMap<String, String> state5 = new HashMap<String, String> ();
        HashMap<String, String> state10 = new HashMap<String, String> ();
        
        state0.put("5", "5");
        state0.put("10", "10");
        
        state5.put("5", "10");
        state5.put("10", "15");
        
        state10.put("5", "15");
        state10.put("10", "20");
        
        hmTransition.put("0", state0);// din starea 0 pot ajunge in starea urm 5 sau 10
        hmTransition.put("5", state5);
        hmTransition.put("10", state10);

        
    
    }
   
    
    @Override
    public void execute()
    {
            Scanner scan= new Scanner(System.in);

            while(true)
            {
                System.out.println("Creditul Dumneavoastra este de: " + currentState);
                System.out.println("Introduceti bani: ");
                
                
                actiune = scan.nextLine();
                if(actiune == "5" || actiune =="10")
                {
                    if(hmTransition.get(currentState).get(actiune)!=null)
                    {
                        currentState = hmTransition.get(currentState).get(actiune);
                        
                    }
                    if(currentState == "15")
                    {
                        currentState = "0";
                        System.out.println("Ai cumparat cafea!!!");
                    }
                    if(currentState == "20")
                    {
                        currentState = "5";
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
    

