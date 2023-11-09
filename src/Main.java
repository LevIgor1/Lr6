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


        double [][] arr2;
        System.out.print("Введіть кількість елементів: ");
        n = in.nextInt();
        arr2 = new double[n][2];
        for (int i = 0; i < n; i++) {
            arr2[i][0] = -20 + Math.random() * 50;
            arr2[i][1] = -20 + Math.random() * 50;
            System.out.println("x: " + arr2[i][0] + " y: " +  arr2[i][1]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr2[i][0] > 0 && arr2[i][1] < 0)
                count++;
        }
        System.out.println("Кількість точок в 4 площіні: " + count);

    }
}