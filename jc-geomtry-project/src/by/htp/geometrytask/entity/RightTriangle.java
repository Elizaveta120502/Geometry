package by.htp.geometrytask.entity;

public class RightTriangle extends IsoscelesTriangle{

	
	
	public RightTriangle(int a, int b, int c) {
		super(a, b, c);
		
	}
	
	@Override
	public double calculateS(int a, int b, int c) {
		double S =0;
		S = a*b/c;
		System.out.println("pramougoln :" + S);
		return S;

	}

}
