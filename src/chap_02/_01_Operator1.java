package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        /**
         * 산술연산자
         */

        /**
         * 일반연산
         */
        System.out.println(2 + 3);
        System.out.println(4 - 3);
        System.out.println(4 * 3);
        System.out.println((float) 4 / 3);
        System.out.println(8 % 3); // 나머지(모듈로)

        /**
         * 우선순위 연산
         */
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        /**
         * 변수이용
         */

        int a = 20;
        int b = 100;

        int c;

        c = a + b;
        System.out.println(c);

        /**
         * 증감
         */

        int val;
        val = 10;
        System.out.println(++val); // 11
        System.out.println(--val); // 10
        System.out.println(--val); // 9
    }
}
