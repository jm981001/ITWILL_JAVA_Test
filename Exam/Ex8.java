
public class Ex8 {

	public static void main(String[] args) { //0907 Ex2
		/*
		 * String 클래스를 활용하여 주어진 문자열을 변수로 선언하고
		 * String 클래스의 메서드를 활용하여 다음 작업을 수행하시오.
		 * 
		 * 1. 데이터 비교
		 * 2. 데이터 추출 후 비교 (주민등록번호 뒷자리)
		 * 3. 필요한 데이터만 추출 (주소, 전화번호)
		 * */
		
		// 1 --------------------------------------------------
		String s1 = "홍길동";	 
		String s2 = "홍길동";	 
		
		if(s1.equals(s2)) {
			System.out.println("s1 과 s2는 문자열이 같다!");
		} else {
			System.out.println("s1 과 s2는 문자열이 다르다!");
		}
		
		
		// 2 --------------------------------------------------
		String jumin = "801111-1722222";
		
		switch (jumin.split("-")[1].charAt(0)) { // 뒷자리 첫번째
		case '1': case '3': System.out.println("남성"); break;
		case '2': case '4': System.out.println("여성"); break;
		case '5': case '6': System.out.println("외국인"); break;	
		default: System.out.println("괴물");
			break;
		}
		
		
		
		// 3 --------------------------------------------------
		String s3 = "981001-1334242";
		System.out.println("뒷자리만 출력 " + s3.substring(7));

		String s4 = "010-9201-5874";
		System.out.println("중간자리만 출력 " + s4.substring(4, 8));
	}

}
