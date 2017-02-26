package edu.cvtc.shapes;


abstract class Shape {
	
	protected Dialog messageBox;
	protected Dialog getMessageBox() {
		return messageBox;
	}
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	// Method for surfaceArea
	abstract float surfaceArea();
	// Method for volume
	abstract float volume();
	// Method for render
	abstract void render();
	
	public Shape (Dialog dialog) {
		setMessageBox(dialog);
	}
}
