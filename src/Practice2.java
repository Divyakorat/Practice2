import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your maths marks:");
        int maths = scanner.nextInt();
        System.out.println("please enter your english marks");
        int eng = scanner.nextInt();
        System.out.println("please enter your Science marks");
        int Sci = scanner.nextInt();
        int total = maths + eng + Sci;
        double percentage = total / 3;
        System.out.println("Total marks = +total");
        System.out.println("percentage = " + percentage);
        if (percentage < 40)
        {
            System.out.println("fail");
        } else if (percentage >= 40 && percentage < 50)
        {
            System.out.println("C grade");
        }
        else if (percentage>50 && percentage< 60)
        {
            System.out.println("B grade");
        }
        else if (percentage>= 70 && percentage <=100)
        {
            System.out.println("A grade");
        }
        else
            {
            System.out.println("invalid entry");
        }
    }
}