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
                case 6:
                    quit = true;
                    break;
            }

       }while(!quit);
        input.close();
    }


    public static void prepopulateZoo(ArrayList<Animal> zoo, Dog d, Cat c, Bird b)
    {
        zoo.add(d);
        zoo.add(c);
        zoo.add(b);
    }

    public static int displayMenu(Scanner input)
    {
        int choice = 0;

        System.out.println("===== ZOO MANAGER =====");
        System.out.println("1. List all animals \n2. Hear an animal's sound " 
            + "\n3. Feed an animal \n4. Add a new animal " 
            + "\n5. Show feeding chart (all animals) \n6. Quit");
        System.out.println("=======================");
        System.out.print("Enter choice: ");
        
        return choice = verifyHasInt(input);
    }

    public static void listAllAnimals(ArrayList<Animal> zoo)
    {
        for(int i = 0; i < zoo.size(); i++)
        {
            System.out.println((i + 1) + ". " + zoo.get(i).describe());
        }
    }

    public static int verifyHasInt(Scanner input)
    { 
        int choice = 0;
        if(input.hasNextInt())// checks if the input has an int
        {
            choice = input.nextInt();
            input.nextLine();
            if(choice > 0 && choice <= 6)// checks that the choice is in range
            {
                return choice;
            }
            else
            {
                System.out.println("Invalid choice. Please try again."); //displays if choice is out of range
                input.next();
            }    
        }
        else
        {
            System.out.println("Invalid choice. Please try again.");// displays if not an int
            input.nextLine();
        }
        return choice;
    }
}
