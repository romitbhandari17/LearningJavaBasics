import classandobject.Bike;
import classandobject.Car;

public class Basics {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        byte age = 30;
        short year = 32767;
        int salary = 50000;
        long distance = 9876543210L;
        System.out.println(distance);
        float pi = 3.14f;
        System.out.println(pi);
        char grade = 'A';
        boolean isJavaFun = true;
        String myname = "abc";
        System.out.println(myname);

        int[] arr = {1, 2, 3, 4, 5};


        int[] numbers = new int[5]; // Declares an array of 5 integers
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        //numbers[5] = 50;
        String[] names = new String[] {"Alice", "Bob", "Charlie"};
        //names[5] = "Romit";
        //System.out.println(names[5]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        for (String name : names) {
            System.out.println("Element: " + name);
        }

        int i = 0;
        while (i < numbers.length) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
            i++;
        }

        Car mycar = new Car();
        mycar.setBrand("Hyundai");
        mycar.setMileage(12.3f);
        mycar.setName("i10grand");
        mycar.setWheels("4");
        mycar.setType("Passenger vehicle");

        System.out.println(mycar.getType());

        Car yourcar = new Car();
        yourcar.setBrand("maruti");
        yourcar.setMileage(11.3f);
        yourcar.setName("wagonr");

        Bike mybike = new Bike();
        mybike.setName("Discover");
        mybike.setType("Passenger");
        mybike.setWheels("2");

        System.out.println(yourcar.getName());

    }
}