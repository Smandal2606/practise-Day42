
   package com.kodewala.github;
   
   class AccessArraysIndex
   {
    public static void main(String[] args)
   {
   int prices[] = new int[5];
   
   prices[0] = 50;
   prices[1] = 100;
   prices[2] = 200;
   prices[3] = 150;
   prices[4] = 300;
   
   for(int i = 0; i < prices.length; i++)
   {
    if(prices[i] == 150){
	 break;
	}
   }
   System.out.println(prices[i] + " ");
   }
   }