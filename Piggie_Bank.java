//Q6. Suppose you have a Piggie Bank with an initial amount of 50 and you have to add some more amount to it.
//        Create a class 'AddAmount' with a data member named 'amount' with an initial value of 50.
//        Now make two constructors of this class as follows:
//        1 - without any parameter - no amount will be added to the Piggie Bank
//        2 - having a parameter which is the amount that will be added to Piggie Bank
//        Create object of the 'AddAmount' class and display the final amount in Piggie Bank.

public class Add_Amount {
    int amount=50;
    public Add_Amount(){
        System.out.println("no amount has been deposited in the Piggie Bank  the old one is " + amount);
    }
    public Add_Amount(int amount){
        this.amount= amount;
        amount= amount+50;
        System.out.println("the new amount is " + amount);
    }

    public static void main(String[] args) {
        Add_Amount obj= new Add_Amount(206);
    }
}
