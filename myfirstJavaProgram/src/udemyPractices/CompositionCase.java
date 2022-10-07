package udemyPractices;

public class CompositionCase {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private CompositionDimensions dimensions; //another class
	
	public CompositionCase(String model, String manufacturer, String powerSupply, CompositionDimensions dimensions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	public void pressButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public CompositionDimensions getDimensions() {
		return dimensions;
	}
	
	
}
