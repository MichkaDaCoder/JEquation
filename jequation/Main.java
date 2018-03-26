package jequation;

import java.util.Scanner;

/**
 * Main.java: class that contains main() method.
 * @author MichkaDaCoder
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("J E Q U A T I O N ");
        Scanner sc=new Scanner(System.in);
		double a,b,c;
		
		System.out.print("- Enter a: ");
		a=sc.nextDouble();
		System.out.print("- Enter b: ");
		b=sc.nextDouble();
		System.out.print("- Enter c: ");
		c=sc.nextDouble();
		JEquation e=new JEquation(a,b,c);
		e.setA(a);
		e.setB(b);
		e.setC(c);
		System.out.println(e+"\n");
		double delta=e.getDelta();
		System.out.println("Value of DELTA: "+delta);
		
		
		if(delta>0) {
			System.out.println("\nYour equation has 2 solutions : "+e.getSol1()+ " et "+e.getSol2());
		}
		
		else if(delta==0) {
			System.out.println("\nYour equation has a unique solution:  "+e.getSol0());
		}
		
		else {
			System.out.println("\nNo solution for your equation in IR.");
		}
    }
}
