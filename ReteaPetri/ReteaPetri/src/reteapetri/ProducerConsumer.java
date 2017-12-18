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
public class ProducerConsumer extends PetriNet {
               PetriNet reteaPetri = new PetriNet();
      public ProducerConsumer()    
      {
        Location zero = new Location(0,10);//producers
        Location unu = new Location(1,0);//elem ready for write
        Location doi = new Location(2,0);//full spots
        Location trei = new Location(3,1);//mutex
        Location patru = new Location(4,0);//elem ready for read
        Location cinci = new Location(5,10);//free spots
        Location sase = new Location(6,10);//consumers
        
        tranzitii.add(new Transition(1, new ArrayList<Arc>() {{ //pt tranzitie produce
			add(new Arc(1, zero, 0)); //capacitate arc, locatia, directia=0 daca iese si 1 daca intra
			add(new Arc(1, unu, 1)); 
			}}
		));
        tranzitii.add(new Transition(2, new ArrayList<Arc>() {{ //pt tranzitie push
			add(new Arc(1, unu, 0)); 
			add(new Arc(1, zero, 1)); 
                        add(new Arc(1, doi, 1)); 
                        add(new Arc(1, cinci, 0));
                        add(new Arc(1, trei, 1)); 
                        add(new Arc(1, trei, 0)); 
			}}
		));
        tranzitii.add(new Transition(3, new ArrayList<Arc>() {{ //pt tranzitie pop
			add(new Arc(1, doi, 0)); 
			add(new Arc(1, cinci, 1));
                        add(new Arc(1, trei, 0)); 
                        add(new Arc(1, trei, 1)); 
                        add(new Arc(1, sase, 0));
                        add(new Arc(1, patru, 1)); 
			}}
		));
        tranzitii.add(new Transition(4, new ArrayList<Arc>() {{ //pt tranzitie consume
			add(new Arc(1, patru, 0)); 
			add(new Arc(1, sase, 1)); 
			}}
		));
      }
}
        