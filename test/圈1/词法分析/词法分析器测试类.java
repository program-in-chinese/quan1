package 圈1.词法分析;

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
    assertEquals(3, 词法分析器类.取Token列表("1+2").size());
    // TODO: 测试第二个Token
  }
}
