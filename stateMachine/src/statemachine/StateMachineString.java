/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Carolina
 */
public class StateMachineString {
 
    String currentState;
   
    public void execute()
    {
        
    }
    
    public void transaction(String ac)
    {
        currentState = ac;
    }
}
