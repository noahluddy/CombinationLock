
import java.util.Scanner;
/**
 * Tests the CombinationLock class.
 *
 * @author Noah Luddy
 * @version 1.0
 */
public class Driver
{
    private static Scanner newScan;

	public static void main(String[] args) {
        //System.out.println("\f");

        System.out.println("Welcome to Noah's virtual lock factory! Congratulations on buying a brand new lock! \nHere's a list of things you can do: ");
        System.out.println("\n\t Unlock - Attempt to unlock your lock");
        System.out.println("\t Lock - Lock your lock");
        System.out.println("\t Change - Change the Combination of your lock");
        System.out.println("\t Close - Close this program");
        System.out.print("\nPlease enter the command you would like to execute: ");

        newScan = new Scanner(System.in);
        String input = newScan.nextLine();

        CombinationLock myLock = new CombinationLock();

        while (!input.equalsIgnoreCase("close")) {
            if (input.equalsIgnoreCase("unlock")) {
                System.out.println(myLock.unlock());
            } else if (input.equalsIgnoreCase("lock")) {
                System.out.println(myLock.lock());
            } else if (input.equalsIgnoreCase("change")) {
                System.out.println(myLock.changeCombo());
            } else {
                System.out.println("You did not enter a valid option. Please enter \"unlock\", \"lock\", \"change\", or \"close\".");
            }

            System.out.print("\nPlease enter the next command you would like to execute: ");
            input = newScan.nextLine();
        }
        System.exit(0);
    }
}
