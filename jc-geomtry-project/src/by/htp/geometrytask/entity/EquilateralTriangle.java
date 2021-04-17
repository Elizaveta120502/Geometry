package by.htp.geometrytask.entity;

public class EquilateralTriangle extends Geometry {

	public EquilateralTriangle(int a, int b, int c) {

		super(a, b, c);
	}

	

	@Override
	public double calculateS(int a, int b, int c) {
        double S =0;
		S = ((Math.sqrt(3) / 4) * Math.pow(a, 2));
		System.out.println("ravnostor:" + S);
		return S;

	}
}
