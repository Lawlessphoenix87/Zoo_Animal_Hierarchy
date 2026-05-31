//Keenan Roberts
// Date: 5/27/2026
// Assignment: Assignment 11 - Zoo Animal Hierarchy

import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Animal> zoo = new ArrayList<Animal>();
        Dog dog = new Dog("Rex", 3, 30.5);
        Cat cat = new Cat("Whiskers", 5, 4.2);
        Bird bird = new Bird("Tweety", 1, .05, true);
        int choice;
        boolean quit = false;

        prepopulateZoo(zoo, dog, cat, bird);

        
       do
       {
            choice = displayMenu(input);

            switch (choice)
            {
                case 1:
                    listAllAnimals(zoo);
                    break;
                case 2:
                    hearAnimalSound(zoo, input);
                    break;
                case 3:
                    feedAnimal(zoo, input);
                    break;
                case 4:
                    addNewAnimal(zoo, input);
                    break;
                case 5: 
                    showFeedingChart(zoo);
                    break; 
                case 6:
                {
                    System.out.println("Zoo closing for the night. Goodbye!");
                    quit = true;
                    break;
                }
            }

       }while(!quit);
        input.close();
    }



    //      ========METHOD LIBRARY========

    public static int displayMenu(Scanner input)
    {
        System.out.println("===== ZOO MANAGER =====");
        System.out.println("1. List all animals \n2. Hear an animal's sound " 
            + "\n3. Feed an animal \n4. Add a new animal " 
            + "\n5. Show feeding chart (all animals) \n6. Quit");
        System.out.println("=======================");
        System.out.print("Enter choice: ");
        
        int choice = verifyHasInt(input, 0, 6);
        return choice;
    }

    public static void listAllAnimals(ArrayList<Animal> zoo)
    {
        for(int i = 0; i < zoo.size(); i++)
        {
            System.out.println((i +1) + ". " + zoo.get(i).describe());
        }
    }

    public static void hearAnimalSound(ArrayList<Animal> zoo, Scanner input)
    {
        listAllAnimals(zoo);
        System.out.print("Which animal's sound would you like to hear? ");
        int choice = verifyHasInt(input, 0, zoo.size());
        Animal a = zoo.get(choice - 1);
        System.out.println(a._name + " says " + a.makeSound());
    }

    public static void feedAnimal(ArrayList<Animal> zoo, Scanner input)
    {
        listAllAnimals(zoo);
        System.out.print("Which animal would you like to feed? ");
        int choice = verifyHasInt(input, 0, zoo.size());
        Animal a = zoo.get(choice - 1);
        System.out.println(a._name + " is eating " + a.getFavoriteFood() + ".");
    }

    public static void addNewAnimal(ArrayList<Animal> zoo, Scanner input)
    {
        System.out.print("Which type of new animal? ");
        String animalType = input.nextLine();
        if(animalType.equalsIgnoreCase("Dog"))
        {
            System.out.print("Enter name:");
            String name = input.nextLine();
            System.out.print("Enter age: ");
            int age = verifyHasInt(input, 0, 500);
            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();

            Dog d = new Dog(name, age, weight);
            zoo.add(d);
        }
        else if(animalType.equalsIgnoreCase("Cat"))
        {
            System.out.print("Enter name:");
            String name = input.nextLine();
            System.out.print("Enter age: ");
            int age = verifyHasInt(input, 0, 500);
            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();

            Cat c = new Cat(name, age, weight);
            zoo.add(c);
        }
        else if(animalType.equalsIgnoreCase("Bird"))
        {
            System.out.print("Enter name:");
            String name = input.nextLine();
            System.out.print("Enter age: ");
            int age = verifyHasInt(input, 0, 500);
            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();
            input.nextLine();
            System.out.print("Can it fly? (Y/N)");
            char ch = input.nextLine().charAt(0);
            boolean canFly;
            if( ch == 'y' || ch == 'Y')
            {
                canFly = true;
            } 
            else
            {
                canFly = false;
            }
            Bird b = new Bird(name, age, weight, canFly);
            zoo.add(b);
            
        }
    }

    public static void showFeedingChart(ArrayList<Animal> zoo)
    {
        for(int i = 0; i < zoo.size(); i++)
        {Animal a = zoo.get(i);
            System.out.println(a._name + " (" + a.getClass().getSimpleName()
             + ") eats " + a.getFavoriteFood() + " and says " + a.makeSound());
        }
    }


    // ____________________HELPER METHODS___________________
     public static void prepopulateZoo(ArrayList<Animal> zoo, Dog d, Cat c, Bird b)
    {
        zoo.add(d);
        zoo.add(c);
        zoo.add(b);
    }

    public static int verifyHasInt(Scanner input, int low, int hi)
    { 
        int choice;

        while(true)
        {    
            if(input.hasNextInt())// checks if the input has an int
            {
                choice = input.nextInt();
                input.nextLine();

                if(choice >= low && choice <= hi)// checks that the choice is in range
                {
                    return choice;
                }
            }
            else
            {
                input.next();
            }        

            System.out.println("Invalid choice. Please try again.");// displays if not an int
            
        }
    }
}
