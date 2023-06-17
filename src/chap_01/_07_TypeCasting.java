package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        /**
         * 형변환 TypeCasting
         * 정수 -> 실수
         */

        int score = 90;
        System.out.println(score); // 90
        System.out.println((float)score); // 90.0
        System.out.println((double) score); // 90.0

        float score_f = 90.3F;
        double score_d = 90.3;
        System.out.println((int)score_f); // 90
        System.out.println((int)score_d); // 90

        /**
         * 숫자 -> 문자
         */
        String s1 = String.valueOf(92);
        String s2 =Integer.toString(92);
        System.out.println(s1);
        System.out.println(s2);

        String s3 = String.valueOf(90.3);
        String s4= Double.toString(90.3);

        /**
         * 문자 -> 숫자
         */
        int i = Integer.parseInt("90");
        System.out.println(i); // 90

        double d = Double.parseDouble("90.3");
        System.out.println(d);
    }
}
