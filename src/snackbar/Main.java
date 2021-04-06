package snackbar;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    Customer jane = new Customer("Jane");
    jane.addCash(new BigDecimal("45.25"));

    Customer bob = new Customer("Bob");
    bob.addCash(new BigDecimal("33.14"));

    VendingMachine foodMachine = new VendingMachine("Food");
    VendingMachine drinkMachine = new VendingMachine("Drink");
    VendingMachine officeMachine = new VendingMachine("Office");

    Snack chips = new Snack(
      "Chips",
      new BigDecimal("1.75"),
      foodMachine.getId()
    );
    chips.addQuantity(36);

    Snack chocolate = new Snack(
      "Chocolate Bar",
      new BigDecimal("1.00"),
      foodMachine.getId()
    );
    chocolate.addQuantity(36);

    Snack pretzel = new Snack(
      "Pretzel",
      new BigDecimal("2.00"),
      foodMachine.getId()
    );
    pretzel.addQuantity(30);

    Snack soda = new Snack(
      "Soda",
      new BigDecimal("2.50"),
      drinkMachine.getId()
    );
    soda.addQuantity(24);

    Snack water = new Snack(
      "Water",
      new BigDecimal("2.75"),
      drinkMachine.getId()
    );
    water.addQuantity(30);
    
    jane.buySnacks(soda, 3);
    System.out.println("Jane's cash on hand is " + jane.getCash());
    System.out.println("Quantity of soda is " + soda.getQuantity());

    jane.buySnacks(pretzel, 1);
    System.out.println("Jane's cash on hand is " + jane.getCash());
    System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

    bob.buySnacks(soda, 2);
    System.out.println("Bob's cash on hand is " + bob.getCash());
    System.out.println("Quantity of soda is " + soda.getQuantity());

    jane.addCash(new BigDecimal("10.00"));
    System.out.println("Jane's cash on hand is " + jane.getCash());

    jane.buySnacks(chocolate, 1);
    System.out.println("Jane's cash on hand is " + jane.getCash());
    System.out.println("Quantity of chocolate bar is " + chocolate.getQuantity());

    pretzel.addQuantity(12);
    System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

    bob.buySnacks(pretzel, 3);
    System.out.println("Bob's cash on hand is " + bob.getCash());
    System.out.println("Quantity of pretzel is " + pretzel.getQuantity());
  }
}
