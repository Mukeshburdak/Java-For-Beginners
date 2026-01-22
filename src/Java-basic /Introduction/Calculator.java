//Simple interest Calculator

import java.util.Scanner;

class simple {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        int p = sc.nextInt();

        System.out.print("Enter the rate : ");
        int r = sc.nextInt();

        System.out.print("Enter the time : ");
        int t = sc.nextInt();

        float si = (float) (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }
}