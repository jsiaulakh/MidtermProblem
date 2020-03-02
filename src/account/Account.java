/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 * date: March 2nd
 * @author Sivagama
 * Modified by Jaspreet Singh
 */
public class Account {

    
        private double balance;
        private double interestRate=0.23;
        private String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {   // Added validator to check intitial amount on account opening
            if(initialBalance > 50){
            balance=initialBalance;
            user=givenUser;
            System.out.println("Account was created");
            }else{
                System.out.println("Initial balance must be more than 50 bucks");
            }
            //Note that the initial balance must be greater than 50.       
        }

     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=getBalance()+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=getBalance()-amount;

        }
        
     /**The getter for the balance
     * @return the balance
     */
        public double getBalance() 
        {
        return balance;
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            return interestRate;
        }
        
        public double interestCalc(int time){
            double interest = ((getBalance()*3)/100*(time * 1.0));
            return interest;
        }
        
        public double finalAmount(int time){
            double finalAm = getBalance() + interestCalc(time);
            return finalAm;
        }

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
    
    
}//class end
