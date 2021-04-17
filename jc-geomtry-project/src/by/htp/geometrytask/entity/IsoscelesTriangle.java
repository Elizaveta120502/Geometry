package by.htp.geometrytask.entity;

public class IsoscelesTriangle extends EquilateralTriangle {

	public IsoscelesTriangle(int a, int b, int c) {
		super(a, b, c);
		
	}
	
	@Override
	public double calculateS(int a,int b, int c) {
		
		 double h=0;
		 double S =0;
		 h= Math.sqrt(Math.pow(a,2)- Math.pow( b/2, 2));
		 S = h*b/2;
		 System.out.println("ravnobed :" + S);
		return S;
		
	}

}
