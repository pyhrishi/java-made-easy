public class StaticAndNonStatic {

    int num;

    StaticAndNonStatic() {
        System.out.println("Inside constructor");
    }

    {
        System.out.println("Inside nonstatic block");
    }

    static {
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        new StaticAndNonStatic();
        new StaticAndNonStatic();
        new StaticAndNonStatic();
        new StaticAndNonStatic();
    }
}
