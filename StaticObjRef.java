public class StaticObjRef {
    static StaticObjRef obj;

    static {
        System.out.println(obj);
        StaticObjRef.obj = new StaticObjRef();
    }

    public static void main(String[] args) {
        System.out.println(StaticObjRef.obj);
    }
}
