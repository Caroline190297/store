/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reteapetri;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carolina
 */
public class Transition {
    int tag;
    List<Arc> arce;
    Arc arc;
    Location loc;
    
    public Transition(int tag, List<Arc> arce)
    {
        this.tag = tag;
        this.arce = arce;
    }
    
    public int getTag()
    {
        return tag;
    }
    public void update()
   {
      
       /* List<String> someList = new ArrayList<String>();
        someList.add("Apple");
        someList.add("Ball");
        for (String item : someList) {
            System.out.println(item);
        }

        // IS TRANSLATED TO:

        for(Iterator<String> stringIterator = someList.iterator(); stringIterator.hasNext(); ) {
            String item = stringIterator.next();
            System.out.println(item);
        }*/
       for(Arc arc : arce)
       {
           
          /*  if(arc.getDirectie() == 0)//daca iese din locatie
                loc.setJetoane(arc.capacitate);
            else //daca intra in locatie
            {
                loc.setJetoane(arc.capacitate*2);
            }*/
           arc.update();
       }
       
       
       
   }
   
   public boolean isValid()
   {
       for(Arc arc : arce)
       {
           if(arc.isValid() == false)
           {
               return false;
           }
   
       }
       return true;
   }

   
   	public ArrayList<Location> GetLocations()
	{
		ArrayList<Location> locs = new ArrayList<Location>();
		for(Arc arc:arce)
		{
			locs.add(arc.getLoc());
		}
		return locs;
	}
}
