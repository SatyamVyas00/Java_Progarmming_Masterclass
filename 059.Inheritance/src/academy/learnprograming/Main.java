package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal("Animal",1,1,5,5);

	Dog dog = new Dog("Doggy",8,20,2,4,1,20,"long silky");
//	dog.eat();
//	dog.walk();
	dog.run();

	Fish fish = new Fish("Fish",4,5,2,2,2);
    }
}
