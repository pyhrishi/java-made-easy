public class NonStaticMembers {

    int x;

    NonStaticMembers() {
        System.out.println("Inside constructor");
    }

    {
        System.out.println("Inside nonstatic block");
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        new NonStaticMembers();
    }
}