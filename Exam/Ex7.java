/*
 * Account 클래스 정의
 * 
 * 멤버변수: 계좌번호, 예금주명, 현재잔고 선언
 * 생성자 : 모든 멤버변수를 초기화하는 생성자
 * 메서드 : 입금 (deposit)
 *         출금 (withdraw)
 * */
	class Account {
		
		private String accountNo;
		private String ownerName;
		private int balance;
		
		// Alt + Shift + S -> R
		public String getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public int getBalance() {
			return balance;
		}
		public void deposit(int amount) {
			this.balance += amount;
			System.out.println("입금할 금액 : " + amount + "원");
			System.out.println("입금 후 현재잔고 : " + balance + "원");
		}
		
		
		// 출금 기능 (매개변수 금액을 전달받아, 금액만큼 리턴) withdraw() 메서드
		public int withdraw(int amount) {
			if(amount > balance) {	// X
				System.out.println("출금할 금액 : " + amount + "원");
				System.out.println("잔액이 부족하여 출금 불가! (현재잔고 : " + balance + "원)");
				return 0;
				
			} else {	// O
				balance -= amount;
				System.out.println("출금할 금액 : " + amount + "원");
				System.out.println("출금 후 현재잔고 : " + balance + "원");
				return amount;
			}
		}
	}

	
	//-----------------------------------------------------------------
	
	public class Ex7 {
	public static void main(String[] args) {

		Account acc = new Account();
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("손정민");
		// => 은행 계좌 기능 중 잔고설정(setBalance())은 적합하지 않은 기능이므로
		//    입금기능(deposit())을 통해 처리하는 것이 더 적합함
		acc.deposit(100000);
		
		System.out.println("계좌번호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재잔고 : " + acc.getBalance());
		
	}

}
//0808 다시보기