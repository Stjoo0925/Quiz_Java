package quiz.quiz;

import java.util.Scanner;

/**
 * 현재 캐릭터의 총 MP은 1000입니다.
 * 캐릭터의 스킬은 q, w, e, r이 있고
 * 스킬 사용 시 소모되는 MP는
 * - q : 10
 * - w : 30
 * - e : 50
 * - r : 100
 * q,w,e,r로 이루어진 문자열(스킬 구성)을 사용하고 남은 마나를 출력해주세요
 * 만약 문자열로 구성된 모든 스킬을 사용하는데 필요한 MP가 부족하다면 "MP가 부족합니다"를 출력해주세요
 *
 * 예제1 input) "q w r r r q w e r"
 * 예제1 output) 남은 마나 : 470
 *
 * 예제2 input) "r r r q q w e q w e r r q w e r q w e r r q w e r e r"
 * 예제2 output) MP가 부족합니다
 */
public class Q04 {
    public static void main(String[] args) {
        // 문자열 입력
        // 남은 마나 가져오기
        // 출력
        Scanner sc = new Scanner(System.in);    // 스캐너 호출
        String skillOder = sc.nextLine();   // skillOder에 스캐너로 문자열 입력

        Q04 skill = new Q04();  //  메소드를 사용하기 위해 메모리에 올림
        int skills = skill.usedManacalculations(skillOder); // usedManacalculations메소드의 리턴값을 skills에 받음
    }

    private int usedManacalculations(String skills) {
        //남은 마나 가져오기
        String[] skillNum = skills.split(" ");  // skillNum에 문자열형 skills를 space로 분리하여 저장
        int fullMana = 1000;    // 마나 총량 초기화
        int useMana = 0;    // 사용한 마나를 합산할 변수를 사용하기 위해 초기화

        for (int i = 0; i < skillNum.length; i++) { //  사용되는 마나를 계산하기 위한 반복문
            switch (skillNum[i]) {  //skillNum배열에 나누어서 저장한 값을 case에 맞게 useMana에 합산
                case "q" -> skillNum[i] = "10";
                case "w" -> skillNum[i] = "30";
                case "e" -> skillNum[i] = "50";
                case "r" -> skillNum[i] = "100";
            }
            useMana += Integer.parseInt(skillNum[i]);
        }   // 반복문 종료

        if (useMana < fullMana) {   // 만약 useMana가 fullMana보다 작다면 아래 출력문 출력
            System.out.println("남은 마나 : " + (fullMana - useMana));
        } else {    // useMana가 더 크다면 아래 출력문 출력
            System.out.println("MP가 부족합니다.");

        }
        return useMana; // useMana로 값을 리턴함
    }
}
