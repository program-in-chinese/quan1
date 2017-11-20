package 圈1.语法分析;

import java.util.ArrayList;
import java.util.List;
import 圈1.词法分析.词法分析器类;

public class 程序类 implements 树节点接口 {

  List<树节点接口> 节点列表 =  new ArrayList<>();
  
  public void 分析(词法分析器类 词法分析器) {
    // 仅单语句
    if (表达式类.匹配(词法分析器)) {
      表达式类 表达式 = new 表达式类();
      表达式.分析(词法分析器);
      节点列表.add(表达式);
    }
  }
  
  public List<树节点接口> 取节点列表() {
    return 节点列表;
  }
}
