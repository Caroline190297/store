/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reteapetri;

/**
 *
 * @author Carolina
 */
public class Arc{
    
    public int capacitate;
    public int directie;
    Location loc;
   public Arc(int capacitate, Location loc, int directie){
       this.capacitate = capacitate;
       this.directie = directie;
       this.loc = loc;
   }
   
   public void update()
   {
       if(directie==0)//daca iese din locatie
           loc.setJetoane((-1)*capacitate);
       else //daca intra in locatie
       {
           loc.setJetoane(capacitate);
       }
   }
   
   public boolean isValid()
   {
       if(directie == 0)//daca iese
       {
            if(loc.getJetoane()>=capacitate)
                return true;
            else 
                return false;
       }
       else //daca intra
             return true;
       
    }
   
   public int getDirectie()
   {
       return directie;
   }
   public Location getLoc()
   {
       return loc;
   }
}

