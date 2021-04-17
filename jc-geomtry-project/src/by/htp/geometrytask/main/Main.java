package by.htp.geometrytask.main;

import java.util.ArrayList;

import by.htp.geometrytask.entity.EquilateralTriangle;
import by.htp.geometrytask.entity.Geometry;
import by.htp.geometrytask.entity.IsoscelesTriangle;
import by.htp.geometrytask.entity.RightTriangle;
import by.htp.geometrytask.logic.GeometryLogic;
import by.htp.geometrytask.presentation.GeometryPresentation;

public class Main {

	public static void main(String[] args) {
		double totalarea = 0;
		double S = 0;
		Geometry treangle1 = new EquilateralTriangle(5, 5, 5);

		Geometry treangle3 = new IsoscelesTriangle(10, 10, 5);

		Geometry treangle5 = new RightTriangle(3, 4, 5);

		ArrayList<Geometry> treangles = new ArrayList<Geometry>();

		treangles.add(treangle1);

		treangles.add(treangle3);

		treangles.add(treangle5);

		GeometryLogic logic = new GeometryLogic();
		GeometryPresentation view = new GeometryPresentation();

		view.ViewSum(logic.Sum(treangles, totalarea, treangle1, treangle3, treangle5, S));

	}

}
