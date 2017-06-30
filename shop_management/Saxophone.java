package shop_management;
import behaviours.*;

public class Saxophone implements Playable {

  private String name;
  private String type;
  private int keys;

  public Saxophone (String name, String type, int keys) {
    this.name = name;
    this.type = type;
    this.keys = keys;
  }

  public String play() {
    return "fon fon fon";
  }

  public String getType() {
    return this.type;
  }
}