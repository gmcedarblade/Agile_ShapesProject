package edu.cvtc.shapes;


/**
 * @author gcedarblade
 *
 */
public class Sphere extends Shape {

	private float radius = 0.0f;
	
	
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

	// constructor
	public Sphere(float radius, Dialog dialog) {
		super(dialog);
		setRadius(radius);
	}

	@Override
	public
	float surfaceArea() {
		//calc suface area
		return 4.0f * (float)Math.PI * getRadius() * getRadius();
	}


	@Override
	public
	float volume() {
		// calc volume
		return 4.0f / 3.0f * (float)Math.PI * (getRadius() * getRadius() * getRadius());
	}


	@Override
	public void render() {
		// TODO Auto-generated method stub
		super.getMessageBox().show("Sphere's Surface area: " + String.valueOf(surfaceArea()) + ", Volume: " + String.valueOf(volume()), "Sphere");
	}
	
	

}
