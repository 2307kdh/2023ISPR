public class TypeDemo {
    public static void main(String[] args) {
        char c='\uAC00';
        float fa = 0.1f;
        float fb = 0.2f;
        int intvalue=140;
        System.out.println(c);
        System.out.println((int)(c));
        System.out.println("?");
        byte bytevalue=(byte)intvalue;
        System.out.println(bytevalue);
        //0111 1111(2) 127(10)
        // 1000 0000(2) -128(10)
        // 1000 0001(2) -127(10)
        //...
        // 1111 1111(2) -1(10)
        //AC
        //1010 1100
        //0101 0011 // 1's complement
        //+       1 // 2's complement
        // 0101 0100(2)
        //64+16+4 == 84
        //1010 1100(2) == -84 (type가 byte일 때)
    }
}
