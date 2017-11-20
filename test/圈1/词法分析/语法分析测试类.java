/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 圈1.词法分析;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import 圈1.语法分析.数节点类;
import 圈1.语法分析.树节点接口;
import 圈1.语法分析.语法分析器类;

/**
 *
 * @author xuanwu
 */
public class 语法分析测试类 {
  
  public 语法分析测试类() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void 分析() {
    语法分析器类 语法分析器 = new 语法分析器类();
    树节点接口 程序 = 语法分析器.分析(new 词法分析器类("2"));
    assertEquals(1, 程序.取节点列表().size());
    树节点接口 表达式 = 程序.取节点列表().get(0);
    assertEquals(1, 表达式.取节点列表().size());
    树节点接口 数节点 = 表达式.取节点列表().get(0);
    assertEquals(2, 数节点 instanceof 数节点类 ? ((数节点类)数节点).取值() : 0);
  }
}
