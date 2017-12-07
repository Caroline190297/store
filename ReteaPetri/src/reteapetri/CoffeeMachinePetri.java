/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reteapetri;

import java.util.ArrayList;

/**
 *
 * @author Carolina
 */
public class CoffeeMachinePetri extends PetriNet{

    
    public CoffeeMachinePetri()
    {
    
        //populam
   
        Location zero = new Location(0);
        zero.setJetonLocatie0();//pun 1 jeton in locarie
        Location cinci = new Location(5);
        Location zece = new Location(10);
        Location cincisprezece = new Location(15);
        
        tranzitii.add(new Transition(5, new ArrayList<Arc>() {{ //pt tranzitie cu tag 0
			add(new Arc(1, zero, 0)); //capacitatea locatia directia=0 daca iese si 1 daca intra
			add(new Arc(1, cinci, 1)); 
			}}
		));
        tranzitii.add(new Transition(5, new ArrayList<Arc>() {{ //pt tranzitie cu tag 0
			add(new Arc(1, cinci, 0)); 
			add(new Arc(1, zece, 1)); 
			}}
		));
        tranzitii.add(new Transition(5, new ArrayList<Arc>() {{ //pt tranzitie cu tag 0
			add(new Arc(1, zece, 0)); 
			add(new Arc(1, cincisprezece, 1)); 
			}}
		));
        tranzitii.add(new Transition(10, new ArrayList<Arc>() {{ //pt tranzitie cu tag 0
			add(new Arc(1, zero, 0)); 
			add(new Arc(1, zece, 1)); 
			}}
		));
        tranzitii.add(new Transition(10, new ArrayList<Arc>() {{ //pt tranzitie cu tag 0
			add(new Arc(1, cinci, 0)); 
			add(new Arc(1, cincisprezece, 1)); 
			}}
		));
    } 
    
    
    
    
}
