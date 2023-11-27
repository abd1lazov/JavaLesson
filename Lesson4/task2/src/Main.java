public class Main {
    public static void main(String[] args) {
        Car car = new Car("S-class", 2020, 5, "Mercedes-Benz", "black", 2000);
        Car first = new Car("Land Cruiser",2023,7,"Prius","Black",2000);
        System.out.println(car);
        System.out.println(first);
        System.out.println("Are they equal? " + car.equals(first));
        System.out.println("Car hashcode: " + car.hashCode());
        System.out.println("First car hashcode: " + first.hashCode());
    }
}