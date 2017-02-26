package edu.cvtc.shapes;



public class Cuboid extends Shape {
	
	//set variables 
	private float width = 0.0f;
	
	private float height = 0.0f;
	
	private float depth = 0.0f;
	
	
	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
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


	/**
	 * @return the depth
	 */
	public float getDepth() {
		return depth;
	}


	/**
	 * @param depth the depth to set
	 */
	public void setDepth(float depth) {
		this.depth = depth;
	}


	public Cuboid(float width, float height, float depth, Dialog dialog) {
		// Set dimensions
		super(dialog);
		setWidth(width);
		setHeight(height);
		setDepth(depth);
		
	}
	

	@Override
	public
	float surfaceArea() {
		//calc suface area
		float surfaceArea = (getWidth() * getDepth() + getHeight() * getDepth() + getHeight() * getWidth()) * 2.0f; 
		return surfaceArea;
	}


	@Override
	public
	float volume() {
		// calc volume
		float volume =  getWidth() * getDepth() * getHeight();
		return volume;
	}


	@Override
	public void render() {
		// TODO Auto-generated method stub
		//return displayMessage("Cuboid's Surface area: " + String.valueOf(surfaceArea()) + ", Volume: " + String.valueOf(volume()), "Cubiod");
		super.getMessageBox().show("Cuboid's Surface area: " + String.valueOf(surfaceArea()) + ", Volume: " + String.valueOf(volume()), "Cuboid");
	}

}
