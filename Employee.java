public class Employee {
    public double calculateBonus(String type) {
        if (type.equals("Manager")) {
            return 5000;
        } else if (type.equals("Developer")) {
            return 3000;
        } else {
            return 1000;
        }
    }
}
}

