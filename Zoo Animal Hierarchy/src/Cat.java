//Keenan Roberts
// Date: 5/27/2026
// Assignment: Assignment 11 - Zoo Animal Hierarchy

public class Cat extends Animal
{
    public Cat(String name, int age, double weight)
    {   
        super(name, age, weight);
    }

    @Override
        public String makeSound()
        {
            return "Meow!";
        } 

    @Override
        public String getFavoriteFood()
        {
            return "fish";
        }
}
