package shop_management;
import behaviours.*;

public class Guitar implements Playable {
  private String name;
  private int strings;
  private String wood;

  public Guitar(String name, int strings, String wood) {
    this.name = name;
    this.strings = strings;
    this.wood = wood;
  }

  public String play() {
    return "tin tin tin";
  }

}