import java.util.Scanner;

class input {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value : ");
        int a = sc.nextInt();

        System.out.print("Enter the boolean value : ");
        boolean b = sc.nextBoolean();

        System.out.print("Enter the string value : ");
        String c = sc.next();//take only string but no space between them.

        //To handle extra enter press by user.
        sc.nextLine();

        System.out.print("Enter the complete line : ");
        String d = sc.nextLine();//take input as complete line.

        System.out.print("To read a character : ");
        char e = sc.next().charAt(0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}