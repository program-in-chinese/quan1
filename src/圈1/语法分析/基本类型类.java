package 圈1.语法分析;

import java.util.ArrayList;
import java.util.List;
import 圈1.词法分析.词类;

public class 基本类型类 implements 树节点接口 {
  
  List<树节点接口> 节点列表 =  new ArrayList<>();
  
  protected 词类 词;
  
  public 基本类型类(词类 t) {
    词 = t;
  }
  
  public List<树节点接口> 取节点列表() {
    return 节点列表;
  }
}
