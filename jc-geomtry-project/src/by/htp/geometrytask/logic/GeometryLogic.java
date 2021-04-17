package by.htp.geometrytask.logic;
 
import java.util.ArrayList;

import by.htp.geometrytask.entity.EquilateralTriangle;
import by.htp.geometrytask.entity.Geometry;
import by.htp.geometrytask.entity.IsoscelesTriangle;
import by.htp.geometrytask.main.Main;



public class GeometryLogic {
	
	public double Sum (ArrayList<Geometry> treangles,double totalarea,Geometry treangle1,Geometry treangle3,Geometry treangle5,double S) {
	 
		totalarea =  (treangle1.calculateS(5, 5, 5) +  treangle3.calculateS(10, 10, 5)+treangle5.calculateS(3, 4, 5));
		
	
	return totalarea;
	}
	

}
