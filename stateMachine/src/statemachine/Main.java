/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Carolina
 */
public class Main {
    /**
     * @param args the command line arguments
     */


   public static void main(String args[]) {
       
       StateMachine coffeeMachine = new CoffeeMachine();
       coffeeMachine.execute(0);
       
       //StateMachineString coffeeMachine1 = new CoffeeMachineString();
       //coffeeMachine1.execute();


/*
Map<String,ArrayList<String>> multiMap = new HashMap<String,ArrayList<String>>();
      /* This is how to declare HashMap */ 

     
}
}
