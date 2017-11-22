/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2calitateaGeneratorului;


/**
 *
 * @author Carolina
 */
import lab1generatoarenrrandom.InterfaceGenerator;
public class Evaluator {
    float pi = 3.14f;
    public InterfaceGenerator g;
    float nrTotalNr=1000.0f ;
    public Evaluator(InterfaceGenerator g, int nrTotalNr)
    {
        this.nrTotalNr = nrTotalNr;
        this.g = g;
        
    }
    public float eval()
    {
        int nrPuncteSC = 0;
        
        for(int i = 0; i <  nrTotalNr; i++){
                float x = g.next();
                float y = g.next();
                if(Math.pow(x, 2) + Math.pow(y, 2) <= 1){
                        nrPuncteSC++;
                }
        }
        float aux = (float)(4*nrPuncteSC)/ nrTotalNr;
         return (Math.abs(pi-aux));
    }
}
