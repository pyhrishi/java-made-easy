public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}