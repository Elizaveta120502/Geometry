package by.htp.geometrytask.entity;



public  abstract class Geometry {

	public int a;
	public int b;
	public int c;
	public int S;
	
    public double calculateS(int a, int b, int c) {
    	double S=0;
		return S;
	}

	public Geometry(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;
	

	}

	public int getA() {
		return a;
	}

	public void setA(int A) {
		A = a;

	}

	public int getB() {
		return b;
	}

	public void setB(int B) {
		B = b;

	}

	public int getC() {
		return c;
	}

	public void setC(int C) {
		C = c;

	}

	public int getS() {
		return S;
	}

	public void setS(int s) {
		s = S;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + S;
		return result;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Geometry other = (Geometry) obj;
		if (S != other.S)
			return false;
		if (S != other.S)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Area =" + S;
	}

	
	
}
