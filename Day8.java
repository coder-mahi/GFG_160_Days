/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2
Stock Buy and Sell – Max one Transaction Allowed
Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.
Note: Stock must be bought before being sold.
*/
// TIme complexity - O(N)
// Space complexity - O(1)

class Day8 {
    public int maximumProfit(int prices[]) {
        // Code here
       int min_price = Integer.MAX_VALUE;
       int max_profit = 0;
       for(int price:prices){
           if(price<min_price){
               min_price = price;
           }else if(price-min_price>max_profit){
               max_profit = price - min_price;
           }
       }
       return max_profit;
    }
}
