import java.util.BitSet;

public class Main
{
    public static void main(String[] args)
    {
        BitSet bs1 = new BitSet();
        bs1.set(10);
        System.out.println(bs1);
        System.out.println(bs1.get(24));
    }
}