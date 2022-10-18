package udemyPractices.InnerClasses;


public class GearBoxMain {

	public static void main(String[] args) {
		//instance of gearbox
		GearBox mcLaren = new GearBox(6);
		
		//outerclass.innerclass;  
		//will throw error if we create a gear object without the instance of outerclass
		//GearBox.Gear first = mcLaren.new Gear(1,12.3);
		//GearBox.Gear second = new Gear(12, 50.3); -> error
		//GearBox.Gear third = new mcLaren.Gear(3,17.8); -> error
		//System.out.println(first.driveSpeed(1000));
		
		mcLaren.addGear(1,5.3);
		mcLaren.addGear(2,10.3);
		mcLaren.addGear(3,15.6);
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));
		mcLaren.operateClutch(true);
		mcLaren.changeGear(3);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(6000));

	}

}
