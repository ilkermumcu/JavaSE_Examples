
public class Test {
	public static void main(String[] args) {
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("VS1984", "ASUS", "21", resolution);
		Cabinet cabinet = new Cabinet("shd blade", "SHW", "Glass");
		Mainboard mainboard = new Mainboard("T-250", "Asus", 10, "Win10");
		
		Computer computer = new Computer(monitor, cabinet, mainboard);
		
		computer.getCabinet().computerStart();
		computer.getMonitor().shutDown();
		computer.getMainboard().operatingSystemInstall("Linux Ubuntu 18.04");
		
	}

}
