package 圈1;

import java.util.Scanner;

/**
 * 主程序. 参考了"两周自制脚本语言"一书的实现.
 */
public class 圈1 {

  private static final String 常量_命令_退出 = "拜";

  private static final String 常量_反馈_提示 = "请说:";
  private static final String 常量_反馈_欢迎 = "欢迎使用";
  private static final String 常量_反馈_退出 = "回见";
  private static final String 常量_反馈_无法识别 = "不可识别: ";
  
  private static final Scanner 读入 = new Scanner(System.in);
  
  public static void main(String[] 参数) {
    String 命令;
    反馈(常量_反馈_欢迎);
    do {
      反馈(常量_反馈_提示, false);
      命令 = 读入.nextLine();
      应对(命令);
    } while (!命令.equals(常量_命令_退出));
  }
  
  private static void 应对(String 命令) {
    if (命令.equals(常量_命令_退出)) {
      反馈(常量_反馈_退出);
    } else {
      反馈(常量_反馈_无法识别 + 命令);
    }
  }

  private static void 反馈(String 信息) {
    反馈(信息, true);
  }
  
  private static void 反馈(String 信息, boolean 换行) {
    if (换行) {
      System.out.println(信息);
    } else {
      System.out.print(信息);
    }
  }
}
