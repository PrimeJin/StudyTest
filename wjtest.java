package com.wj;

public class DigitTest1 {
	public static void main(String[] args) {
		int num = 1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j<i) {  //공백 출력
					System.out.printf("%3s", " ");  //정렬하기 위해 printf 이용, %3s로 3자리 차지 
				} else {  //숫자 출력
					System.out.printf("%3s", num);
					num++;
				}
			}
			System.out.println();
		}
	}
}
