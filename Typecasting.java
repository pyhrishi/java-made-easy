public class Typecasting {
    public static void main(String[] args) {
        byte a = 100;
        int i = a;
        System.out.println(i);
        long l = i;
        System.out.println(l);

        int x = 120;
        byte y = (byte) x;
        System.out.println(y);
        char ch = (char) x;
        System.out.println(ch);

        int z = 130;
        byte by = (byte) z;
        System.out.println(by);
        char c = (char) by;
        System.out.println(c);
    }
}