public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additional1Name;
    private double additional1Price;

    private String additional2Name;
    private double additional2Price;

    private String additional3Name;
    private double additional3Price;

    private String additional4Name;
    private double additional4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHarmburgeradditional(String name, double price) {
        this.additional1Name = name;
        this.additional1Price = price;
    }
}