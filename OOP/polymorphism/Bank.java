class Account{
    void calculateInterest(){
        System.out.println("Normal interest");
    }
}
class SavingsAccount extends Account{
    void calculateInterest(){
        System.out.println("4% interest");
    }
}
class CurrentAccount extends Account{
    void calculateInterest(){
        System.out.println("No interest");
    }
}
class Bank{
    public static void main(String[] args) {
        Account a1;

        a1=new Account();
        a1.calculateInterest();

        a1=new SavingsAccount();
        a1.calculateInterest();

        a1=new CurrentAccount();
        a1.calculateInterest();
        
    }


}