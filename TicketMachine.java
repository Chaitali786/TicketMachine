
import java.util.Scanner;
public class TicketMachine{


        int price;  //The price of ticket from this machine
        int amount;//The amount of money entered by the customer
        int balance;
        int total;


        public TicketMachine()/*create a constructor*/
        {
           this.price=50;
           this.balance=0;
           this.total=0;
           this.amount =0;
        }

       public static void main(String[] args) {
       TicketMachine ticket1 = new TicketMachine();
       //Scanner sc = new Scanner(System.in);
       System.out.println("*************Ticket Machine*********** ");

       ticket1.amount = ticket1.setAmount();
       ticket1.balance = ticket1.insertMoney();
       System.out.println("Price IS =" + ticket1.price);
       System.out.println("Balance IS =" +  ticket1.balance);
       System.out.println("Total IS =" + ticket1.total);
     }//End of Main

     public int setAmount() /*Set Amount */
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Insert Amount : ");
       amount = sc.nextInt();
      //System.out.println(" Ticket Amount  IS In Set Amount ...." + amount);
       return amount;
     }

     public int insertMoney()
     {
         //int amt = amount;
         //System.out.println(" Ticket Price IS in insertMoney ...." + price );

         while(amount < price)
         {
           System.out.println(" Ticket amount IS  in insertMoney ...." + amount );

           System.out.println("Minimum Ticket Price IS 50.... Please insert Money again");
           setAmount();

         }
         balance = amount - price;
        return balance;
     }

}
