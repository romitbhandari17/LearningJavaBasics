package inheritance;

public class Cat extends Mammal{

//    public void sleep(int intVar){
//        System.out.println("Inside Cat Sleep with integer "+intVar);
//    }

    public void sleep(String str){
        //return "Inside String Method Sleep"+str;
        System.out.println("Inside Cat Sleep with string "+str);
    }

    public String eat(String item){
        return "Food is "+item;
    }
}
