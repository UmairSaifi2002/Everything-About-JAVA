public class Literal_Types_Conversions2{
    static int cop = 30;
    int poc = 20;
    public static void main(String[] args) {
        // Types
        int a = 25;
        byte b = 25;
        long x = 32L;
        short y = 789;

        //conversion
        short z = (short)32789;

        System.out.println(z);

        int first = 32;
        int second = 045;
        int third = 0X17AB;
        int fourth = 0b0101;

        System.out.println(first); // 32
        System.out.println(second); // 37
        System.out.println(third); // 6059
        System.out.println(fourth); // 5

        char c = 'a';
        char c1 = 062;
        char c2 = 62;
        char c3 = 0x12A;
        char c4 = '\u0061';

        System.err.println(c);
        System.err.println(c1);
        System.err.println(c2);
        System.err.println(c3);
        System.err.println(c4);

        boolean bb = true;

        System.err.println(10+30+"My name is "+"JARVIS"+10+40);

        int ans = (int)(10+20+34.5);

        //Declaring the objects
        Literal_Types_Conversions2 obj1 = new Literal_Types_Conversions2();
        System.err.println(obj1.poc);
        System.err.println(obj1.cop);

    }
}