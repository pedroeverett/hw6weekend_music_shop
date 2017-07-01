package shop_management;

public abstract class Item {

  protected String name;
  protected String description;
  protected int stock;
  protected double buyingPrice;
  protected double sellingPrice;

  public Item(String name, String description, int stock, double buyingPrice, double sellingPrice) {
    this.name = name;
    this.description = description;
    this.stock = stock;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  }

}