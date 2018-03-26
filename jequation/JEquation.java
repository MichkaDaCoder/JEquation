package jequation;

/**
 * 
 * @author MichkaDaCoder
 */
public class JEquation {
    private double a;
	private double b;
	private double c;
	private double delta;
	
	public JEquation(double a,double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.delta=Math.pow(b,2)-(4*a*c);
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public void setA(double a) {
		this.a=a;
	}
	
	public void setB(double b) {
		this.b=b;
	}
	
	public void setC(double c) {
		this.c=c;
	}
	
	public double getDelta() {
		return this.delta;
	}
	
	public double getSol0() {
		return (-1*b)/(2*a);
	}
	
	public double getSol1() {
		return (-1*b+Math.sqrt(delta))/(2*a);
	}
	
	public double getSol2() {
		return (-1*b-Math.sqrt(delta))/(2*a);
	}
	
	public boolean isDeltaNegative() {
		return delta<0;
	}
	
	@Override 
	public String toString() {
		return "Equation:  (a="+a+", b="+b+ " , c="+c+")";
	}
}
