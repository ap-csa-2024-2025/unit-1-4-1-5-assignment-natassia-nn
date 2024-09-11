public class Problem2
{
    public static void main(String[] args)
    {
        int value = 678;
        int firstDigit = value/100;
        int secondDigit = value%100/10;
        int thirdDigit = value%10;
        System.out.println("Here are the digits:");
        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
    }
}
