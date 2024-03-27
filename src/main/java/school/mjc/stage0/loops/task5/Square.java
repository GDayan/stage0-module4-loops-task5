package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        if (sideLength <= 0) {
            System.out.println("Side length should be greater than 0");
            return;
        }

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
