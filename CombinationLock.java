
import java.util.Scanner;
/**
 * Creates a new simulated Combination Lock.
 *
 * @author Noah Luddy
 * @version 1.0
 */
public class CombinationLock
{
    // Instance Variables
    private String realA = "N";
    private String realB = "O";
    private String realC = "A";
    private boolean isLocked = true;
	private Scanner myScan;
	private Scanner myNewScan;

    /**
     * Creates a new lock with zero arguments, which has the combination "noa".
     */
    public CombinationLock() {}

    /**
     * Attempts to unlock the lock and informs the user whether they were successful or not.
     * @return      A String informing the user of the current status of the lock.
     */
    public String unlock() {
        if (isLocked) {
            System.out.print("Please enter the first letter of the combination: ");
            myScan = new Scanner(System.in);
            String tempA = myScan.nextLine();
            while (tempA.length() > 1) {
                System.out.print("You entered more than one letter. Please enter only one letter: ");
                tempA = myScan.nextLine();
            }

            //Note: This while statement of my code doesn't work, but I'm not sure why. I left in for you to see, though.
            while (tempA.indexOf(0) != -1 || tempA.indexOf(1) != -1 || tempA.indexOf(2) != -1 || tempA.indexOf(3) != -1 || tempA.indexOf(4) != -1 || tempA.indexOf(5) != -1 || tempA.indexOf(6) != -1 || tempA.indexOf(7) != -1 || tempA.indexOf(8) != -1 || tempA.indexOf(9) != -1) {
                System.out.print("Please enter only a letter, not a number: ");
                tempA = myScan.nextLine();
            }
            String a = tempA.substring(0, 1);

            System.out.print("Please enter the second letter of the combination: ");
            String tempB = myScan.nextLine();
            while (tempB.length() > 1) {
                System.out.print("You entered more than one letter. Please enter only one letter: ");
                tempB = myScan.nextLine();
            }
            String b = tempB.substring(0, 1);

            System.out.print("Please enter the third letter of the combination: ");
            String tempC = myScan.nextLine();
            while (tempC.length() > 1) {
                System.out.print("You entered more than one letter. Please enter only one letter: ");
                tempC = myScan.nextLine();
            }
            String c = tempC.substring(0, 1);

            if (realA.equalsIgnoreCase(a) && realB.equalsIgnoreCase(b) && realC.equalsIgnoreCase(c)) {
                isLocked = false;
                return "You opened the lock!";
            } else {
                isLocked = true;
                return "You entered the wrong combination. The lock is still locked.";
            }
        } else {
            return "The lock is already open!";
        }
    }

    /**
     * Locks the lock (if it isn't already locked) and informs the user that lock is indeed locked.
     * @return      A String informing the user of the status of the lock.
     */
    public String lock() {
        if (!isLocked) {
            isLocked = true;
            return "The lock is now locked.";
        } else {
            return "The lock is already locked!";
        }
    }

    /**
     * Changes the combination of the lock, if it can be changed, and informs the user of the new combination.
     * @return      A String either informing the user of the new combination they entered or informing the user that they cannot change the combination.
     */
    public String changeCombo() {
        if (!isLocked) {
            System.out.print("Please enter your first letter of the new combination: ");
            myNewScan = new Scanner(System.in);
            String tempA = myNewScan.nextLine();
            while (tempA.length() > 1) {
                System.out.print("You entered more than one letter. Please enter only one letter: ");
                tempA = myNewScan.nextLine();
            }
            realA = tempA.substring(0, 1);

            System.out.print("Please enter your second letter of the new combination: ");
            String tempB = myNewScan.nextLine();
            while (tempB.length() > 1) {
                System.out.print("You entered more than one letter. Please enter only one letter: ");
                tempB = myNewScan.nextLine();
            }
            realB = tempB.substring(0, 1);

            System.out.print("Please enter your third letter of the new combination: ");
            String tempC = myNewScan.nextLine();
            while (tempC.length() > 1) {
                System.out.print("You entered more than one letter. Please enter only one letter: ");
                tempC = myNewScan.nextLine();
            }
            realC = tempC.substring(0, 1);
            return "The combination has been changed to: " + realA + realB + realC;
        } else {
            return "You cannot change the combnation when the lock is locked.";
        }
    }
}
