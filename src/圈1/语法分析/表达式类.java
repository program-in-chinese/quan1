package 圈1.语法分析;

import java.util.ArrayList;
import java.util.List;
import 圈1.词法分析.词法分析器类;

public class 表达式类 implements 树节点接口 {
  
  List<树节点接口> 节点列表 =  new ArrayList<>();
  
  static boolean 匹配(词法分析器类 词法分析器) {
    return 数节点类.匹配(词法分析器);
  }

  public void 分析(词法分析器类 词法分析器) {
    if(数节点类.匹配(词法分析器)){
      数节点类 数节点 = new 数节点类(词法分析器.弹出());
      节点列表.add(数节点);
    }
  }
  
  public List<树节点接口> 取节点列表() {
    return 节点列表;
  }
}
