package study0116;

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
	}

}
