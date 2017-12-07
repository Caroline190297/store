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
public class Location {
    int tag;
    int jetoane;
    
    public Location(int tag)
    {
        this.tag = tag;
        this.jetoane = 0;
    }
    public int getJetoane()
    {
        return jetoane;
    }
    
     public int getTag()
    {
        return tag;
    }
    public void setJetoane(int capacitate)
    {
        jetoane = jetoane + capacitate;
    }
    
    /* public boolean UpdateJetoane(int aValue)
	{
		int result = mJetoane + aValue;
		if(result < 0)
		{
			return false;
		}
		mJetoane = result;
		return true;*/
    public void setJetonLocatie0()
    {
        jetoane = 1;
    }
   
}
