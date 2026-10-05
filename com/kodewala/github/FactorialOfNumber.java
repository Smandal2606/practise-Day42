
   package com.kodewala.github;
   
   class FactorialOfNumber
   {
     public static void main(String[] args)
   {
   int number = 5;
   int i = 1;
   int facto = 1;
   
   while(i <= number)
   {
   facto = facto * i;
   i++
   }
   System.out.println("The Factorial of" + number + " is: " + facto);
   }
   }