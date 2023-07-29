public class ObjectReference {

    int x;

    ObjectReference() {

    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        ObjectReference obj = new ObjectReference();
        System.out.println(obj.x);
    }
}