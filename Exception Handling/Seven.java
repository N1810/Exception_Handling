//Cotrol Flow Inside Try-catch
//Case-3:- Statement -2  Exception
//Catch BLock Not mtched
public class Seven {
    public static void main(String[] args) {
        try {
            System.out.println("Hii");
            System.out.println(10/0);
            System.out.println("No Problem");
        } catch (NullPointerException e) {
           System.out.println("Catch Block Me aa Gya");
        }
        System.out.println("All Done");
    }
    }

