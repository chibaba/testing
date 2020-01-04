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

    public void addHarmburgeradditional1(String name, double price) {
        this.additional1Name1 = name;
        this.additional1Price1 = price;
    }

    public void addHarmburgeradditional2(String name, double price) {
        this.additional1Name2 = name;
        this.additional1Price2 = price;
    }

    public void addHarmburgeradditional3(String name, double price) {
        this.additional1Name3 = name;
        this.additional1Price3 = price;
    }

    public void addHarmburgeradditional4(String name, double price) {
        this.additional1Name4 = name;
        this.additional1Price4 = price;
    }
    public double itemisHamburger() {
        double harmburgerPrice = this.price;
        System.out.println(this.name + " harmburger " + " on a " + this.bedRollType + " roll "
        + "price is " + "this.price ");
        if(this.additional1Name != null) {
            harmburgerPrice += this.additional1Price;
            System.out.ptintln("Addes " + this.additional1Name + " for an extra " + this.additional1Price);
        }
        if(this.additional2Name != null) {
            harmburgerPrice += this.additional2Price;
            System.out.ptintln("Addes " + this.additional2Name + " for an extra " + this.additional2Price);
        }
        if(this.additional3Name != null) {
            harmburgerPrice += this.additional3Price;
            System.out.ptintln("Addes " + this.additional3Name + " for an extra " + this.additional3Price);
        }
        if(this.additional4Name != null) {
            harmburgerPrice += this.additional1Price;
            System.out.ptintln("Addes " + this.additional4Name + " for an extra " + this.additional4Price);
        }
    }
}