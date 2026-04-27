abstract class Animal {
    public void eat() {
        System.out.println(getClass().getSimpleName() + " is eating");
    }

    public void sleep() {
        System.out.println(getClass().getSimpleName() + " is sleeping");
    }
}

class Dog extends Animal {}

class Cat extends Animal {}
