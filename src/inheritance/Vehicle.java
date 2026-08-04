package inheritance;

class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }

}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is Driving");
    }

}
