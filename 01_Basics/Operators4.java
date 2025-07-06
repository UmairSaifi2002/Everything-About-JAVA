public class Operators4{
    public static void main(String[] args) {
        // uniary operators
        int op1 = 10;
        // op1++; // 11
        // op1--; // 10
        int y = --op1;
        int x = ++op1;
        System.out.println(op1+" "+ y+" "+ x);
        int z = op1++;
        int zz = op1--;
        System.out.println(op1+" "+ y+" "+ x + " " + z + " " + zz);
    }
}