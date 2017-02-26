package edu.cvtc.shapes;

/**
 * @author gcedarblade
 *
 */
public class ShapeFactory {
	
	private Dialog dialog = null;

	public ShapeFactory(Dialog messageBox) {
		this.dialog = messageBox;
	}
	
	public Shape cuboidBuilder(float width, float height, float depth, Dialog dialog) {
		return new Cuboid(12, 10, 50, null);
		
	}

}
