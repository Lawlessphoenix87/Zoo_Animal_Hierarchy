//Keenan Roberts
// Date: 5/27/2026
// Assignment: Assignment 11 - Zoo Animal Hierarchy

public abstract class Animal 
{
    protected String _name;
    protected int _age;
    protected double _weight;

    //Constructor
    public Animal(String name, int age, double weight)
    {
        _name = name;
        _age = age;
        _weight = weight;
    }

    //Accessors
    public String GetName() {return _name;}
    public int GetAge() {return _age;}
    public double GetWeight() {return _weight;}


    // ======== METHOD LIBRARY ========
    public String describe()
    {
        return getClass().getSimpleName() + ": " + _name + ", age " + _age 
            + ", " + _weight + " kg";
    }

    public abstract String makeSound();
    public abstract String getFavoriteFood();
}

