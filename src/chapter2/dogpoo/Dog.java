package chapter2.dogpoo;

class Dog {
	int size;
	String breed;
	String name;

	void bark() {
		System.out.println("Ruff! Ruff!");
	}
	void dog() {
		System.out.println("Nome: " + name);
		System.out.println("Tamanho: " + size + " metros de altura");
		System.out.println("Raça: " + breed);
	}
}