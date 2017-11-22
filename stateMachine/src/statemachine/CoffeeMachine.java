
package statemachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class CoffeeMachine extends StateMachine
{
    int stareCurenta;
    
    
    
    public CoffeeMachine()
    {
        stareCurenta=0;    
        hmTransition = new HashMap<Integer, HashMap<Integer, Integer> >() ;
        HashMap<Integer, Integer> state0 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> state5 = new HashMap<Integer, Integer> ();
        HashMap<Integer, Integer> state10 = new HashMap<Integer, Integer> ();
        //populare hashmap
        state0.put(5, 5); //din starea curenta 0 cu 5 bani(actiunea) ajung in starea 5
        state0.put(10, 10);
        
        state5.put(5, 10);
        state5.put(10, 15);
        
        state10.put(5, 15);
        state10.put(10, 20);
        
        hmTransition.put(0, state0);// din starea 0 pot ajunge in starea urm 5 sau 10
        hmTransition.put(5, state5);
        hmTransition.put(10, state10);

        
    
    }
    
}
