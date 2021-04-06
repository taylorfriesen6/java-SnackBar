package snackbar;

import java.math.BigDecimal;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private BigDecimal cashOnHand;

  public Customer(String name) {
    maxId++;
    this.id = maxId;
    this.name = name;
    this.cashOnHand = new BigDecimal(0);
  }

  public int getId() {
    return this.id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void addCash(BigDecimal addedCash) {
    this.cashOnHand = this.cashOnHand.add(addedCash);
  }

  public BigDecimal getCash() {
    return this.cashOnHand;
  }

  public void buySnacks(Snack snack, int amount) {
    snack.buy(amount);
    cashOnHand = cashOnHand.subtract(snack.totalCost(amount));
  }
}
