/*________________01.

*/
//________________02. Variable________________________________________
/*
Primitive = simple value stored directly in memory (stack)
Reference = memory address (stack) that points to the (heap)

Primitive   vs   Reference
---------        ----------
int              string
double           array
char             object
boolean

int age = 21;
System.out.println("I am " + age + "years old");

String name = "Ho Minh Nhut";
*/
//________________03. User Input______________________________________
/*
-> import java.util.Scanner;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: " );
        String name = sc.nextLine();
        System.out.println("Hello "+name+"!");

        System.out.print("Enter your age: " );
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("You are "+age+" years old!");

        System.out.print("Enter your gpa: " );
        double gpa = sc.nextDouble();
        System.out.println("You are "+gpa+" years old!");

        sc.close();
*/
//________________04. MAD LIBS GAME___________________________________
/*
 */
//________________05. Arithmetic______________________________________
/*
 */
//________________06. Shopping cart program___________________________
/*
 */
//________________07. If Statement____________________________________
/*
if(statement)
{
    //Thing do if statement true
}else{
    //Thing do if statement false
}
 */
//________________08. Random number___________________________________
/*
> import java.util.Random;
    Random rand = new Random();
    boolean number = rand.nextBoolean();
    if (number == true)
    {
        System.out.println("HEADS");
    }else {
        System.out.println("TAILS");
    }
 */
//________________09. Math class______________________________________
/*
        System.out.println(Math.PI);
        System.out.println(Math.E);
        double Result;
        Result = Math.pow(2,3);
        Result = Math.abs(-10);
        Result = Math.sqrt(9);
        Result = Math.round(3.14);      //3 :Round
        Result = Math.ceil(3.14);       //4 :Round up
        Result = Math.floor(3.14);      //3 :Round down
        Result = Math.max(10,20);
        Result = Math.min(10,20);
        System.out.println(Result);

        //Hypotenuse c = Math.sqrt(power(a,2)+power(b,2));
        Scanner sc = new Scanner(System.in);
        double a; double b; double c;
        System.out.print("Enter length of side A: ");
        a = sc.nextDouble();
        System.out.print("Enter length of side B: ");
        b = sc.nextDouble();
        c = Math.sqrt(Math.pow(a,2) + b*b);
        System.out.print("Length of side C: " + c);
        sc.close();
 */
//________________10. Printf__________________________________________
/*
    printf() = a method used to format output
    %[flag][width][.precision][specifier-character]

    String name = "Spongebob";
    char firstLetter = 'S';
    int age = 30;
    double height = 60.5;
    boolean isEmployed = true;

    System.out.printf("Hello %s", name);
    System.out.printf("\nYour name start with a %c", firstLetter);
    System.out.printf("\nYour age %d year old", age);
    System.out.printf("\nYour height %.2f meters", height);
    System.out.printf("\nEmployed: %b", isEmployed);

    System.out.printf("\n%s is %d year old", name, age);
 */
//________________11. Compound interest calculator____________________
/*
    Scanner sc = new Scanner(System.in);
    double principle;       double rate;
    int timesCompounded;    int years;
    double amount;

    System.out.print("Enter the principle amount: ");
    principle = sc.nextDouble();
    System.out.print("Enter the interest rate (in %): ");
    rate = sc.nextDouble()/100;
    System.out.print("Enter the # of times compounded per year: ");
    timesCompounded = sc.nextInt();
    System.out.print("Enter the # of years: ");
    years = sc.nextInt();
    amount = principle * Math.pow(1+ (rate/timesCompounded), timesCompounded*years);
    System.out.print("The amount after " + years + " is: $" + amount);
    sc.close();
 */
//________________12. Nested if statements____________________________
/*

 */
