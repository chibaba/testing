public class Main {
    public static void main(String[] args) {
        VipCustomer paranda = new VipCustomer();
        System.out.println(paranda.getName());
    
    VipCustomer lucia = new VipCustomer("cucu", 2500.00);
    System.out.println(lucia.getName());

    VipCustomer mustata = new VipCustomer("cucu", 345.90, "baba@gmail.com");
    System.out.println(mustata.getName());
    }
}