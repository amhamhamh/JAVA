package com.bitcamp.java;

public class EnrtyApp {
  public static void main(String[] args) {
	 	// 화면에 텍스트를 출력하세요. 실행은 함수(메소드)가 실행 되는 거
	    // - 가능한 함수호출은 한 번에 끝낸다... 
	  	System.out.print(
	  			100+"원\n"		// \t는 탭키 - 들여쓰기 
	  			);	 // 행 구분없이 출력. 
	  	System.out.println("korea");	 // 행 내림하여 출력
	  	System.out.print(300+"\n");
	  	
	  	String s = 100+"원\n";
	  	s +="korea";
	  	s += 300;
	  	System.out.println(s);
}
//	public static void main(String[] args) {	
//		// TODO Auto-generated method stub
//
//	}
  /* 
   * 실행 시 반드시 main 함수를 작성하세요.
     화면 출력 : system.out.println()
     
   */

}
