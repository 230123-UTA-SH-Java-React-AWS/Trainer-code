# Problem
* You are given a list of integers which represents the current value of the stock you are trading with
* Each index corresponds to a given day of the week.
* For each day you can choose to buy and/or sell your current stock
* Find the maximum profit you can achieve.
* If max profit cannot be achieved, just return 0

# Constraints
* prices 1 <= p <= 10
* list is never empty

# Example
* [7, 1, 5, 3, 6, 4]

* you buy on day 2 so current profit is : -$1
* you sell the stock on day 5 so now your current profit is : $5

* There are a lot more possibilities when determining the max profit
* Buy on day 2 so current profit is : -$1
* Sell on day 3 so current profit is : $4
* Buy on day 4 so current profit is : $-3
* Sell on day 5 so current profit is : $3
* So total profit is 4 + 3 = $7
* Which beats the previous solution, therefore this is the maximum profit you can achieve

* [1, 2, 3, 4, 5]

* Buy on day 1 : -$1
* Sell on day 5: $5
* Total max profit is $4