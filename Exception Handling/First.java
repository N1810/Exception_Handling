//Default Exception Handling In java
 class First{
    public static void main(String[] args) {
        dostuff();
    }
    public static void dostuff(){
        domorestuff();
    }
public static void domorestuff() {
    System.out.println(10/0);
}
}