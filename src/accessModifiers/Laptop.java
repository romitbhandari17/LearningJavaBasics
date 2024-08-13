package accessModifiers;

public class Laptop {

    public String processor;
    protected String ram;
    private String screenSize;
    String rom;

    public Laptop() {
        this.processor = "i3";
        this.ram = "8gb";
        this.screenSize = "15inch";
        this.rom = "500gb";
    }

    public void showDetails(){
        System.out.println("processor="+this.processor);
        System.out.println("ram="+this.ram);
        System.out.println("screenSize="+screenSize);
        System.out.println("rom="+this.rom);

    }
}
