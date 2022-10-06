package udemyPractices;


public class VehicleClass {

		private String name;
		private String size;
		
		private int currentVelocity;
		private int currentDirection;
		
		
		public VehicleClass(String name, String size) {
			this.name = name;
			this.size = size;
			this.currentVelocity = 0;
			this.currentDirection = 0;
		}

		public void steer(int direction) {
			this.currentDirection += direction;
			System.out.println("Vehicle.steer() method: Current direction: at " + currentDirection + " in degrees");
		}
		
		public void move(int speed, int direction) {
			currentVelocity = speed;
			currentDirection = direction;
			System.out.println("Vehicle.move() method: Current direction: at " + currentDirection + " in degrees and at the speed: " +currentVelocity);
		}

		public String getName() {
			return name;
		}

		public String getSize() {
			return size;
		}

		public int getCurrentVelocity() {
			return currentVelocity;
		}
		public int getCurrentDirection() {
			return currentDirection;
		}
		
		public void stop() {
			this.currentVelocity = 0;
		}
		
		
		
		
		
		
		
		
		
}
