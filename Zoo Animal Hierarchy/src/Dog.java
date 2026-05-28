//Keenan Roberts
// Date: 5/27/2026
// Assignment: Assignment 11 - Zoo Animal Hierarchy

public class Dog extends Animal
{
    public Dog(String name, int age, double weight)
    {
        super(name, age, weight);
    }

    @Override
        public String makeSound()
        {
            return "Woof!";
        }
    @Override
        public String getFavoriteFood()
        {
            return "kibble";
        }
}
