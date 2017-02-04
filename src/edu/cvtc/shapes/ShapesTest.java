package edu.cvtc.shapes;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author gcedarblade
 *
 */
public class ShapesTest {

	/**
	 * 
	 */
	public ShapesTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new cuboid
		Cuboid cuboid = new Cuboid(10.0f, 10.0f, 10.0f);
		// new sphere
		Sphere shpere = new Sphere(10.0f);
		// new cylinder
		Cylinder cylinder = new Cylinder(10.0f, 10.0f);
		// set JOptionPane
		Component frame = null;
		// Output cuboid measurements
		JOptionPane.showMessageDialog(frame, cuboid.render());
		// Output sphere measurements
		JOptionPane.showMessageDialog(frame, shpere.render());
		// Output cylinder measurements
		JOptionPane.showMessageDialog(frame, cylinder.render());

	}

}
