//Exception Raised But The Corresponding Catch Block Matched
public class Thirteen {
    public static void main(String[] args) {
        System.out.println("Hii");
        try {
            System.out.println("Try");
            System.out.println(10/0);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Matched");
        }
        finally{
            System.out.println("All Done ");
        }
    }
}
