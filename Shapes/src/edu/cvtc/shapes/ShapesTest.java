package edu.cvtc.shapes;

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
		MessageBox messageBox = new MessageBox();
		// new cuboid
		Cuboid cuboid = new Cuboid(10.0f, 10.0f, 10.0f, messageBox);
		// new sphere
		Sphere sphere = new Sphere(10.0f, messageBox);
		// new cylinder
		Cylinder cylinder = new Cylinder(10.0f, 10.0f, messageBox);
		
		cuboid.render();
		sphere.render();
		cylinder.render();
		
		ShapeFactory shapeFactory = new ShapeFactory(messageBox);
		Shape cube = shapeFactory.cuboidBuilder(12, 10, 50, messageBox);
// FOR NOTES...
		// set JOptionPane
//		Component frame = null;
//		// Output cuboid measurements
//		JOptionPane.showMessageDialog(frame, cuboid.render());
//		// Output sphere measurements
//		JOptionPane.showMessageDialog(frame, shpere.render());
//		// Output cylinder measurements
//		JOptionPane.showMessageDialog(frame, cylinder.render());

	}

}
