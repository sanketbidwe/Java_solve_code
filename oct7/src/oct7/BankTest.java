package oct7;

public class BankTest {

	public static void main(String[] args) 
	{
		
		BankAccount account=new BankAccount();
		
		//account.accountNo=123456789;
		
		account.setAccountNo(12345678);
		
		System.out.println(account.getAccountNo());

	}

}
