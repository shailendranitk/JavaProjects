import org.omg.Messaging.SyncScopeHelper;

interface Vehicle {
	void start();
}

class StartVehicle {

	public void start(Vehicle v) {
		// TODO Auto-generated method stub
		System.out.println("Executing the code block");
		v.start();

	}

}

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Legacy
		StartVehicle v = new StartVehicle();
		v.start(new Vehicle() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Start vehicle");
			}
		});

		// Lambda

		/*
		 * Vehicle jeep = ()-> System.out.println("Jeep started");
		 * jeep.start("Mahindra");
		 */

		// Lambda with variable
		/*
		 * String model_no="Mahindra 2016"; Vehicle mahindra = ("") ->
		 * System.out.println("Jeep started"); jeep.start();
		 */

		System.out.println("-----------------------------------------");

		StartVehicle car = new StartVehicle();
		car.start(() -> System.out.println("Starting jeep"));

		System.out.println("-----------------------------------------");

		StartVehicle sedan = new StartVehicle();
		sedan.start(() -> {
			System.out.println("Starting sedan");
		});

		System.out.println("-----------------------------------------");

		StartVehicle duster = new StartVehicle();
		duster.start(() -> {
			System.out.println("Starting jeep");
			System.out.println("Duster has more to do");
		});
		
		

	}

}
