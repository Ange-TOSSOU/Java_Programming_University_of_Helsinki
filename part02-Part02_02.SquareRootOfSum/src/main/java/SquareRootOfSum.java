
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        int sum = first + second;
        
        if (sum >= 0) {
            System.out.println(Math.sqrt(sum));
        }
    }
}
