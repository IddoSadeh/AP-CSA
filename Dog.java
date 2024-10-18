public class Dog {
    // Properties (data)
    private String name;
    private String breed;
    private int age;

    // Constructor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Methods (behaviours)
    public void bark() {
        System.out.println("Woof!");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String toString(){
        return "hey";
    }


}