//________________13. String methods__________________________________
/*
        String name = "Minh Nhut";
        int length = name.length();                 //-> 9
        char letter = name.charAt(1);               //-> i
        int index = name.indexOf("h");              //-> 3
        int lastIndex = name.lastIndexOf("h");  //->6
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = "       Minh Nhut";
        name = name.trim();                         //-> Minh Nhut
        name = name.replaceAll("h", "k");
        if(name.isEmpty())
        {
            System.out.println("Empty name");
        }else
        {
            System.out.println("Hello: " + name);
        }
        boolean contains = name.contains("h");      //true
        boolean equals = name.equals("passworld");  //flase
        System.out.println(name);
 */
//________________14. Substrings______________________________________
/*
    .substring() = A method used to extract a portion of string
                   .substring(start,end)
 */
//________________15. Weight converse_________________________________
/*
        sScanner sc = new Scanner(System.in);
        double weight;        double newWeight;     int choice;
        System.out.println("Welcome to Weight Converse Program");
        System.out.println("Op1: lbs to kgs");
        System.out.println("Op2: kgs to lbs");
        System.out.print("Choice an option: ");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter weight in lbs");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("New weight in lbs is %.2f", newWeight);
        } else if (choice == 2) {
            System.out.println("Enter weight in kgs");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("New weight in kgs is %.2f", newWeight);
        }else{
            System.out.println("Invalid option");
        }
        sc.close();

*/
//________________16. Ternary operator _______________________________
/*
    ternary operator ? = Return 1 of 2 if condition is true
    variable = (condition)? ifTrue : ifFalse
 */
//________________17. Temperature converter___________________________
/*

 */
//________________18. Switch__________________________________________
/*
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        switch (number)
        {
            case 2:
                System.out.println("This is Monday");
                break;
            case 3:
                System.out.println("This is Tuesday");
                break;
            case 4:
                System.out.println("This is Wednesday");
                break;
            case 5:
                System.out.println("This is Thursday");
                break;
            case 6:
                System.out.println("This is Friday");
                break;
            case 7:
                System.out.println("This is Saturday");
                break;
            case 8:
                System.out.println("This is Sunday");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        sc.close();


    Enhance switch (Java14)
    switch (day){
        case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
             System. out. println("It is a weekday");
        case "Saturday", "Sunday" ->
             System. out println("It is the weekend");
        default -> System. out println (day + is not a day");
    }


 */
//________________19. Calculator program______________________________
/*
        Scanner sc = new Scanner(System.in);
        double num1;    double num2;    char operator;   double result = 0.0;   boolean validOperator = true;
        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();
        System.out.print("Enter an operator (+,-,*,/,^) : ");
        operator = sc.next().charAt(0);
        switch(operator)
        {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0)
                {
                    System.out.print("Cannot divide by zero");
                }else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.print("Invalid operator");
                validOperator = false;
            }
        }
        if(validOperator){
            System.out.printf("The result is: %.3f", result);
        }
        sc.close();
 */
//________________20. Logical operator________________________________
/*
    && = AND
    || = OR
    !  = NOT
 */
//________________21. While loop______________________________________
/*
    while loop = repeat some code forever while some condition remains true
        Scanner sc = new Scanner(System.in);
        String name = "";
        while (name.isEmpty())
        {
            System.out.print("Enter your name");
            name = sc.nextLine();
        }
        sc.close();
 */
//________________22. Guessing number game____________________________
/*
        Scanner sc = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int guessNumber = 0;
        int counter = 0;
        System.out.print("Guessing number between 0 and 100: ");
        guessNumber = sc.nextInt();
        counter++;
        while(randomNumber != guessNumber)
        {
            if (guessNumber > randomNumber){
                System.out.printf("The number is lower than %d\n", guessNumber);
            }else{
                System.out.printf("The number is upper than %d\n", guessNumber);
            }
            counter++;
            System.out.print("Enter number again: ");
            guessNumber = sc.nextInt();
        }
        System.out.println("You win! The number is " + randomNumber + " | You have try " + counter + " times");
        sc.close();
 */
