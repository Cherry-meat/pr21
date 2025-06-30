package com.company.Main;

abstract class Logistics {
    abstract String getName();
}

abstract class Factory {
    public abstract Logistics createLogistic();
}

class TruckFactory extends Factory {
    public Logistics createLogistic() {
        return new Truck();
    }
}

class BoatFactory extends Factory {
    public Logistics createLogistic() {
        return new Boat();
    }
}

class PlaneFactory extends Factory {
    public Logistics createLogistic() {
        return new Plane();
    }
}

class Truck extends Logistics {
    public String getName() {
        return "Truck";
    }
}

class Boat extends Logistics {
    public String getName() {
        return "Boat";
    }
}

class Plane extends Logistics {
    public String getName() {
        return "Plane";
    }
}

public class Main {
    public static void main(String[] args) {
        Factory sea = new BoatFactory();
        Factory air = new PlaneFactory();
        Factory earth = new TruckFactory();
        Logistics myboat = sea.createLogistic();
        Logistics myplane = air.createLogistic();
        Logistics mytruck = earth.createLogistic();
        System.out.println("Создан объект: " + myboat.getName());
        System.out.println("Создан объект: " + myplane.getName());
        System.out.println("Создан объект: " + mytruck.getName());
    }
}
