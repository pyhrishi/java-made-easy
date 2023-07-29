public class StaticMethodRef {
    static StaticMethodRef obj = new StaticMethodRef();

    static {
        System.out.println(obj);
        StaticMethodRef.obj = StaticMethodRef.init();
    }

    public static void main(String[] args) {
        System.out.println(StaticMethodRef.obj);
    }

    static StaticMethodRef init() {
        return new StaticMethodRef();
    }
}
