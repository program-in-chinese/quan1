package 圈1.词法分析;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xuanwu
 */
public class 词法分析器测试类 {
  
  public 词法分析器测试类() {
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
    assertEquals(1, 词法分析器类.取Token列表("1").size());
    
    List<Token> token列表 = 词法分析器类.取Token列表("1+2");
    assertEquals(3, token列表.size());
    assertEquals(1, token列表.get(0).取值());
    assertEquals("+", token列表.get(1).取文本());
    assertEquals(2, token列表.get(2).取值());

    token列表 = 词法分析器类.取Token列表("年龄 = 去年年龄 + 1");
    assertEquals(5, token列表.size());
    assertEquals("年龄", token列表.get(0).取文本());
    assertEquals("=", token列表.get(1).取文本());
    assertEquals("去年年龄", token列表.get(2).取文本());
    assertEquals("+", token列表.get(3).取文本());
    assertEquals(1, token列表.get(4).取值());

    token列表 = 词法分析器类.取Token列表("如果(年龄>1){\n1}\n否则{2}");
    assertEquals(13, token列表.size());
    assertEquals("如果", token列表.get(0).取文本());
    assertEquals("(", token列表.get(1).取文本());
    assertEquals("年龄", token列表.get(2).取文本());
    assertEquals(">", token列表.get(3).取文本());
    assertEquals(1, token列表.get(4).取值());
    assertEquals(")", token列表.get(5).取文本());
    assertEquals("{", token列表.get(6).取文本());
    assertEquals("1", token列表.get(7).取文本());
    assertEquals("}", token列表.get(8).取文本());
    assertEquals("否则", token列表.get(9).取文本());
    assertEquals("{", token列表.get(10).取文本());
    assertEquals("2", token列表.get(11).取文本());
    assertEquals("}", token列表.get(12).取文本());
  }
}
