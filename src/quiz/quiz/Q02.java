package quiz.quiz;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // 숫자를 입력받아
        // 숫자의 최대 최소값을 출력
        // input = 1, 2, 7, 9, 3
        // output = 최소값 1 1번째 입력됨
        //          최대값 9 4번째 입력됨
        Q02 q02 = new Q02();
        q02.maxMinNumber();
    }

    private  void maxMinNumber() { //   최대 최소값 메소드 시작
        Scanner scanner = new Scanner(System.in);   // 스캐너 호출
        int numCount = 5;   // 입력 받을 숫자 개수 초기화

        int[] numbers = new int[numCount];  //  numbers배열 생성
        System.out.println("input numbers"); // input numbers 출력문 작성
        for (int i = 0; i < numCount; i++) {    //  배열을 입력받기 위한 반복문 시작
            numbers[i] = scanner.nextInt(); // numbers 배열에 입력
        }   //  반복문 종료
        int maxNumber = numbers[0]; //  최대값을 초기화
        int minNumber = numbers[0]; //  최소값을 초기화
        int maxCount = numbers[0];  //  최대값 번호를 초기화
        int minCount = numbers[0];  //  최소값 번호를 초기화
        for (int i = 0; i < numCount; i++) {    //  입력받은 값을 입력받은 순서대로 출력하기위한 반복문
            if (i < numCount - 1) {
                System.out.print((numbers[i]) + ", ");
            } else {
                System.out.print(numbers[i]);
                System.out.println();
            }   //  반복문 종료
        }
        for (int i = 0; i < numbers.length; i++) {  //  배열안의 값을 비교해서 최대값을 찾기위한 반복문
            maxNumber = (numbers[i] < maxNumber) ? maxNumber : numbers[i];
        }   //  반복문 종료
        for (int i = 0; i < numbers.length; i++) {  //  배열의 최대값을 입력받은 번호를 찾아내기 위한 반복문
            if (numbers[i] == maxNumber) {
                maxCount = i+1;
            }   //  반복문 종료
        }
        System.out.println("max number = " + maxNumber + ", " + maxCount + "번째 입력되었습니다.");  // 최대값, 최대값을 입력한 번호를 출력
        for (int i = 0; i < numbers.length; i++) {  //  배열안의 값을 비교해서 최소값을 찾기 위한 반복문
            minNumber = (numbers[i] < minNumber) ? numbers[i] : minNumber;
        }   //  반복문 종료
        for (int i = 0; i < numbers.length; i++) {  //  배열의 최소값을 입력한 번호를 찾아내기 위한 반복문
            if (numbers[i] == minNumber) {
                minCount = i+1;
            }   //  반복문 종료
        }
        System.out.println("min number = " + minNumber + ", " + minCount + "번째 입력되었습니다.");  //  최소값, 최소값을 입력한 번호를 출력
    }
}