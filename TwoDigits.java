import java.io.Console;

public class TwoDigits {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a number and I'll tell you if it has two digits.");
    String stringUserNumber = myConsole.readLine();
    Integer userNumber = Integer.parseInt(stringUserNumber);

    if ((userNumber >=10) && (userNumber <=99)) {
      System.out.println("Your number has two digits");
    } else {
      System.out.println("Your number does not have two digits.");
    }
  }
}
