public class Dog extends Animal { 
    // we want to asign feautres that are generic to the behaviour of dog but not 
    //necessarily to animals
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog (String name, int body, int brain, int size, int weight) {
        super(name, body, brain, size, weight);
    }
}