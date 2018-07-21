
public class Monitor {
	
	private String model;
	
	private String producer;
	
	private String width;
	
	private Resolution resolution;

	public Monitor(String model, String producer, String width, Resolution resolution) {
		
		this.model = model;
		this.producer = producer;
		this.width = width;
		this.resolution = resolution;
	}
	
	public void  shutDown () {
		
		System.out.println("shut down... ");
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

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

}
