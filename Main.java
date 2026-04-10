// NAME: Jonathan Smith
// Class: CS-111 / 1258
// Date: 04/09/2026 
import java.util.Random;
/**
 * Lab 11: Dice + Repetition/Looping
 * This program simulates rolling a six-sided die 100 times and
 * tracks the frequency of each result using a for loop.
 */
class Main
{
  public static void main(String[] args) {
  // Initialize coun ters for each possible dice face (1-6)
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;

  // Loop runs exactly 100 itterations to stimulate 100 rolls
    for (int i = 1; i <= 100; i++){
      // Example calling the roll() method
      int currentRoll = roll();
  // Print the current roll number and the value rolled
    System.out.println("Roll " + i + ": [" + currentRoll + "]");
  // Increment the counter, based on the result of the roll
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
  // Display the summary after all 100 rolls are complete
    System.out.println("\nFinal Roll Counts:");
    System.out.println("[1]: " + one + " times");
    System.out.println("[2]: " + two + " times");
    System.out.println("[3]: " + three + " times");
    System.out.println("[4]: " + four + " times");
    System.out.println("[5]: " + five + " times");
    System.out.println("[6]: " + six + " times");
    //System.out.println("...");
    }
  
  // Random is a class we can use to generate random numbers
  // You do not need to change anything in the method below
  // Every time you invoke the roll() method, it will generate a random int
  // between 0-5, and then we add 1, so it will return a number between 1-6, just like dice
  public static int roll()
  {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  };
}