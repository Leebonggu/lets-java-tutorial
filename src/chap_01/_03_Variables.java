package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "BG";
        int hour = 15;

        System.out.println(name + "님 배송시작!");
        System.out.println(hour + "시 도착예정!");
        System.out.println("");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "님 평균점수는" + score + "으로" + " " + grade);

        boolean pass = true;
        System.out.println("합격?" + pass);

        float f = 3.14F;
    }
}
