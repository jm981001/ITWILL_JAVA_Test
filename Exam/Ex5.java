
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 다음 조건에 따라 if문을 사용하여 나이(age)에 따른 입장료(pee)를 출력하시오.
		 * 
		 * 1. 입장료(pee)는 정수이며, 초기 입장료는 100000원을 변수에 저장
		 * 2. 나이(age)는 정수이며 1 ~ 100 사이의 임의의 값을 변수에 저장
		 * 3. 할인 조건에 따른 입장료(pee)를 계산하여 나이와 입장료를 출력
		 * 
		 * */
		int pee = 100000;
		int age = 80;
		
		if(age > 5) {
			System.out.println("~~~~~~~");
		}
		
		
		//5세 이하일 경우 70% 할인
		//65세 이상일 경우 50% 확인 
		int result =  age<=5 ? (int)(pee * 0.3) :
            age>=65? (int)(pee * 0.5) : pee;
        System.out.println(result);
		
		
	}

}
