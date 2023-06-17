package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        /**
         * Rule
         * 1. 저장할 값에 어울리는 이름
         * 2. 밑줄, 문자, 숫자 사용 가능
         * 2.1 공백 사용 불가
         * 3. 밑줄 또는 문자로 시작 가능
         * 3.1 숫자로 시작 불가
         * 4. 한 단어 또는 2개 이상의 단어의 연속
         * 5. 소문자로 시작, 각 단어의 시작 글자는 대문자
         * 5.1 카멜케이스
         * 6. 예약어 사용 불가
         */

        // 입국 신고서
        String nationality = "대한민국";
        String firstName = "구구";
        String lastName = "콘";
        String dob = "2023-01-01";
        String residentialAddress = "채채호텔";
        String purposeOfVisit = "관광";
        String flightNo = "KK1234";

        int accompnaion = 2;
        int lengthOfStay = 3;

        String item1 = "시계";
        String item2 = "시계";
        String item3 = "전자제품";

        // 상수
        final String CODE = "KR";
    }
}
