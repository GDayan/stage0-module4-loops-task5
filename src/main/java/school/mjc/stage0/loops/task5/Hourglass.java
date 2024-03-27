package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height <= 0) {
            return;
        }

        // Upper half of the hourglass
        for (int i = 0; i < height; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print '8's
            for (int k = 0; k < 2 * (height - i) - 1; k++) {
                System.out.print("8");
            }
            System.out.println();
        }

        // Lower half of the hourglass
        for (int i = height - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print '8's
            for (int k = 0; k < 2 * (height - i) - 1; k++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
