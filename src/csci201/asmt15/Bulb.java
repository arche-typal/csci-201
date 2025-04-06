package csci201.asmt15;

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
