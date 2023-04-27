//Cotrol Flow Inside Try-catch
//Case-2:- Statement -2  Exception
//catch block matched
public class Six {
    public static void main(String[] args) {
        try {
            System.out.println("Hii");
            System.out.println(10/0);
            System.out.println("No Problem");
        } catch (Exception e) {
           System.out.println("Catch Block Me aa Gya");
        }
        System.out.println("All Done");
    }
}
