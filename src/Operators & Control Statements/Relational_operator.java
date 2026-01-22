import java.util.Scanner;
class operator {
    public static void main(String[] args){
        int a  , b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        // == operator
        System.out.println(a==b);

        //!= operator
        System.out.println(a!=b);

        //> opertor
        System.out.println(a>b);

        //< operator
        System.out.println(a<b);

        //>= operator
        System.out.println(a>=b);

        //<= operator
        System.out.println(a<=b);
    }
}