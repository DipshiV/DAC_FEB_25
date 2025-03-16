//Bank Management

class BankAccount {
    private String accountHolder;
    private double balance=0;;
	private int amount;
	private long accountNo;

    public BankAccount(String accountHolder, double balance, long accountNo) {
        this.accountHolder = accountHolder;
        this.balance = balance;
		this.accountNo = accountNo;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Dipshi", 5000);
		
        account.displayDetails();
        account.deposit(1000);
        account.withdraw(2000);
        account.displayDetails();
		
		while(true){
			System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
			
			int choice = scanner.nextInt();
			 case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayDetails();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
			}
		}
    }
}
