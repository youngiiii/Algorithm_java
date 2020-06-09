import java.util.Scanner;

public class test01 {

    public static void main(String[] args)
    {
        //아스키 코드 출력
        Scanner sc = new Scanner(System.in);

        int c = sc.next().charAt(0); 
        System.out.println(c);
    }
}