class Largest {
    public static void main(String args[]) {
        int a = 10, b = 25, c = 15;

        System.out.println("Inputs:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if(a >= b && a >= c)
            System.out.println("Output: Largest = " + a);
        else if(b >= a && b >= c)
            System.out.println("Output: Largest = " + b);
        else
            System.out.println("Output: Largest = " + c);
    }
}
