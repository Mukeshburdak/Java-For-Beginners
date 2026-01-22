class variable {
    static void main() {
        int num = 10;
        int num2 = 20;

        //Output statement in java programming language basic syntax.
        System.out.println(num);//10
        System.out.println(num2);//20

        System.out.print("Sum of two number is : ");
        System.out.println(num2 + num);//Sum of two number is : 30

        System.out.print("Remainder of two number is : ");
        System.out.println(num % num2);//Remainder of two number is : 10

        System.out.println("My age is : " + (num + num2));//My age is : 30

        //Here you notice a basic difference between to statement and there output;

        System.out.println("My age is : " + num + num2);//My age is : 1020

        byte a = 3;
        System.out.println(a);

        short s = 50;
        System.out.println(s);

        int i = 1000;
        System.out.println(i);

        long l = 39029403L;//L is use to specify it is long type not an int type.
        System.out.println(l);

        float f = 3.9F;//Here also the same case F specify it is float type not double type we explicitly define its type.
        System.out.println(f);

        double d = 3204.38922;
        System.out.println(d);
    }
}