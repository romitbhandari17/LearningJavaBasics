package inheritance;

public class Dog implements Pet, Animal{

    private String type="default";
    private Integer legs=5;

    public Dog(Integer legs){
        System.out.println("This is Dog with number of legs = "+legs);
        //this.legs = legs+1;
        System.out.println("This is Dog with number of legs = "+this.legs);
    }

    public Dog(String type){
        type = type;
        System.out.println("This is Dog "+type);
    }

    public void sleep(){
        System.out.println("Inside Dog Sleep for "+type);
    }

    public String eat(String item){
        return "Food is "+item;
    }

    public void drink(){
        System.out.println("Inside Drink");
    }

//    public void makeNoise(String sound){
//        System.out.println("Overidden sound is "+sound);
//    }
}
