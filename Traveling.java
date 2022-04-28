import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")){
            double needBudget = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            while (savedMoney < needBudget) {
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney += money;
            }
            System.out.println("Going to " + destination + "!");



            destination = scanner.nextLine();
        }
    }
}
