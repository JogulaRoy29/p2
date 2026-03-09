class Fact {
    public static void main(String args[]) {
        int num = 5;
        int fact = 1;

        System.out.println("Input: " + num);

        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Output: Factorial = " + fact);
    }
}
