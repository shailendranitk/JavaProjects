package LambdaReturns;

interface Motor {
	int start();
}

class Vehicle {

	public void run(Motor v) {
		// TODO Auto-generated method stub
		System.out.println("Executing the code block");
		int kiloMeter =v.start();
		System.out.println("Returning the km driven:"+kiloMeter+"km");

	}

}

public class Kilometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Legacy
		Vehicle v = new Vehicle();
		v.run(new Motor() {

			@Override
			public int start() {
				// TODO Auto-generated method stub
				System.out.println("Start vehicle");
				return 500;
			}
		});

		
		System.out.println("-----------------------------------------");

		Vehicle car = new Vehicle();
		car.run(() ->  200);

		System.out.println("-----------------------------------------");

		Vehicle sedan = new Vehicle();
		sedan.run(() -> {
			System.out.println("Starting sedan");
			return 200;
		});

		System.out.println("-----------------------------------------");

		Vehicle duster = new Vehicle();
		duster.run(() -> {
			System.out.println("Starting jeep");
			System.out.println("Duster has more to do");
			return 1000;
		});
		
		

	}

}
