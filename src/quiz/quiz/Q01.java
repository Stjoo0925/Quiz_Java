package quiz.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        // 숫자를 입력 받아 내림차순으로 출력하기
        // 스캐너 사용
        // 배열에 숫자 저장
        // 저장된 숫자를 순서에 따라 출력
        Q01 q01 = new Q01();
        q01.descending_order();
    }

    private void descending_order() {
        Scanner sc = new Scanner(System.in);    // 스캐너 호출
        int input = 10; // 배열의 길이 초기화
        int[] inputNums = new int[input];   //  inputNums 배열 초기화
        System.out.println("input numbers");    //  숫자입력 출력
        for (int i = 0; i < inputNums.length; i++) {    //  배열에 값을 입력하기위한 반복문
            System.out.print((i + 1) + " number : ");   //  "i+1번째 배열의 숫자를 입력" 출력문
            inputNums[i] = sc.nextInt();    //  사용자가 입력한 값을 i번째 배열에 입력
            sc.nextLine();  // 걍 붙여봄
        }   //  값입력 반복문 종료

        Arrays.sort(inputNums); // inputNums 내부의 값을 오름차순 정렬해주는 메소드

        //내림차순어케함
        for (int i =0; i < inputNums.length/2; i++) { //    정렬된 배열 번호를 반대로 지정하는 반복문 시작
            int descending = inputNums[i];  //  배열을 저장하기위한 변수 초기화
            inputNums[i] = inputNums[inputNums.length - i - 1]; //  배열의 번호를 반대로 바꾸는 초기화 ex) 1 -> 10, 2 ->9 ...
            inputNums[inputNums.length - i - 1] = descending; //    미리 초기화 해둔 배열을 역순번의 배열에 초기화 ex) 10 -> 1 9 ->2 ...
        } //    반복문의 종료

        System.out.println("output numbers"); //    결과시작 출력
        for (int i = 0; i < inputNums.length; i++) { // 배열을 출력해주는 반복문 시작
            System.out.println(inputNums[i]); // i번째 배열 출력
        } //    결과 출력 종료
    }
}
