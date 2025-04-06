package csci201.asmt15;
/*
Course event
Do the programming project: PP 5.9 on page 240 of your textbook.

Submission Instructions: 
Submit only the source code (*.java) file(s).


PP 5.9 Design and implement a class called Bulb that represents a light
bulb that can be turned on and off. Create a driver class called
Lights, whose main method instantiates and turns on some Bulb
objects. 
*/

public class Bulb {
	public boolean isOn = false;
	
	public boolean getLight() {
		return this.isOn;
	}
	
	public String isOnString() {
		return (this.isOn ? "on" : "off");
	}
	
	public void setLight(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void turnOn() {
		this.isOn = true;
	}
	
	
	public void turnOff() {
		this.isOn = false;
	}
}
