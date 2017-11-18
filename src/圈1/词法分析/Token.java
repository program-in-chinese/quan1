package 圈1.词法分析;

public abstract class Token {

  public boolean 是标识符() {
    return false;
  }

  public boolean 是数() {
    return false;
  }

  public int 取值() {
    throw new 圈1例外类("不是数Token");
  }

  public String 取文本() {
    return "";
  }
}
