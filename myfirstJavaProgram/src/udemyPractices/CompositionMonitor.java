package udemyPractices;


public class CompositionMonitor {

	private String model;
	private String manufacturer;
	private int size;
	private CompositionResolution nativeResolution;
	
	public CompositionMonitor(String model, String manufacturer, int size, CompositionResolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
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
