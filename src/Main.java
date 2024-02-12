//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final double TAX_RATE = 0.05;
        double tax;
        double price=2;
        double total = 0;
        double finalTotal;
        String item= String.valueOf(1);
        double v = 0;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("item price:$");
        tax = price + TAX_RATE;
        finalTotal = total - (price * tax);
        System.out.print(item + " $");
        System.out.println(price);
        System.out.print("Tax $");
        System.out.println(tax);
        System.out.print("Total $");
        System.out.println(total);
    }
}