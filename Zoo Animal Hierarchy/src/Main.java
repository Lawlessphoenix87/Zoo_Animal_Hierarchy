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

        prepopulateZoo(zoo, dog, cat, bird);

        listAllAnimals(zoo);

    }


    public static void prepopulateZoo(ArrayList<Animal> zoo, Dog d, Cat c, Bird b)
    {
        zoo.add(d);
        zoo.add(c);
        zoo.add(b);
    }

    public static void listAllAnimals(ArrayList<Animal> zoo)
    {
        for(int i = 0; i < zoo.size(); i++)
        {
            System.out.println((i + 1) + ". " + zoo.get(i).describe());
        }
           
    }
}
