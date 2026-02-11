class Account{
    int accNumber;
    double balance;
    void showBalance(){
        System.out.println("Account number: "+accNumber);
        System.out.println("Balance: "+balance);
    }

}
class SavingsAccount extends Account{
    double interestRate=4;
    
    void showInterestrate(){
        double interest=(balance*interestRate)/100;
        System.out.println("Interest: "+interest);
    }
    public static void main(String[] args) {
        SavingsAccount sa1=new SavingsAccount();
        sa1.accNumber=1234;
        sa1.balance=34560;

        sa1.showBalance();
        sa1.showInterestrate();
    }
}