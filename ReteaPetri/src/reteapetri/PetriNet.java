/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reteapetri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class PetriNet {
    protected List<Transition> tranzitii;
    int actiune;
    Transition tranzitie;
  
    public PetriNet()
	{
		tranzitii = new ArrayList<Transition>();
	}
    
     public int getStareCurenta()
	{
        
		for(Transition tranzitie : tranzitii)
		{
			ArrayList<Location> locs = tranzitie.GetLocations();
			for(Location loc:locs)
			{
				if(loc.getJetoane() == 1)
				{
					return loc.getTag();
				}
			}
		}
		return 0;
	}
    
    public void  exec(int actiune)
    {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            actiune = scanner.nextInt();
            for(Transition tranzitie : tranzitii)
            {
                if(tranzitie.getTag()==actiune && tranzitie.isValid()==true)
                    tranzitie.update();
                    
            }
            System.out.println(getStareCurenta());
        }
    }
}
