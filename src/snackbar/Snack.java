package snackbar;

import java.math.BigDecimal;

class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private BigDecimal cost;
  private int vendingMachineId;

  public Snack(String name, BigDecimal cost, int vendingMachineId) {
    maxId++;
    this.id = maxId;
    this.name = name;
    this.quantity = 0;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public BigDecimal getCost() {
    return this.cost;
  }

  public void setVendingMachineId(int vendingMachineId) {
    this.vendingMachineId = vendingMachineId;
  }

  public int getVendingMachineId() {
    return this.vendingMachineId;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void addQuantity(int x) {
    this.quantity += x;
  }

  public void buy(int x) {
    this.quantity -= x;
  }

  public BigDecimal totalCost(int x) {
    return this.cost.multiply(new BigDecimal(x));
  }
}