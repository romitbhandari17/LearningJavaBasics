package inheritance;

public interface Pet {

    void sleep();
    String eat(String item);

    static void makeNoise(String sound){
        System.out.println("Sound is "+sound);
    }
}