//________________23. For loop________________________________________
/*
    for(int i = start; i < end; i++)
    {
        //To do thing
    }
*/
//________________24. Break and continues ____________________________
/*
    break : break out of a loop (STOP)
    continues : skip

    for (int i = 0; i < 10; i++)
    {
        if (i == 5) break;
        System.out.print(i + " ");
    }
    -> 0 1 2 3 4

    for (int i = 0; i < 10; i++)
    {
        if (i == 5) continues;
        System.out.print(i + " ");
    }
    -> 0 1 2 3 4 6 7 8 9

*/
//________________25. Nested Loop_____________________________________
/*
    nested loop = a loop inside another loop

    for(int j = 1; j <= 3; j++)
    {
        for(int i = 1; i <= 9; i++)
        {
            System.out.print(i+" ");
        }
    }

*/
//________________26. Methods_________________________________________
/*
    method = a block of reusable code that is executed when called ()

    static void happyBirthday(int n, String name, int age)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println("Happy Birthday");
            System.out.printf("Happy Birthday dear %s\n", name);
            System.out.println("You are " + age + " years old");
            System.out.println("Happy Birthday\n");
        }
    }
    static double square(double x){return x*x;}
    static double cube(double x){return x*x*x;}
    static String getFullName(String firstName, String lastName){return firstName + " " + lastName;}
    static boolean ageCheck(int age){if (age>=18){return true;}return false;}
 */
//________________27. Overloaded methods______________________________
/*
    overloaded methods = methods that share the same name,
                         but different parameters
                         signature = name + parameters
    static double add(double a, double b) {return a+b;}
    static double add(double a, double b, double c) {return a+b+c;}
 */
//________________28. Variable scope__________________________________
/*
    variable scope = where variable can be accessed
    (Local) and (Class)

    public class Main {
    static int x = 3; //Class
    public static void main(String[] args) {
        int x = 1; //Local
        System.out.println(x);

        doSomething();
    }
    static void doSomething() {int x = 2; System.out.println(x);}
}

 */
//________________29.Banking program _________________________________
/*

*/
//________________30.Roll a dice program______________________________
/*
        public static void main(String[] args) {

        //Dice roller program
        int numOfDice = 0;     int total = 0;
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of dice to roll: ");
        numOfDice = sc.nextInt();
        while (numOfDice <= 0)
        {
            System.out.println("Number of dice must greater than 0 ");
            System.out.print("Enter number of dice to roll again: ");
            numOfDice = sc.nextInt();
        }
        sc.close();

        for (int i = 1; i <= numOfDice; i++)
        {
            int numRand = rand.nextInt(1,7);
            printDice(numRand);
            System.out.println("You got: " + numRand);
            total += numRand;
        }
        System.out.println("The total is: " + total);
    }

    static void drawDiceRoll(int number)
    {
        switch (number)
        {
            case 1:
            {
                System.out.println(" ------- ");
                System.out.println("|       |");
                System.out.println("|   ●   |");
                System.out.println("|       |");
                System.out.println(" ------- ");
                break;
            }
            case 2:
            {
                System.out.println(" ------- ");
                System.out.println("|       |");
                System.out.println("|   ●   |");
                System.out.println("| ●     |");
                System.out.println(" ------- ");
                break;
            }
            case 3:
            {
                System.out.println(" ------- ");
                System.out.println("|     ● |");
                System.out.println("|   ●   |");
                System.out.println("| ●     |");
                System.out.println(" ------- ");
                break;
            }
            case 4:
            {
                System.out.println(" ------- ");
                System.out.println("| ●   ● |");
                System.out.println("|       |");
                System.out.println("| ●   ● |");
                System.out.println(" ------- ");
                break;
            }
            case 5:
            {
                System.out.println(" ------- ");
                System.out.println("| ●   ● |");
                System.out.println("|   ●   |");
                System.out.println("| ●   ● |");
                System.out.println(" ------- ");
                break;
            }
            case 6:
            {
                System.out.println(" ------- ");
                System.out.println("| ●   ● |");
                System.out.println("| ●   ● |");
                System.out.println("| ●   ● |");
                System.out.println(" ------- ");
                break;
            }
            default:
                break;
        }
    }

    static void printDice(int roll)
    {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                |     ● |
                |   ●   |
                |       |
                 -------
                """;
        String dice3 = """
                 -------
                |     ● |
                |   ●   |
                | ●     |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll)
        {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
*/
//________________31.Arrays___________________________________________
/*
    String[] fruits = {"Apple", "Banana", "Watermelon", "Orange"};
    fruits[0] = "Pineapple";
    int numberOfFruits = fruits.length;
    Arrays.sort(fruits);
    Arrays.fill(fruits, "Apple");

    for(String fruit : fruits) {
        System.out.println(fruit);
    }
 */
