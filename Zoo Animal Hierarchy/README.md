Zoo Animal Hierarchy
Project Description
The Zoo Animal Hierarchy project is a Java console application that demonstrates the use of object-oriented programming concepts including inheritance, abstraction, polymorphism, encapsulation, and ArrayLists.
The program allows a zoo manager to interact with a collection of animals through a menu-driven interface. Users can view animals, hear animal sounds, feed animals, add new animals, and display feeding information.
________________________________________
Learning Objectives
This project demonstrates:
•	Abstract classes
•	Inheritance
•	Method overriding
•	Polymorphism
•	ArrayLists
•	User input validation
•	Menu-driven program design
•	Encapsulation through getters and protected fields
________________________________________
Class Structure
Animal (Abstract Class)
The Animal class serves as the parent class for all animal types.
Attributes
•	name
•	age
•	weight
Methods
•	describe()
•	makeSound() (abstract)
•	getFavoriteFood() (abstract)
Because Animal is abstract, objects of this class cannot be created directly.
________________________________________
Dog
The Dog class extends Animal.
Behaviors
•	Makes the sound "Woof!"
•	Favorite food is "kibble"
________________________________________
Cat
The Cat class extends Animal.
Behaviors
•	Makes the sound "Meow!"
•	Favorite food is "fish"
________________________________________
Bird
The Bird class extends Animal.
Additional Attribute
•	canFly
Behaviors
•	Makes the sound "Tweet!"
•	Favorite food is "seeds"
________________________________________
Program Features
1. List All Animals
Displays all animals currently in the zoo with:
•	Type
•	Name
•	Age
•	Weight
Example:
Dog: Rex, age 3, 30.5 kg
________________________________________
2. Hear an Animal's Sound
Allows the user to select an animal and hear its corresponding sound.
Example:
Rex says Woof!
________________________________________
3. Feed an Animal
Allows the user to feed a selected animal.
Example:
Whiskers is eating fish.
________________________________________
4. Add a New Animal
Users can add:
•	Dog
•	Cat
•	Bird
The program prompts for:
•	Name
•	Age
•	Weight
Birds also require:
•	Whether they can fly
________________________________________
5. Show Feeding Chart
Displays every animal's:
•	Name
•	Animal type
•	Favorite food
•	Sound
Example:
Rex (Dog) eats kibble and says Woof!
________________________________________
6. Quit
Closes the application.
________________________________________
Input Validation
The program uses the helper method:
verifyHasInt(Scanner input, int low, int hi)
This method:
•	Ensures the user enters an integer.
•	Ensures the integer falls within a valid range.
•	Re-prompts the user until valid input is entered.
This prevents the program from crashing due to invalid menu selections or animal choices.
________________________________________
Object-Oriented Concepts Used
Abstraction
The Animal class defines common behavior while leaving specific implementations to subclasses.
Inheritance
Dog, Cat, and Bird inherit from Animal.
Polymorphism
Animals are stored in:
ArrayList<Animal>
allowing different animal types to be treated uniformly.
Method Overriding
Each subclass provides its own implementation of:
makeSound()
getFavoriteFood()
Encapsulation
Animal data is protected and accessed through getter methods.
________________________________________
Sample Starting Animals
The zoo is preloaded with:
Type	Name	Age	Weight
Dog	Rex	3	30.5 kg
Cat	Whiskers	5	4.2 kg
Bird	Tweety	1	0.05 kg
________________________________________
How to Run
1.	Compile all Java files.
2.	Run Main.java.
3.	Follow the menu prompts.
4.	Enter menu selections between 1 and 6.
________________________________________
Author
Keenan Roberts
Zoo Animal Hierarchy
5/30/2026