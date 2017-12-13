/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reteapetri;

import java.util.ArrayList;


public class ReadWrite extends PetriNet{
	PetriNet reteaPetri = new PetriNet();
	
	public ReadWrite()
	{
		
		Location zero = new Location(0);
                zero.setJetonLocatie0();//pun 1 jeton in locatie
                Location unu = new Location(1);//citeste
                Location doi = new Location(2); //true intra, false iese //scrie
		
		
                
                tranzitii.add(new Transition(1 , new ArrayList<Arc>() {{ //tag 1 = "READ" 
			add(new Arc(1, zero, 0)); //capacitatea locatia directia=0 daca iese si 1 daca intra
			add(new Arc(1, unu, 1)); //0 daca iese ; 1 daca intra 
			}}
		));
                tranzitii.add(new Transition(2 , new ArrayList<Arc>() {{ //tag 2 = "END READ" 
			add(new Arc(1, unu, 0)); //capacitatea locatia directia=0 daca iese si 1 daca intra
			add(new Arc(1, zero, 1)); //0 daca iese ; 1 daca intra 
			}}
		));
		
                tranzitii.add(new Transition(3 , new ArrayList<Arc>() {{ //tag 3 = "WRITE" 
			add(new Arc(1, zero, 0)); //capacitatea locatia directia=0 daca iese si 1 daca intra
			add(new Arc(1, doi, 1)); //0 daca iese ; 1 daca intra 
			}}
		));
                
                tranzitii.add(new Transition(4 , new ArrayList<Arc>() {{ //tag 2 = "END WRITE" 
			add(new Arc(1, zero, 1)); //capacitatea locatia directia=0 daca iese si 1 daca intra
			add(new Arc(1, doi, 0)); //0 daca iese ; 1 daca intra 
			}}
		));
		
	}

}


