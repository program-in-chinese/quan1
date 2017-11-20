package 圈1.语法分析;

import 圈1.词法分析.词法分析器类;
import 圈1.词法分析.词类;

public class 数节点类 extends 基本类型类 {

  static boolean 匹配(词法分析器类 词法分析器) {
    词类 词 = 词法分析器.一瞧();
    return 词.是数();
  }

  public 数节点类(词类 词) {
    super(词);
  }

  public int 取值() {
    return 词.取值();
  }
}
