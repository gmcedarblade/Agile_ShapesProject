package edu.cvtc.shapes;


abstract class Shape {
	
	protected Dialog messageBox;
	
	// Method for surfaceArea
	abstract float surfaceArea();
	// Method for volume
	abstract float volume();
	// Method for render
	abstract int render();
	
	protected int displayMessage(String title, String message) {
		return messageBox.show(message, title);
	}
	
	public Shape (Dialog dialog) {
		this.messageBox = dialog;
	}
}
