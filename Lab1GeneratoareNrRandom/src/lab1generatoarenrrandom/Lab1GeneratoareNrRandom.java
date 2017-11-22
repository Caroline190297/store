/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1generatoarenrrandom;

import lab2calitateaGeneratorului.Evaluator;
import lab3PoisssonSiBinomial.Binomial;
import lab3PoisssonSiBinomial.Poisson;

/**
 *
 * @author Carolina
 */
public class Lab1GeneratoareNrRandom {

    /**
     * @param args the command line arguments
     */

	public static void main(String[] args) {
                
		InterfaceGenerator gen = new GeneratorLCG(3663, 2857, 546, 10000);
                System.out.println("LCG:");
		for(int i = 0; i < 5; i++)
		System.out.println(gen.next());
                
                InterfaceGenerator gen1 = new GeneratorMiddleSquare(9524);
                System.out.println("MiddleSquare:");
                for(int i = 0; i < 5; i++)
		System.out.println(gen1.next());
                
                InterfaceGenerator g = new GeneratorLCG(34, 24, 54, 100);
                Evaluator e = new Evaluator(g, 100);
                System.out.println("Evaluator:");
                System.out.println(e.eval());
              
                InterfaceGenerator obj = new GeneratorLCG(363, 4, 11, 1000);
                Binomial b = new Binomial(obj);
                System.out.println("Binomial:");
                float rez=b.generare();
		System.out.println(rez);
                
                InterfaceGenerator obj1;
                obj1 = new GeneratorLCG(363, 4, 11, 1000);
                System.out.println("Poisson:");
                Poisson a = new Poisson(obj1);
		System.out.println(a.distrib());
                
	}
}

