// If e refers null then we will get Null Pointer Exception
public class Eighteen {
    static ArithmeticException e;
    public static void main(String[] args) {
        throw e;
    }
}
