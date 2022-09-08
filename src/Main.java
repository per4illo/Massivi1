public class Main {
    public static void main(String[] args) {

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double[] number2 = {1.57, 7.654, 9.986};
        int[] random10 = {5, 6, 77};
        for (int i = 0; i < 3; i++) {
            System.out.print(number[i]);
                if (i < 2) {
                    System.out.print(", ");
                }
        }
        System.out.print(" ");
        for (int i = 0; i < 3; i++) {
            System.out.print(number2[i]);
            if (i < 2) {
                System.out.print(", ");
            }

        }
        System.out.print(" ");
        for (int i = 0; i < 3; i++) {
            System.out.print(random10[i]);
            if (i < 2) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(number2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(random10[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (number[i] % 2 == 0) {
                            }
            else {
                number[i] = number[i] + 1;
            }
            System.out.println(number[i]);

        } 
    }
}