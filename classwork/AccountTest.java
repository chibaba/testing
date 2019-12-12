public class AccountTest{
    public static void main(String...args) {
        Account2 obj = new Account2();
        // System.out.print(obj.getName());
        obj.setName("chinedu");
        obj.setBalance(234.54);
        System.out.printf("hi %s your account balance is %f", obj.getName(), obj.getBalance());
    }
}