//________________32.Enter user input into an array___________________
/*
        String[] foods; int size;

        Scanner sc = new Scanner(System.in);

        System.out.print("What number do you want to do? : ");
        size = sc.nextInt();        sc.nextLine();
        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter food name: ");
            foods[i] = sc.nextLine();
        }

        sc.close();

        for(String food : foods){System.out.println(food);}
 */
//________________33.Search an array__________________________________
/*
        int[] numbers = {1,9,2,8,3,5,4};
        String target = "PineApple";
        boolean isFound = false;

        String[] fruits = {"Apple", "Banana", "Orange", "Strawberry"};

        for(int i = 0; i < fruits.length; i++)
        {
            if (fruits[i].equals(target))
            {
                System.out.println("Element fond at index " + i);
                isFound = true;
                break;
            }
        }
        System.out.println((isFound)?"It fonded!":"Element not fond in the array!");
 */
//________________34.Varargs__________________________________________
/*
    Variable Arguments =    allow a method to accept a varying # of arguments
                            makes methods more flexible, no need for overloaded methods
                            java will pack the arguments into an array
                             ... (ellipsis)
    static int add(int ... numbers)
    {
        int sum = 0;

        for(int number : numbers)
        {
            sum += number;
        }

        return sum;
    }
    static double average(double... numbers)
    {
        double sum = 0;

        if(numbers.length == 0)
        {
            return 0;
        }

        for (double number : numbers)
        {
            sum += number;
        }
        return sum/numbers.length;
    }

 */
//________________35.2d array_________________________________________
/*
    2D array = An array where each element is an array
               Useful for storing a matrix of data

        String[][] ABC =   {{"A1", "A2", "A3"},
                            {"B1", "B2", "B3"},
                            {"C1", "C2", "C3"}};
        for(String[] check1 : ABC)
        {
            for (String check2 : check1)
            {
                System.out.print(check2 + " ");
            }
            System.out.println("");
        }
 */
//________________36.Quiz game________________________________________
/*

 */
//________________37.Rock paper scissors______________________________
/*

 */
//________________38.Slot machine_____________________________________
/*

 */
//________________39.Object-oriented programming______________________
/*
    Object A =  An entity that holds data (attributes)
                and can perform actions (methods)
                It is a reference data type

    public class Car
    {
        String make = "Ford";
        String model = "Mustang";
        int year = 1990;
        double price = 52000.99;
        boolean isRunning = false;

        void start()
        {
            isRunning = true;
            System.out.println("You started the car");
        }
        void stop()
        {
            isRunning = false;
            System.out.println("you stopped the car");
        }
        void drive()
        {
            System.out.println("You drive the " + model + " car");
        }
        void brake()
        {
            System.out.println("You brake the " + model + " car");
        }
    }


*/
//________________40.Constructors_____________________________________
/*
    Constructor =   A special method to initialize object
                    You can pass arguments to a constructor
                    and set up initial values

    public class Student
    {
        String name;
        int age;
        double gpa;
        boolean isEnrolled;

        Student(String name, int age, double gpa, boolean isEnrolled)
        {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
            this.isEnrolled = isEnrolled;
        }
    }
*/
//________________41.Overloaded constructors__________________________
/*

    public class User
    {
        String username;
        String email;
        String age;

        User(){};
        User(String username)
        {
            this.username = username;
            this.email = "";
            this.age = "0";
        }
        User(String username, String email)
        {
            this.username = username;
            this.email = email;
            this.age = "0";
        }
        User(String username, String email, String age)
        {
            this.username = username;
            this.email = email;
            this.age = age;
        }

    }

*/
//________________42.Array of objects_________________________________
/*
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};

        Car[] cars2 =  {new Car("Mustang", "Red"),
                        new Car("Corvette", "Blue"),
                        new Car("Charger", "Yellow")};

        for (Car car : cars2)
        {
            car.color = "Black";
        }

        for (Car car : cars2)
        {
            car.drive();
        }
 */
