package chapter2.dogpoo;

class DogTestDrive {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.size = 55;
		d.name = "Caramelo";
		d.breed = "Vira-lata (SRD)";
		d.dog();
		System.out.println(" ");
		d.bark();
	}
}