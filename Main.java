import java.util.Scanner;

public class Main {

    public static Scanner sc;
    public static double total, tax, taxRate, subtotal;

    public static void main(String[] args) {
	// write your code here
        sc = new Scanner(System.in);
         total = 0.0;
         tax = 0.0;
         taxRate = 0.09;
         subtotal = 0.0;

        addItem();
        addItem();
        addItem();
        addItem();
        addItem();

        tax = calcTax(.09);

        total = calcTotal();
        displayTotal();




    }

    public static void addItem() {


        System.out.print("Item Quantity:");
        int qty = sc.nextInt();

        System.out.print("Item Name:");
        String name = sc.next();

        System.out.print ("Item Price:");
        double price = sc.nextDouble();

        subtotal = subtotal + (qty * price);

        System.out.printf("%d of %s @ $%.2f\n",qty,name,price);


    }

    public static double calcTax(double rate) {

        return (subtotal * rate);
    }

    public static double calcTotal()  {
        return (subtotal + tax);
    }

    public static void displayTotal() {
        System.out.println("====================");
        System.out.printf("SUBTOTAL: $%.2f\n",subtotal);
        System.out.printf("TAX:      $%.2f\n",tax);
        System.out.printf("TOTAL:    $%.2f\n",total);



    }
}
