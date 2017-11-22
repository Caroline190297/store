/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3PoisssonSiBinomial;
import lab1generatoarenrrandom.InterfaceGenerator;

/**
 *
 * @author Carolina
 */
public class Poisson {
    public InterfaceGenerator obj1;
    float e = 2.71f;
    int l = 100;
    float L;
    int k = 0; float p = 1.0f;
    
      public int calcLungimeNr(int n){
		return new Integer(n).toString().length();
	}
    
    public Poisson(InterfaceGenerator obj1)
    {
        this.obj1 = obj1;  
    }
    public float distrib()
    {
        int aux = l*(-1);
        L = (float) Math.pow(e, aux);
        float u;
        u = obj1.next();
        do{
            k = k + 1;
            p = p * u;
        }while((p > L));
      return (float) ((k-1)/Math.pow(10, calcLungimeNr(k-1)));
    }
}
