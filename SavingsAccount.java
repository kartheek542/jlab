public class SavingsAccount
{
  static int annualInterestRate;
  private double savingsBalance;
  static
  {
    annualInterestRate = 4;
  }
  public SavingsAccount(double ammount)
  {
    savingsBalance = ammount;
  }
  public void calculateMonthlyInterest()
  {
    savingsBalance += (savingsBalance * annualInterestRate)/12.0;
  }
  public static void modifyInterestRate(int ammount)
  {
    annualInterestRate = ammount;
  }
  public static void main(String[] args)
  {
    SavingsAccount saver1 = new SavingsAccount(2000.00);
    SavingsAccount saver2 = new SavingsAccount(3000.00);
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println(saver1.savingsBalance);
    System.out.println(saver2.savingsBalance);
    SavingsAccount.modifyInterestRate(5);
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println(saver1.savingsBalance);
    System.out.println(saver2.savingsBalance);

  }
}
