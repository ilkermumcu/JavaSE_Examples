
public class Mainboard {

	private String model;

	private String producer;

	private int numberOfSlots;

	private String operatingSystem;

	public Mainboard(String model, String producer, int numberOfSlots, String operatingSystem) {

		this.model = model;
		this.producer = producer;
		this.numberOfSlots = numberOfSlots;
		this.operatingSystem = operatingSystem;
	}

	public void operatingSystemInstall(String operatingSystem) {
		this.operatingSystem = operatingSystem;

		System.out.println("Operating System Installed : " + operatingSystem);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getNumberOfSlots() {
		return numberOfSlots;
	}

	public void setNumberOfSlots(int numberOfSlots) {
		this.numberOfSlots = numberOfSlots;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