//________________43.Static___________________________________________
/*
    static =    Makes a variable or method belong to the class
                rather than to any specific object.
                Commonly used for utility methods or shared resources.
    public class Friend
    {
        String name;
        static int numOfFriends;

        Friend(String name)
        {
            this.name = name;
            numOfFriends++;
        }

        static void showFriends()
        {
            System.out.println("You have " + numOfFriends + " total friends");
        }

    }
 */
//________________44.Inheritance______________________________________
/*
    Inheritance = One class inherits the attributes and methods
                  from another class.
                  Child <- Parent <- Grandparent

 */
//________________45.Super____________________________________________
/*
        super = Refers to the parent class (subclass <- superclass)
                Used in constructors and method overriding
                Calls the parent constructor to initialize attributes

    public class Person
    {
        String firstName;
        String lastName;

        Person(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        void showName()
        {
            System.out.println(firstName + " " + lastName);
        }
    }
    public class Employee extends Person
    {
        int salary;

        Employee(String firstName, String lastName, int salary)
        {
            super(firstName, lastName);
            this.salary = salary;
        }

        void showSalary()
        {
            System.out.println(this.firstName + " " + this.lastName + " salary: " + this.salary + " vnd");
        }
    }
 */
//________________46.Method overriding________________________________
/*
    Method overriding = When a subclass provides its own
                        implementation of a method that is already defined.
                        Allows for code reusability and give specific implementations.

    public class Animal
    {
        void move()
        {
            System.out.println("This animal is running");
        }

    }
    public class Cat extends Animal
    {
    }
    public class Fish extends Animal
    {
        @Override
        void move()
        {
            System.out.println("This animal is swimming");
        }
    }
 */
//________________47.ToString method______________________________________
/*
    .toString() = Method inherited from the Object class.
                  Used to return a string representation of an object.
                  By default, it returns a hash code as a unique identifier
                  It can be overridden to provide meaningful details.
    public class Car
    {
        String make;    String model;       int year;    String color;
        Car(String make, String model, int year, String color)
        {
            this.make = make;        this.model = model;
            this.year = year;        this.color = color;
        }
        @Override
        public String toString()
        {
            return this.make + " " + this.model + " " + this.year + " " + this.color;
        }
    }
    Car car1 = new Car("Ford","Mustang", 2025, "Red");
    System.out.println(car1);
 */
//________________48.Abstraction ______________________________________
/*
    abstract =  Used to define abstract classes and methods.
                Abstraction is the process of hiding implementation details
                and showing only the essential features;
                Abstract classes CAN'T be instantiated directly
                Can contain 'abstract' methods (which must be implemented)
                Can contain 'concrete' methods (which are inherited)

    public abstract class Shape
    {
        abstract double area();

        void display()
        {
            System.out.println("This is a shape");
        }
    }
    public class Circle extends Shape
    {
        double radius;

        Circle(double radius)
        {
            this.radius = radius;
        }

        @Override
        double area()
        {
            return Math.PI * radius * radius;
        }
    }
    public class Triangle extends Shape
    {
        double height;
        double width;

        Triangle(double height, double width)
        {
            this.height = height;
            this.width = width;
        }

        @Override
        double area()
        {
            return 0.5 * height * width;
        }
    }



 */
//________________49.Interfaces______________________________________
/*

 */
//________________50.Polymorphism______________________________________
/*

 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);


        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}

