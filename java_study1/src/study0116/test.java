package study0116;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //주석 설명이나 메모, 코드 대기
		/* 
		 * 여러줄 주석- 주석은 프로그램으로 실행되지 않는 부분이다. 
		 * 주석 안에 코드 적성해도 실행 안된다. 각 코드의 설명을 작성 하는 용도로 사용하면 됨
		 *  ctrl+/ 빠른 주석 실행	
		 *  저장 단축키 ctrl  s
		 *  실행 단축기 ctrl f11  */
		System.out.println("자바 이클립스 테스트");
		
		//  데이터를 사용하려면 변수를 선언 해야 한다. 
		// 변수를 선언할때는  반드시 데이터 타입을 정해야 함
		// 변수의 이름은 저장할 데이터에 맞는 의미 있는 이름으로 짓기 
		// 타입+이름 형태로 작성 (숫자는 앞에 위치 불가)
		// 정수 : byte, short, int,  long
		// 실수 : float . double
		// 문자 : char
		// 논리 : boolean (참 or 거짓 하나만 표시 가능)
		int  age ;
		age = 100; // age 변수에 100 저장 (대입연산자)
		age = 27; // 100이 저장 되어 있는 상태에서 덮어쓰기 
		age = '가'; // 자바에서 '' 표현은 문자를 의미 "" 표현은 문자열을 의미 
		
//		*  자바문제 
//		1. 담배 한개피에 수명이 2분 단축된다. :
//		int 단축 수명 = 2; (2분 분단위)
//		int 일년 = 365; 
//		int 흡연기간 = 20; 
//		int 하루담배 = 5;
//		하루에 5개피씩 매일 흡연 
//		
//		int 단축 수명 = 하루 담배 * 한개피 단축 * 일년  * 흡연기간 ; 
//		int 단축 수명 시간 = 단축 수명 /60(시간 단위); 
//		int 단축 수명 일 = 단축 수명 시간 / 24(하루 24시간);  
//		
//		System .out.println(단축수명); > ("총 단축시간(분)"+ 단축 수명 );// + 더하기 의미가 아닌 붙이기 
//		System .out.println(단축 수명시간);>  ("총 단축수명(시간)"+ 단축 수명 시간 );
//		System .out.println(단축수명일); > ("총 단축수명(일)"+ 단축 수명 일 );
		
		
		//변수 - 데이터를 저장하기 위한 메모리 공간 
		//변수의 이름 - 데이터가 저장된 공간을 사용하기 위해 부여한  별명
		//변수 선언 방법 - 데이터 타입 변수 이름(ex_ int num;)
		//저장 할 데이터에 맞는 데이터 타입을 설정해야 한다.
		//변수 이름의 첫 글자는 문자로, 자바 예약어는 사용불가 
		
		// 자바에서 결과로 출력하는 방법 
		 System.out.println("출력하는 방법");
		 //자바에서 키보드를 통해 데이터 입력하는 방법 
		 //자바에서 입력하기 위한 순서 
		 //1. 입력 객체 생성 
		 //2. 입력 객체를 통해 데이터에 맞는 입력 메서드 호출
//		 Scanner [사용할 변수 이름]=new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		// 다른 곳에 파일 가지고 온다 : import (package 아래 작성)
//		import java.util.Scanner; > 직접 작성 어려운 경우 > 빨간줄 Scanner 위 마우스 올리면 import scanner 버튼 클릭  
		
		// num 이라는 변수에 정수 데이터 입력하여 저장하기 
		//nextIn()가 정수 데이터 입력하기 위한 메서드 이다. 
		int num = input.nextInt();
		
	}

}
