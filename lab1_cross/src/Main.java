import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first speed:\nV1 = ");
        float V1 = scanner.nextFloat();

        System.out.print("Enter the second speed:\nV2 = ");
        float V2 = scanner.nextFloat();

        System.out.print("Enter the time:\nT = ");
        float T = scanner.nextFloat();

        System.out.print("Enter the whole distance:\nS = ");
        float S = scanner.nextFloat();

        float D = S - (V1*T + V2*T);
        System.out.print("The distance between cars after " + T + " hours:\nD = " + D);
    }
}
