package udemyPractices.Composition;

public class CompositionPC {
	
	private CompositionCase theCase;
	private CompositionMonitor monitor;
	private CompositionMotherboard motherboard;
	
	public CompositionPC(CompositionCase theCase, CompositionMonitor monitor,
			CompositionMotherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public CompositionCase getTheCase() {
		return theCase;
	}

	public CompositionMonitor getMonitor() {
		return monitor;
	}

	public CompositionMotherboard getMotherboard() {
		return motherboard;
	}
	
	
}
