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
        String[] inputArr = input.split(",");

        System.out.print("유효성을 검사할 알파벳을 ','로 구분하여 입력해주세요 : ");
        String validation = sc.nextLine();
        String[] validations = validation.split(",");

        int[] charCount = new int[128];
        for (int i = 0; i < inputArr.length; i++) {
            char chInputArr = inputArr[i].charAt(0);
            charCount[chInputArr]++;
        }

        boolean isValid = true;
        for (int i = 0; i <validations.length; i++) {
            char chValidations = validations[i].charAt(0);
            if (charCount[chValidations] == 0) {
                isValid = false;
                break;
            } else {
                charCount[chValidations]--;
            }
        }

        if (isValid) {
            for (int i = 0; i < validations.length; i++) {
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
