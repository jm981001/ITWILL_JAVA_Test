
public class Ex4 {

	static int a;
	static int b;
	
	int n;
	
	public Ex4(int num) {
		this.n = num;
	}

	public static void main(String[] args) {
		Ex4 ex = new Ex4(10);
	}
	
	// 클래스(정적)변수 :  a, b
	// 인스턴스(멤버)변수 : n (하늘색) (하늘색이지만 앞에 static 붙으면 클래스변수)
	// 로컬 변수 : ex, num , args(메서드 안에서 선언되고 메서드 없어지면 사라지는 변수)(보라색)

}
