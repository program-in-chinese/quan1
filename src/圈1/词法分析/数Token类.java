package 圈1.词法分析;

public class 数Token类 extends Token {

  private final int 值;

  protected 数Token类(int 数值) {
    super();
    值 = 数值;
  }

  public boolean 是数() {
    return true;
  }

  public String 取文本() {
    return Integer.toString(值);
  }

  public int 取值() {
    return 值;
  }
}
