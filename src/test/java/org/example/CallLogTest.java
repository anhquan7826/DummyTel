package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class cho CallLog.
 */
public class CallLogTest {
  @Test
  void test1() throws Exception {
    assertEquals((new CallLog(1, 2, 3)).getPrice(), 0.79);
  }

  @Test
  void test2() throws Exception {
    assertEquals((new CallLog(10, 22, 34)).getPrice(), 17.85);
  }

  @Test
  void test3() throws Exception {
    assertEquals((new CallLog(18, 0, 49)).getPrice(), 25.73);
  }

  @Test
  void test4() throws Exception {
    assertEquals((new CallLog(18, 2, 49)).getPrice(), 12.86);
  }

  @Test
  void test5() throws Exception {
    assertEquals((new CallLog(7, 59, 60)).getPrice(), 15.75);
  }

  @Test
  void test6() throws Exception {
    assertEquals((new CallLog(7, 59, 61)).getPrice(), 13.61);
  }

  @Test
  void test7() {
    Exception exception = assertThrows(Exception.class, () -> {
      CallLog log = new CallLog(-7, 59, 61);
    });
    assertEquals("Sai định dạng giờ!", exception.getMessage());
  }

  @Test
  void test8() {
    Exception exception = assertThrows(Exception.class, () -> {
      CallLog log = new CallLog(54, 59, 61);
    });
    assertEquals("Sai định dạng giờ!", exception.getMessage());
  }

  @Test
  void test9() {
    Exception exception = assertThrows(Exception.class, () -> {
      CallLog log = new CallLog(3, -24, 23);
    });
    assertEquals("Sai định dạng phút!", exception.getMessage());
  }

  @Test
  void test10() {
    Exception exception = assertThrows(Exception.class, () -> {
      CallLog log = new CallLog(3, 60, 23);
    });
    assertEquals("Sai định dạng phút!", exception.getMessage());
  }

  @Test
  void test11() {
    Exception exception = assertThrows(Exception.class, () -> {
      CallLog log = new CallLog(4, 45, -543);
    });
    assertEquals("Sai định dạng thời lượng!", exception.getMessage());
  }
}
