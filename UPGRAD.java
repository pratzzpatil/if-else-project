import java.util.*;

public class UPGRAD
{

    // 1. write a java program in which employee gets bonus
    public static void main(String[] args) 
    {
        Scanner Sc =new Scanner(System.in);
        
        System.out.println("please enter your salary:");
        
        double salary= Sc.nextDouble();
        
        System.out.println("please enter your year of service:");
        
        double service= Sc.nextDouble();
        
        if (service>3)
        {
            System.out.println("you will get the bonus of: "+(salary*5/100)+  " total salary will become:" +(salary + salary*5/100) );
       }

       else
       {
           System.out.println("no bonus,your salary is:"+ salary);
       }

       // 2. write a java program for calculating profit and loss of a product

       Scanner Input = new Scanner(System.in);
        
        System.out.println("enter the cost price of the product:");
        
        int cp= Input.nextInt();
        
        System.out.println("enter the selling price of the product:");
        
        int sp= Input.nextInt();
        
        int profit;
        int loss;
        
        if (sp>cp)
        {
            profit=sp-cp;
            
            System.out.println("profit on the product is:"+profit);
        }
        else if(cp>sp)
        {
            loss=cp-sp;
            
            System.out.println("loss on the product is:"+loss);
            
        }
        else
        {
            System.out.println("there is no profit no loss on the product");
        }

        // 3. write a java code for the factorial
            Scanner pro = new Scanner(System.in);
            System.out.println("please enter the integer number");
           int number = pro.nextInt();

           int factorial =1;

           for (int i= 1; i<=number; i++)
           {
                 factorial = factorial*i;
           }
              
           System.out.println("the factorial of the given number is:"+factorial);

        // 4. write a java program by taking user input if the given number is divisible by 5 and 7
             
             
            Scanner bro = new Scanner(System.in);

            System.out.println("please enter the integer number:");

            int num = pro.nextInt();

            while( num<=num)
            {
                    
                if(num%5==0 && num%7==0)
                {
                    System.out.println("the given number is divisible by 5 and 7");
                }

                else
                {
                    System.out.println("the given number is not divisible by 5 and 7");
                }

                num++;

                break;
            }

            // 5. write a java program for getting number from user using switch

            Scanner run = new Scanner(System.in);

            System.out.println("enter the number between 1 and 5");

            int pum =run.nextInt();

            switch(pum)
            {
                case 1: System.out.println("you entered number 1");

                break;

                case 2: System.out.println("you entered number 2");

                break;

                case 3: System.out.println("you entered number 3");

                break;

                case 4: System.out.println("you entered number 4");

                break;

                case 5: System.out.println("you entered number 5");

                break;
            }


    }
}