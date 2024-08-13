import accessModifiers.Laptop;
import accessModifiers.Sony;
import inheritance.*;

public class Main {
    public static void main(String[] args) {

        Dog mydog = new Dog(4);
        mydog.sleep();

//        String item = mydog.eat("fruits");
//        Pet.makeNoise("Wooff");
//        System.out.println(item);
//        mydog.drink();

//        Mammal mymammal = new Mammal();
//
//        mymammal.sleep("my lovely mammal");


        Laptop lap = new Laptop();
        System.out.println("processor;"+lap.processor);
        //System.out.println("processor;"+lap.screenSize);

    }
}
