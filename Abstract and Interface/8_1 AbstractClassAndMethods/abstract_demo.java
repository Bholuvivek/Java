import java.util.Scanner;
abstract class Animal{
	abstract public void makeSound();
}

abstract class PetAnimal extends Animal{
	
	public void getType(){
		System.out.println("This is a Pet Animal");
	}
}
class Dog extends PetAnimal{
		public void makeSound(){
			System.out.println("Bow...Wow");
		}
}

class Cat extends PetAnimal{
	public void makeSound(){
			System.out.println("Meow...Meow");
		}
}

class AbstractDemo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 1 to select Dog and 2 to select Cat");
		int choice = sc.nextInt();
		PetAnimal a; // = new Animal();
		if (choice == 1)
			a = new Dog();
		else
			a = new Cat();
		a.makeSound();
	}
}