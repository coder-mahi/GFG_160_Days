/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615
Stock Buy and Sell – Multiple Transaction Allowed

The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.
Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.
*/
// TIme Complexity : O(N)
// Space complexity : O(1)
class Day7 {
    public int maximumProfit(int prices[]) {
        // code here
        int res = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                res += prices[i] - prices[i-1];
            }
        }
        return res;
    }
}
