package ua.com.alevel;

import java.math.BigInteger;

public class PrimitiveTypes {
        public void run() {
            System.out.println("PrimitiveTypes.run");
//            number();
//            character();
            array();
        }

        private void array() {

            int a = 10;
            System.out.println("a = " + a);

            int[] ints = new int [5];
            ints[0] = 10;
            ints[3] = 16;

            for (int anInt : ints) {
                System.out.println("anInt = " +anInt);
            }
            int[] arr = { 0, 2, 7, 9, 0 };
            for (int i : arr) {
                System.out.println("i = " + i);
            }

        }

        private void character() {
            char i = 'i';
        System.out.println("i = " + i);
        System.out.println("i = " + (int)i);

            char dog = '@';
        System.out.println("dog = " + dog);
        System.out.println("dog = " + (int)dog);

            char cat = (int)60;
        System.out.println("cat = " + cat);
    }


        private void number () {
            byte bMin = Byte.MIN_VALUE;
            byte bMax = Byte.MAX_VALUE;

            System.out.println("bMin = " + bMin);
            System.out.println("bMax = " + bMax);

            short sMin = Short.MIN_VALUE;
            short sMax = Short.MAX_VALUE;

            System.out.println("sMin = " + sMin);
            System.out.println("sMax = " + sMax);

            int iMin = Integer.MIN_VALUE;
            int iMax = Integer.MAX_VALUE;

            System.out.println("iMin = " + iMin);
            System.out.println("iMax = " + iMax);

            long lMin = Long.MIN_VALUE;
            long lMax = Long.MAX_VALUE;

            System.out.println("lMin = " + lMin);
            System.out.println("lMax = " + lMax);

            System.out.println((byte)(bMax + bMax));

            String byteString = Integer.toBinaryString(bMin);
            System.out.println("byteString = " + byteString);

            for (int i = 0; i < Byte.MAX_VALUE; i++) {
                System.out.println("i = " + Integer.toBinaryString(i));
            }
            BigInteger left = new BigInteger(String.valueOf(Long.MAX_VALUE));
            BigInteger right = new BigInteger(String.valueOf(Long.MAX_VALUE));
            BigInteger sum = left.add(right);
            BigInteger mul = left.multiply(right);

            System.out.println(sum);
            System.out.println(mul);
        }
}
