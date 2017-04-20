package date;

import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Scanner;

public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    return LocalDate.parse(str);
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    return date.getMonthValue() + ". " + date.getDayOfMonth() + ".";
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    if (date.equals(LocalDate.now())) {
      return true;
    } else {
      return false;
    }
//     TODO - return with true if today is the same month+day as date
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
//    int years;
//    if (LocalDate.now().getMonthValue() < birthday.getMonthValue()) {
//      years = LocalDate.now().getYear() - birthday.getYear()-1;
//    } else {
//      years = LocalDate.now().getYear() - birthday.getYear();
//    }
    return LocalDate.now().getYear() - birthday.getYear();
//     TODO - return how many years age the input date 'birthday' was
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    int remaining = 0;
    if (LocalDate.now().getDayOfYear() < date.getDayOfYear()) {
      return (date.getDayOfYear() - LocalDate.now().getDayOfYear());
    } else if (LocalDate.now().getDayOfYear() > date.getDayOfYear()) {
      return 365 - (LocalDate.now().getDayOfYear() - date.getDayOfYear());
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}