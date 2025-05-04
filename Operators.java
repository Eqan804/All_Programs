public class Operators {
    public static void main(String[] args) {
        System.out.println("Operators");
       /*  Operand, operator, operand  = Result
       4   +   7   =  11

       Types of operators in java
       Arithematic operators
       Assignment operators
       Logical operators
       Comparison
        */
        /*  Arithematic operators jo ke comman arithematical operasion kar te hai
        Exmples:
        */ 
        System.out.println("Arithematic operators");
         // you can numbers Ans one and beautifull to print pe Ln remove kar lo this is 
        
         System.out.println("Addition value");
         int num1 = 20, num2=12;
        System.out.println("The value of num1 + num2 is ");
        System.out.println(num1 + num2);

        System.out.println("Subtract value");

        int num3 = 23, num4=20;
        System.out.println("The value of num3 - num4 is ");
        System.out.println(num3 - num4);
        System.out.println("Multiply value");

        int num5 = 2, num6=3;
        System.out.println("The value of num5 * num6 is ");
        System.out.println(num5 * num6);

        System.out.println("Division value");

        int num7 = 2, num8=6;
        System.out.println("The value of num7 / num8 is ");
        System.out.println(num7 / num8);
        
        // Module means remainder

        System.out.println("Module value");
        int num9 = 3, num10=6;
        System.out.println("The value of num9 % num10 is ");
        System.out.println(num9 % num10);

        System.out.println("Num++");
        int num12 = 3, num11=6;
        System.out.println(num11++);

        System.out.println("++num");
        int num13 = 3, num14=6;
        System.out.println(++num12);

        System.out.println("Num--");
        int num16 = 3, num15=6;
        System.out.println(num13--);

        System.out.println("--num");
        int num18 = 3, num17=6;
        System.out.println(--num14);

        System.out.println("This is ignore");
        System.out.println(num18 + num17);
        System.out.println(num16 - num15 );

       // Assignment operator
       System.out.println("Assignment Operator");
       int num20 = 2, num21=5;
       // this num++ mean add 3 more number
       num20 += 3;
       num21 -= 2;
       System.out.println(num20 + num21 );

       /*  Comparion Operators
       1. == Check for equality of two value
       2. != Check if two value are not equal
       3. <  Check if two value are greater than
       4. >  Check if two value are less than
       5. <= Check if two value are greater than or equal to
       6. >= Check if two value are and less than or equal to
       */

       /* Logical Operators:
       1. && - Logical and operator - return true only if both conditions are true
       2. || - Logical or operator - return true if any one conditions are true
       3. ! - Logical not - Reverse the result from true to false and vice versa
       */
}
}