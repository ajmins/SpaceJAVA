package udemyPractices;


public class CompositionMonitor {

	private String model;
	private String manufacturer;
	private int size;
	private CompositionResolution nativeResolution; //another class
	
	public CompositionMonitor(String model, String manufacturer, int size, CompositionResolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}

	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at "+ x + ","+ y + " in color "+ color);
	}
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public CompositionResolution getNativeResolution() {
		return nativeResolution;
	}
	

	
	
}
