import java.util.ArrayList;
import java.util.Scanner;

// Superclass
class Animal {
    protected String name;
    protected int age;
    protected String habitat;

    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Habitat: " + habitat);
    }
}

// Subclass 1: Mammal
class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String habitat, String furColor) {
        super(name, age, habitat);
        this.furColor = furColor;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fur Color: " + furColor);
    }
     // New method for Mammal
     public void produceMilk() {
        System.out.println(name + " is producing milk.");
    }
}

// Subclass 2: Bird
class Bird extends Animal {
    private double wingspan;

    public Bird(String name, int age, String habitat, double wingspan) {
        super(name, age, habitat);
        this.wingspan = wingspan;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wingspan: " + wingspan + " meters");
    }
    // New method for Bird
    public void fly() {
        System.out.println(name + " is flying with a wingspan of " + wingspan + " meters.");
    }
}

// Subclass 3: Fish
class Fish extends Animal {
    private int numberOfFins;

    public Fish(String name, int age, String habitat, int numberOfFins) {
        super(name, age, habitat);
        this.numberOfFins = numberOfFins;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Fins: " + numberOfFins);
    }
    public void swim() {
        System.out.println(name + " is swimming with " + numberOfFins + " fins.");
    }
}

// Kingdom class to manage animals
class Kingdom {

    private ArrayList<Animal> animals = new ArrayList<>();
    
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void displayAllAnimals() {
        for (Animal animal : animals) {
            animal.displayDetails();
            if (animal instanceof Mammal) {
                ((Mammal) animal).produceMilk(); // Call Mammal-specific method
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly(); // Call Bird-specific method
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim(); // Call Fish-specific method
            }
            System.out.println("-------------------");

        }
    }
}

// Main class to test the system
public class partTwo {
    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom();
        
        System.out.println("Welcome to the Animal Kingdom Simulator!");
        // auto matice 
        // Create animals
        Mammal lion = new Mammal("Lion", 5, "Savannah", "Golden");
        Bird eagle = new Bird("Eagle", 3, "Mountains", 2.1);
        Fish shark = new Fish("Shark", 10, "Ocean", 5);

        // Add animals to the kingdom
        kingdom.addAnimal(lion);
        kingdom.addAnimal(eagle);
        kingdom.addAnimal(shark);
        // //manual
        //Scanner scanner = new Scanner(System.in);
        // while (true) {
        //     System.out.println("\nChoose an animal type to add:");
        //     System.out.println("1. Mammal");
        //     System.out.println("2. Bird");
        //     System.out.println("3. Fish");
        //     System.out.println("4. Exit and Display Animals");
        //     System.out.print("Enter your choice: ");
        //     int choice = scanner.nextInt();
        //     scanner.nextLine(); // Consume the newline character

        //     if (choice == 4) {
        //         break; // Exit the loop
        //     }

        //     System.out.print("Enter the animal's name: ");
        //     String name = scanner.nextLine();

        //     System.out.print("Enter the animal's age: ");
        //     int age = scanner.nextInt();
        //     scanner.nextLine(); // Consume the newline character

        //     System.out.print("Enter the animal's habitat: ");
        //     String habitat = scanner.nextLine();

        //     switch (choice) {
        //         case 1: // Mammal
        //             System.out.print("Enter the mammal's fur color: ");
        //             String furColor = scanner.nextLine();                    kingdom.addAnimal(new Mammal(name, age, habitat, furColor));
        //             break;

        //         case 2: // Bird
        //             System.out.print("Enter the bird's wingspan (in meters): ");
        //             double wingspan = scanner.nextDouble();
        //             scanner.nextLine(); // Consume the newline character
        //             kingdom.addAnimal(new Bird(name, age, habitat, wingspan));
        //             break;

        //         case 3: // Fish
        //             System.out.print("Enter the fish's number of fins: ");
        //             int numberOfFins = scanner.nextInt();
        //             scanner.nextLine(); // Consume the newline character
        //             kingdom.addAnimal(new Fish(name, age, habitat, numberOfFins));
        //             break;

        //         default:
        //             System.out.println("Invalid choice. Please try again.");
        //             break;
        //     }
        // }

        // Display all animals
        kingdom.displayAllAnimals();
    }
}