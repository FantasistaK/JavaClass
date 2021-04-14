package day08_0408;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ==
		// 문자열이 같은지 비교할 경우
		// 
		String str1 = "가가가";
		String str2 = "나나나";
		String str3 = "가가가";
		// str1과 str3가 같은지를 판다
		// 문자열이 같은지 판단할때는 ==를 쓰지않고 equals() 메소드를 사용
		if(str1.equals(str3)) {
			System.out.println("두 값이 같다");
		} else {
			System.out.println("두 값이 다르다");
		}
	}

}
