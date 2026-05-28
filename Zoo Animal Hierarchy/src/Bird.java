//Keenan Roberts
// Date: 5/27/2026
// Assignment: Assignment 11 - Zoo Animal Hierarchy

public class Bird extends Animal
{
    private boolean _canFly;
    public Bird(String name, int age, double weight, boolean canFly)
    {
        super(name, age, weight);
        _canFly = canFly;
    }

    //Accessor
    public boolean getCanFly()
    {
        return _canFly;
    }

    @Override
        public String makeSound()
        {
            return "Tweet!";
        }
    @Override
        public String getFavoriteFood()
        {
            return "seeds";
        }
}
