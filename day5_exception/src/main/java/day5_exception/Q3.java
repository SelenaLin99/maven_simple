package day5_exception;

class CreditScoreException extends Exception {

	public CreditScoreException(String message) {
		super(message);
	}

}

public class Q3 {

	void creditScoreCheck(int score) throws CreditScoreException {
		if (score < 300) {
			throw new CreditScoreException("Very Low credit score!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3) Write a custom exception and throw it using throw keyword and throws
		Q3 cs = new Q3();

		try {
			cs.creditScoreCheck(100);
		} catch (CreditScoreException ex) {
			System.out.println("Exception caught!!!");
			System.out.println(ex.getMessage());
		}

	}

}
