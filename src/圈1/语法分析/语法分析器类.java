package 圈1.语法分析;

import java.util.HashMap;
import 圈1.词法分析.词法分析器类;

public class 语法分析器类 {
  private static final HashMap<String, Integer> 二元运算符 = new HashMap<>();
  
  private 程序类 程序 = new 程序类();
  
  static {
    二元运算符.put("=", 1);
    二元运算符.put("+", 2);
  }
  
  public 树节点接口 分析(词法分析器类 词法分析器) {
    程序.分析(词法分析器);
    return 程序;
  }
}
