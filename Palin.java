class Palin{
    public static void main(String args[]) {
        int num = 121;
        int temp = num, rev = 0, rem;

        System.out.println("Input: " + num);

        while(num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(temp == rev)
            System.out.println("Output: Palindrome Number");
        else
            System.out.println("Output: Not a Palindrome");
    }
}
