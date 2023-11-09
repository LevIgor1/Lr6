import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] arr;
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількість елементів: ");
        int n = in.nextInt();
        arr = new double[n];
        for (int i = 0; i < n; i++){
            arr[i] = Math.random() * 5;
            System.out.print(arr[i] + "\n");
        }
        double maxim = Arrays.stream(arr).max().getAsDouble();
        double avgs = Arrays.stream(arr).average().getAsDouble();
        System.out.println("\nМаксимальне число: " + maxim);
        System.out.println("Середня арифметичне: " + avgs);
    }
}