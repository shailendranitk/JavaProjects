interface Animal {
	void speak();
}

class Dog implements Animal {
	public void speak() {
		System.out.println("Dog speaking");
		System.out.println("Bhow Bhow...");
	}
}

public class SimpleLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal labrodor = new Dog();
		labrodor.speak();

		System.out.println("------------------------------------------");

		Animal cuckoo = () -> System.out.println("Cuckoo speaking \n coooee coooe");
		cuckoo.speak();

		System.out.println("------------------------------------------");

		Animal fox = () -> {
			System.out.println("Fox speaking");
			System.out.println("Houl.. Houl...");
		};
		fox.speak();

	}

}
