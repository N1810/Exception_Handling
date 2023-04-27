//System.exit(0) Dominates Finally Block
public class Fifteen {
    public static void main(String[] args) {
        try {
            System.out.println("I am in Try Block");
            System.exit(0);
        } catch (Exception e) {
           
            System.out.println("I am In Catch Block ");
        }finally{
            System.out.println("i Am in Finally Block");
        }
    }
}
