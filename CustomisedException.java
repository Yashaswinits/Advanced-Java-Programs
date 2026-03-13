public class CustomisedException {
	public static void withdraw(int amt) {
		if(amt>20000) {
			throw  new ArithmeticException("Insufficient Exception");
		}
		else {
			System.out.println("Withdraw sucess");
		}
	}

	public static void main(String[] args) {
	withdraw(30000);
	}
}
