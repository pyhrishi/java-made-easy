public class NonStaticMethods {
    int x;

    NonStaticMethods() {
        System.out.println("Inside nonstatic constructor");
        System.out.println(this.x);
    }

    {
        System.out.println("Inside nonstatic block");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        NonStaticMethods obj = new NonStaticMethods();
        obj.doSomething();
    }

    void doSomething() {
        System.out.println("Inside doSomething");
    }
}