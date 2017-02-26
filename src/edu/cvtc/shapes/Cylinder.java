package edu.cvtc.shapes;


/**
 * @author gcedarblade
 *
 */
public class Cylinder extends Shape {

	// set variables
	private float radius = 0.0f;
	
	private float height = 0.0f;
	
	
	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}


	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}


	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	// constructor
	public Cylinder(float radius, float height, Dialog dialog) {
		super(dialog);
		setRadius(radius);
		setHeight(height);
	}
    
	@Override
	public
	float surfaceArea() {
		// calc surface area
		return 2.0f * (float)Math.PI * getRadius() * getHeight() + 2.0f * (float)Math.PI * (getRadius() * getRadius());
	}


	@Override
	public
	float volume() {
		// calc volume
		return (getRadius() * getRadius()) * (float)Math.PI * getHeight();
	}


	@Override
	public
	void render() {
		// TODO Auto-generated method stub
		super.getMessageBox().show("Cylinder's Surface area: " + String.valueOf(surfaceArea()) + ", Volume: " + String.valueOf(volume()), "Cylinder");
	}

}
