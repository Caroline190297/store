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
public class Binomial {
   
        
    public InterfaceGenerator obj;
    private float n;
    private float p;
     public Binomial(InterfaceGenerator obj)
    {
        this.obj = obj;  
        n=1000.0f;
        p=0.4f;
    }
    
    public float generare()
    {
        
       // int n = 1000;
      // float p = 0.8f;
        float u;
        float x = 0.0f ;
        for(int i = 0; i <= n-1; i++)
        {
           u = obj.next();
           if(u<p){
               x++;
           }
        }
        return (x/(n));
    }
}
