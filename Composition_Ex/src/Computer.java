
public class Computer {
	
	private Monitor monitor;
	
	private Cabinet cabinet;
	
	private Mainboard mainboard;

	public Computer(Monitor monitor, Cabinet cabinet, Mainboard mainboard) {

		this.monitor = monitor;
		this.cabinet = cabinet;
		this.mainboard = mainboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Cabinet getCabinet() {
		return cabinet;
	}

	public void setCabinet(Cabinet cabinet) {
		this.cabinet = cabinet;
	}

	public Mainboard getMainboard() {
		return mainboard;
	}

	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
	
	

}
