import java.util.Scanner;

public class test02 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String num = sc.next();

        int sum = 0;
        for(int i = 0; i < cnt; i++)
        {
            sum += num.charAt(i) - '0';
            //sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.print(sum);
    }
}