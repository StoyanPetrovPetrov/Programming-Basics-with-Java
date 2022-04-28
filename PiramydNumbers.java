import java.util.Scanner;

public class PiramydNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;
        boolean isEnaught = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int cows = 1; cows <= rows; cows++) {
                System.out.print(count + " ");
                if (count == n) {
                    isEnaught = true;
                    break;
                }
                count++;
            }
            if (isEnaught) {
                break;
            }
            System.out.println();

        }
    }
}


