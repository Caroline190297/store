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

public class GeneratorLCG implements InterfaceGenerator{

	private int seed;
	
	private int a;
	
	private int m;
	
	private int c;
	

	public GeneratorLCG(int seed, int a, int m, int c) {
		
		this.seed = seed;
		this.a = a;
		this.m = m;
		this.c = c;
	}

        public int calcLungimeNr(int n){
		return new Integer(n).toString().length();
	}
        
	@Override
	public float next() {	
		
		int seed2 = (a * seed + c) % m;
		seed = seed2;
		return (float) (seed/Math.pow(10, calcLungimeNr(seed)));
	}

}
