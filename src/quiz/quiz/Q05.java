package quiz.quiz;

import java.util.Scanner;

/**
 * 7개의 숫자를 입력받고,
 * 짝수끼리 순서대로 이어 붙이고
 * 홀수끼리 순서대로 이어 붙인 뒤
 * 각 숫자를 출력하세요
 *
 * 예제1)
 * 1 5 9 4 3 2 0
 * -> 홀수는 : 1593 입니다.
 * -> 짝수는 : 420 입니다.
 *
 * 예제2)
 * 8 1 3 4 5 2 1
 * -> 홀수는 : 1351
 * -> 짝수는 : 842 입니다.
 *
 * 예제3)
 * 2 4 6 4 8 8 9
 * -> 홀수는 : 0 입니다.
 * -> 짝수는 : 2464889 입니다.
 */

public class Q05 {
    public static void main(String[] args) {
        // 숫자 7개를 입력받는다.
        // 홀수/짝수로 만든 숫자 만들기
        // 출력
        Scanner sc = new Scanner(System.in);    // 스캐너 호출

        System.out.println("숫자를 입력하세요: "); // 숫자를 입력하라는 출력문

        String input = sc.nextLine(); // input String type에 스캐너를 이용하여 입력
        String[] inputNums = input.split(" "); // input에 입력받은 문자열형의 값을 " "을 기준으로 분리하여 inputNums배열에 초기화

        int n = inputNums.length;   // inputNums배열의 길이를 정수형변수 n에 초기화
        int[] nums = new int[n];    // 정수형 배열 nums를 생성

        for (int i = 0; i < nums.length; i++) { // 문자열형으로 저장되어있는 inputNums배열을 정수형으로 치환하여 nums배열에 입력하는 반복문
            nums[i] = Integer.parseInt(inputNums[i]);
        }   // 반복문 종료

        int[] odds = new int[n];    // 홀수형 값을 저장하기 위한 odds배열 생성
        int[] even = new int[n];    // 짝수형 값을 저장하기 위한 even배열 생성
        int oddCount = 0;   // odd의 길이를 위한 변수 초기화
        int evenCount = 0;  // even의 길이를 위한 변수 초기화

        for (int i = 0; i < nums.length; i++) { // nums배열의 값을 홀수 짝수로 나누어 각각의 배열에 저장하기 위한 반복문
            if (nums[i]%2 == 0) {   // nums의 i번째 인덱스의 값을 나머지 했을때 0이된다면 짝수 배열에 저장하라는 조건문
                even[evenCount] = nums[i];
                evenCount++;
            } else {    // 그 외 나머지는 홀수형에 저장하라는 조건문
                odds[oddCount] = nums[i];
                oddCount++;
            }
        }   // 반복문 종료


        System.out.print("홀수는 : "); // 홀수 배열을 출력한다는 출력문
        for (int i = 0; i < oddCount; i++) {    //  홀수 배열에 i번 부터 oddCount까지의 인덱스를 출력하기 위한 반복문
            System.out.print(odds[i] + " ");
        }   // 반복문 종료
        System.out.print(" 입니다.");
        System.out.println();   // 한칸 띄우기 위한 출력문

        System.out.print("짝수는 : "); // 짝수 배열을 출력한다는 출력문
        for (int i = 0; i <evenCount; i++) {    // 짝수 배열에 i번 부터 evenCount까지의 인덱스를 출력하기 위한 반복문
            System.out.print(even[i] + " ");
        }   // 반복문 종료
        System.out.print(" 입니다.");

    }
}
