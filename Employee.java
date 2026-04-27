abstract class Employee {
    abstract double calculateBonus();
}

class Manager extends Employee {
    double calculateBonus() { return 5000; }
}

class Developer extends Employee {
    double calculateBonus() { return 3000; }
}

class Intern extends Employee {
    double calculateBonus() { return 1000; }
}

