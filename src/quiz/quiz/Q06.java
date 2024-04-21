package quiz.quiz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 특정 문자열을 입력받고, 문자열에서 중복된 문자를 제거하고 남은 문자열을 출력하세요
 *
 * 예제1)
 * a b c d e -> abcde
 *
 * 예제2)
 * a a b b c c d e -> de
 *
 * 예제3)
 * a b c d e f e d d d c a -> bf
 *
 * 예제4)
 * a e a d d e e -> "없습니다"
 */
public class Q06 {
    public static void main(String[] args) {
        // 문자열 입력받기
        // 중복된 문자 제거하중복 문자기
        // 출력하기
        Scanner sc = new Scanner(System.in);    // 스캐너 호출
        System.out.print("문자를 스페이스로 구분하여 입력하시오 : ");
        String inputs = sc.nextLine();  // inputs에 스캐너로 입력한 문자열 초기화
        String[] input = inputs.split(" "); // inputs에 초기화한 문자열을 space로 구분하여 input배열에 초기화

        String[] duplicate = new String[input.length];  // 중복문자를 저장할 배열생성
        String[] single = new String[input.length]; // 단일문자를 저장할 배열생성
        int singleCount = 0;    // 단일문자 인덱스 번호를 위한 변수 초기화
        boolean isduplicated = false;   // 중복 여부를 확인하는 변수 초기화

        for (int i = 0; i < input.length; i++) {    // 입력된 문자열 배열을 반복하여 중복여부를 확인
            for (int j = 0; j < input.length; j++) {
                isduplicated = false;   // 변수 초기화
                if (input[i].equals(input[j])) {
                    if (i != j) {   // 현재 인덱스와 비교하는 인덱스가 같지 않다면 이하 조건문 실행
                        duplicate[i] = input[i];    // 중복 문자로 저장
                        isduplicated = true;    // 중복 여부 표시
                        break;  // 내부 반복문을 종료
                    }
                }
            }
            if (!isduplicated) {    // 중복 문자가 아닌경우 단일 문자로 간주하여 저장
                single[singleCount] = input[i];
                singleCount++;
            }
        }

        if (singleCount == 0) { //  단일 문자가 없는 경우 "없습니다" 출력
            System.out.println("없습니다");
        } else {    // 단일 문자가 있을경우 출력
            for (int k = 0; k < singleCount; k++) { // 단일문자를 출력하기 위한 반복문
                System.out.print(single[k] + " ");
            }   //  반복문 종료
        }
    }
}

/*
1. Scanner를 사용하여 사용자로부터 입력을 받습니다.
2. "문자를 스페이스로 구분하여 입력하시오 : "라는 메시지를 출력합니다.
3. 사용자가 입력한 문자열을 inputs 변수에 저장합니다.
4. 입력된 문자열을 스페이스로 구분하여 배열 input에 저장합니다.
5. 중복된 문자를 저장할 배열 duplicate와 단일 문자를 저장할 배열 single을 초기화합니다.
6. singleCount 변수를 초기화하여 단일 문자의 인덱스 번호를 추적합니다.
7. 중첩된 루프를 사용하여 각 문자열을 서로 비교합니다.
8. 만약 현재 비교 중인 두 문자열이 같고, 인덱스가 다르면 중복된 문자로 간주하여 duplicate 배열에 저장하고 루프를 종료합니다.
9. 중복된 문자가 아닌 경우, single 배열에 저장하고 singleCount를 증가시킵니다.
10. 마지막으로, 만약 singleCount가 0이면 "없습니다"를 출력하고, 그렇지 않으면 single 배열을 출력합니다.
*/