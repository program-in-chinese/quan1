package 圈1.词法分析;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 词法分析器类 {

  private static final String 常量_正则表达式_数 = "[0-9]+";
  
  // 支持中文标识符
  private static final String 常量_正则表达式_标识符 = "[A-Z_a-z\\u4E00-\\u9FA5][A-Z_a-z\\u4E00-\\u9FA50-9]*";
  private static final String 常量_正则表达式_全部 = "\\s*"
          + "((//.*)|(" + 常量_正则表达式_数 + ")|"
          + "(\"(\\\\\"|\\\\\\\\|\\\\n|[^\"])*\")|" + 常量_正则表达式_标识符 + "|==|<=|>=|&&|\\|\\||\\p{Punct})?";
  private static final Pattern 常量_模式_全部 = Pattern.compile(常量_正则表达式_全部);

  public static List<词类> 取词列表(String 输入) {
    List<词类> 词列表 = new ArrayList<>();
    String[] 分行 = 输入.split("\n");
    for (String 行 : 分行) {
      Matcher 匹配器 = 常量_模式_全部.matcher(行);
      int 开始位置 = 0;
      int 结束位置 = 行.length();
      while (开始位置 < 结束位置) {
        匹配器.region(开始位置, 结束位置);
        if (匹配器.lookingAt()) {
          词列表.add(取词(匹配器));
          开始位置 = 匹配器.end();
        } else {
          // TODO: 抛例外
        }
      }
    }
    return 词列表;
  }

  protected static 词类 取词(Matcher 匹配器) {
    词类 词 = null;
    String 匹配字符串 = 匹配器.group(1);
    
    // 如果不是空格
    if (匹配字符串 != null)
    {
      // 如果不是注释 (// 开头)
      if (匹配器.group(2) == null) {
        if (匹配器.group(3) != null) {
          词 = new 数词类(Integer.parseInt(匹配字符串));
        } else {
          词 = new 标识符词类(匹配字符串);
        }
      }
    }
    return 词;
  }
}
