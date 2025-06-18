abstract class Logistics{
    String name;
}
abstract class Factory{
    public abstract Logistics createLogistic();
}
class TruckFactory extends Factory{
    public Logistics createLogistic(){
        return new Truck();
    }
}
class BoatFactory extends Factory{
    public Logistics createLogistic(){
        return new Boat();
    }
}
class PlaneFactory extends Factory{
    public Logistics createLogistic(){
        return new Plane();
    }
}

class Truck extends Logistics{
    String name="Truck";
}
class Boat extends Logistics{
    String name="Boat";
}
class Plane extends Logistics{
    String name="Plane";
}
public class Main {
    public static void main(String[] args) {

    }
}