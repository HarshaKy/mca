import java.util.Scanner;

public class Bakery {
        int wine, cold, bear, juice;

    
    final public void setRates() {
        
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        int sum = 0;
        
        do{
            System.out.println("Enter Prices");
            System.out.println("1.Wine");
            System.out.println("2.ColdDrink");
            System.out.println("3.Bear");
            System.out.println("4.Juice");
            System.out.println("5.Quit");
            
            int choice = input.nextInt();
            
            switch(choice){
                case 1:System.out.println("enter price for Wine" + "\n");
                        // sum = sum + wine;
                        this.wine = input.nextInt();
                        
                    break;
                case 2:
                    System.out.println("enter price for ColdDrink");
                    // sum = sum + cold;
                    this.cold = input.nextInt();
                    // order = order.concat("ColdDrink" + "\n");
                    
                       break;
                case 3:
                    System.out.println("enter price for Bear");
                    // sum = sum + bear;
                    this.bear = input.nextInt();
                    // order = order.concat("Bear" + "\n");
                      break;
                case 4:
                    System.out.println("enter price for Juice");
                    // sum = sum + juice;
                    this.juice = input.nextInt();
                    // order = order.concat("Juice" + "\n");
                    break;
                case 5:
                     quit = true;
                     
                    break;
                default:
                    System.out.println("Wrong input");
            }
        
        }while(!quit);
       
        // System.out.println("Your Orders are:\n" + order);
        // System.out.println("Your total bill=" + sum);
        

        // System.out.println("prices: " + this.cold);
        System.out.println("Thank you");
    
    }
    
}

class Main extends Bakery {
    public static void main(String[] args) {
        Bakery b = new Bakery();
        System.out.println("Set rates for items: ");
        b.setRates();
    }
}