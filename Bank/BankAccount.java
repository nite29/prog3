/**
 * This is the BankAccount class which represents a bank account
 * with the identification number, account name, and a cash balance.
 * 
 * @author Junsay, Andre Renee D.
 * @author Almin, Wesner C.
 */
public class BankAccount {
	
	private int idNumber;
	private String name;
	private double cashBalance;
	
	/**
	 * BankAccount constructor with an identification number and account name.
	 * Initial cash balance is set to 0
	 * 
	 * @param idNumber the identification number of the account
	 * @param name the account name
	 */
	public BankAccount(int idNumber, String name){
		this.idNumber = idNumber;
		this.name = name;
		this.cashBalance = 0;
	}
	
	/**
	 * BankAccount constructor with an identification number, account name, and cash balance.
	 * 
	 * @param idNumber the identification number of the account
	 * @param name the account name
	 * @param cashBalance the cash balance of the account
	 */
	public BankAccount(int idNumber, String name, double cashBalance){
		this.idNumber = idNumber;
		this.name = name;
		this.cashBalance = cashBalance;
	}
	
	/**
	 * Credits money to the account.
	 * Credited money can only be positive values.
	 * 
	 * @param addCash the amount of cash to be added to cash balance.
	 * 
	 * @return true if <code>addCash</code> was added to <code>cashBalance</code> successfully;
	 * 		   false otherwise.
	 */
	public boolean setCredit(double addCash){
		if (addCash > 0) {
			this.cashBalance += addCash;
			return true;
		}
		else
			return false;
	}

	/**
	 * Credits money to the account.
	 * Credited money can only be positive values.
	 * 
	 * @param subCash amount of cash to be debited from the account's cash balance.
	 * 
	 * @return true if <code>subCash</code> was subtracted to <code>cashBalance</code> successfully;
	 * 		   false otherwise.
	 */
	public boolean setDebit(double subCash){
		if (subCash > 0 && subCash <= this.cashBalance) {
			this.cashBalance -= subCash;
			return true;
		}
		else
			return false;
	}

	/**
	 * Returns a string representation of <code>BankAccount</code>.
	 *
	 * @return string representation of the BankAccount in the format "[id] [name] : [balance]"
	 */
	@Override
	public String toString() {
		return this.idNumber+" "+this.name+" : "+this.cashBalance;
	}
}