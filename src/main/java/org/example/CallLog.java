package org.example;

/**
 * The type Call log.
 */
public class CallLog {
  /**
   * The Hour.
   */
  final public int hour;
  /**
   * The Minute.
   */
  final public int minute;
  /**
   * The Duration.
   */
  final public int duration;

  /**
   * CallLog chứa thời gain bắt đầu cuộc gọi và thời lượng.
   *
   * @param hour     thời gian bắt đầu ở đơn vị giờ.
   * @param minute   thời gian bắt đầu ở đơn vị phút.
   * @param duration thời lượng cuộc gọi.
   * @throws Exception the exception
   */
  public CallLog(int hour, int minute, int duration) throws Exception {
    this.hour = hour;
    this.minute = minute;
    this.duration = duration;
    if (hour < 0 || hour > 23) throw new Exception("Sai định dạng giờ!");
    if (minute < 0 || minute > 59) throw new Exception("Sai định dạng phút!");
    if (duration < 0) throw new Exception("Sai định dạng thời lượng!");
  }

  /**
   * Gets price.
   *
   * @return the price
   */
  public double getPrice() {
    double price = 0.5 * duration;
    // Giảm 50% cho cuộc gọi bắt đầu từ sau hoặc bằng 18:01 đến trước hoặc bằng 07:59.
    if ((hour >= 18 && minute > 0) || hour < 8) {
      price = price * 0.5;
    }
    // Giảm 15% cho cuộc gọi có thời lượng tính từ phút 61 trở đi.
    if (duration > 60) {
      price = price * 0.85;
    }
    return (double) Math.round((price * 1.05) * 100) / 100;
  }
}
