/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1generatoarenrrandom;

/**
 *
 * @author Carolina
 */

public class GeneratorMiddleSquare implements InterfaceGenerator {

	private int seed;
        private int adaos = 1;
	
	public GeneratorMiddleSquare(int seed) {
		this.seed = (int) seed;
	}
	
	@Override
	public float next() {
		return (float) (calcMijlocNr()/Math.pow(10, calcLungimeNr(seed)));
	}

	public int calcLungimeNr(int n){
		return new Integer(n).toString().length();
	}
        
        private int modifLungime( int number1) {
		while(calcLungimeNr(number1) < calcLungimeNr(seed)){
                    number1 = number1 * 10;
                    adaos++;
                    number1 = number1 + adaos;
                }
                
                return number1;
	}
	
	private int calcMijlocNr(){
		int numar = seed * seed;
		int lungime = calcLungimeNr(numar);
		numar = (int) (numar /  Math.pow((double)10, (double)(lungime/(lungime / 2))));//elimina ultimul sf din nr total de cifre ale nr-lui
		int numar1 = (int) (numar % Math.pow((double)10, (double)lungime/2));//ia jumatate (din nr total) de cifre
		seed = numar1;
		if(calcLungimeNr(numar1) < calcLungimeNr(seed)){
			modifLungime(numar1);
		}
		return numar1;
	}
}
