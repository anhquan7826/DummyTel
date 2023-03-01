package org.example;

import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập giờ bắt đầu cuộc gọi: ");
    int hour = scanner.nextInt();
    System.out.print("Nhập phút bắt đầu cuộc gọi: ");
    int minute = scanner.nextInt();
    System.out.print("Nhập thời lượng cuộc gọi: ");
    int duration = scanner.nextInt();
    try {
      CallLog log = new CallLog(hour, minute, duration);
      System.out.println("Giá tiền cuộc gọi là: " + log.getPrice());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}