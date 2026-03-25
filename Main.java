import java.util.Random;

class Main
{
  public static void main(String[] args)
  {
    // Example calling the roll() method
    System.out.println("Roll: " + roll());
  }
  
  // Random is a class we can use to generate random numbers
  // You do not need to change anything in the method below
  // Every time you invoke the roll() method, it will generate a random int
  // between 0-5, and then we add 1, so it will return a number between 1-6, just like dice
  public static int roll()
  {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  }
}
import java.util.Random;

class Main
{
  public static void main(String[] args) {
    int one = 0;
    int two = 0
    int three = 0;
    int four = 0;
    int five = 0
    int six = 0;

    for (int i = 0; i < 100; i++)
      // Example calling the roll() method
      int currentRoll = roll();
    System.out.println("Roll: " + i + ": [" + currentRoll + "]");
    if (currentRoll == 1) {
      one++;
    }
    if (currentRoll == 2) {
      two++;
    }
    if (currentRoll == 3) {
      three++;
    }
    if (currentRoll == 4) {
      four++;
    }
    if (currentRoll == 5) {
      five++;
    }
    if (currentRoll == 6) {
      six++;
    }
  }
  // Random is a class we can use to generate random numbers
  // You do not need to change anything in the method below
  // Every time you invoke the roll() method, it will generate a random int
  // between 0-5, and then we add 1, so it will return a number between 1-6, just like dice
  public static int roll()
  {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  }
