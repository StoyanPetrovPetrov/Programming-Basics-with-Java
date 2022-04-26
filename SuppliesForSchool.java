import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penPackets = Integer.parseInt(scanner.nextLine());
        int markerPackets = Integer.parseInt(scanner.nextLine());
        int boardCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double totalWhithoutDiscaunt = penPackets * 5.80 + markerPackets * 7.20 + boardCleaner * 1.20;
        double total = totalWhithoutDiscaunt - (discount * 1.0 / 100) * totalWhithoutDiscaunt;
        System.out.println(total);
    }
}
