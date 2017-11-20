package 圈1.词法分析;

public abstract class 词类 {

  public boolean 是标识符() {
    return false;
  }

  public boolean 是数() {
    return false;
  }

  public int 取值() {
    throw new 圈1例外类("不是数词");
  }

  public String 取文本() {
    return "";
  }
}
