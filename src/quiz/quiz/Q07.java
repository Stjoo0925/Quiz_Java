package quiz.quiz;

import java.util.Scanner;

/**
 * 문자열을 입력받고 a,p,p,l,e로 해당 문자를 만들 수 (a 1개, p 2개, l 1개, e 1개)
 * 있다면
 * - "만들 수 있습니다." 출력
 *
 * 없다면
 * - "만들 수 없습니다." 출력
 *
 * 예제1
 * - apple -> "apple은 만들 수 있습니다."
 *
 * 예제2
 * - pal -> "pal은 만들 수 있습니다."
 *
 * 예제3
 * - pplaa -> "pplaa은 만들 수 없습니다."
 *
 * 예제4
 * - pelpa -> "pelpa은 만들 수 있습니다."
 *
 * 예제5
 * - paplt -> "paplt는 만들 수 없습니다."
 */
public class Q07 {
    public static void main(String[] args) {
        // 문자열 입력받기
        // 만들 수 있는지 판별
        // 출력하기
        Scanner sc = new Scanner(System.in);

        System.out.print("저장할 알파벳을 ','로 구분하여 입력해주세요 : ");
        String input = sc.nextLine();
        String[] inputArr = input.split(",");   // 최초 알파벳을 , 으로 split하여 inputArr에 저장한다.

        System.out.print("유효성을 검사할 알파벳을 ','로 구분하여 입력해주세요 : ");
        String validation = sc.nextLine();
        String[] validations = validation.split(",");   // 유효성을 검사할 알파벳을 , 으로 split하여 validations에 저장한다.


        int[] charCount = new int[256]; // 배열에 저장된 알파벳의 아스키코드를 비교하기위한 배열을 생성
        for (int i = 0; i < inputArr.length; i++) { // 초기 알파벳의 해당인덱스의 아스키코드을 카운트 하기 위한 반복문
            char chInputArr = inputArr[i].charAt(0);    // i번 인덱스의 알파벳을 charCount배열에 ch번에 아스키코드 10진수로 저장
            charCount[chInputArr]++;
        }

        boolean isValid = true;    // 검증의 참 거짓을 판별하기위한 변수 선언
        for (int i = 0; i <validations.length; i++) {   // 유효성을 검증하기 위한 반복문 시작
            char chValidations = validations[i].charAt(0); // 검증할 i번 validations 의 값을 가져온다
            if (charCount[chValidations] == 0) {   // 만약 해당 값이 0인경우
                isValid = false;    // 검증이 실패함으로 false로 설정
                break;  // 반복문 종료
            } else {    // charCount 배열에서 해당 값의 카운트를 감소
                charCount[chValidations]--;
            }
        }

        if (isValid) { // isValid가 true인지 확인하여, 모든 검증 알파벳이 형성될 수 있는지를 확인
            for (int i = 0; i < validations.length; i++) { // 알파벳을 검증하기 위한 반복문
                if (i < validations.length - 1) {
                    System.out.print(validations[i] + ",");
                } else {
                    System.out.print(validations[i] + " ");
                }
            }
            System.out.print("은(는) 생성할 수 있습니다.");
        } else {
            for (int i = 0; i < validations.length; i++) {
                if (i < validations.length - 1) {
                    System.out.print(validations[i] + ",");
                } else {
                    System.out.print(validations[i] + " ");
                }
            }
            System.out.print("은(는) 생성할 수 없습니다.");
        }
    }
}
