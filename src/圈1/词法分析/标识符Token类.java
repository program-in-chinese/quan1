package 圈1.词法分析;

public class 标识符Token类 extends Token {

  private final String 名称;

  protected 标识符Token类(String id) {
    super();
    名称 = id;
  }

  public boolean 是标识符() {
    return true;
  }

  public String 取文本() {
    return 名称;
  }
}
