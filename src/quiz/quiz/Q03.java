package quiz.quiz;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  - 문제
 *  정수로 이루어진 숫자 10개를 받고 (정수의 범위는 0~100, 중복 불가 -> 잘못 입력 시 다시 입력)
 *  가장 작은 3개의 수를 오름차순으로 출력하시오
 *
 *  예제 input) 5 50 15 20 40 30 80 90 10 1
 *  예제 output) 1 5 10
 */
public class Q03 {

    public static void main(String[] args) {
        // 1. 숫자 10개 입력
        // 2. getSmallestNumbersByAsc 메서드를 이용해서 입력받은 숫자를 넘기고, 가장 작은 3개의 수 가져오기
        // 3. 가장 작은 3개의 수 출력
        Q03 get = new Q03();
        get.getSmallestNumbersByAsc();
    }

    public int[] getSmallestNumbersByAsc() {
        // 3개의 가장 작은 숫자 가져오고, 오름차순으로 정렬 및 반환 구현
        Scanner sc = new Scanner(System.in);    //  스캐너 호출
        int inputNumCount = 10; //  입력받을 숫자 갯수
        int minCount = 3;   //  출력할 최소값 갯수
        int[] numbersArr = new int[inputNumCount];  //  배열 생성

        System.out.println("Enter number"); //  숫자를 입력하라는 출력문
        for (int i = 0; i < numbersArr.length; i++) {   //  배열에 숫자를 입력하는 반복문
            numbersArr[i] = sc.nextInt();   //  배열에 스캐너를 이용하여 값을 입력
        }   //  배열에 숫자를 입력하는 반복문 종료

        int temp = numbersArr[0];   //  배열을 오름차순 정리하기 위한 변수 초기화
        for (int i = 0; i < numbersArr.length; i++) {   //  오름차순 정리를 위한 반복문 시작
            for (int j = i + 1 ; j < numbersArr.length; j++) {  //  값을 오름차순 하여 배열에 정리하는 반복문
                if (numbersArr[i] > numbersArr[j]) {    //  값을 비교하기 위한 조건문
                    temp = numbersArr[i];
                    numbersArr[i] = numbersArr[j];
                    numbersArr[j] = temp;
                }   //  반복문 종료
            }
            numbersArr[i] = temp;   //  오름차순 정리한 i번째 값을 초기화 | 간소화 하면 Arrays.sort(배열변수명)
        }   //  오름차순 정리 반복문 완료

        for (int i = 0 ; i <= minCount - 1; i++) {  //  배열의 인덱스 minCount - 1 번까지 출력하기 위한 반복문
            System.out.print(numbersArr[i] + " ");  //  배열의 i 번의 값 출력
        }   //  반복문 종료

        return null;
    }
}
