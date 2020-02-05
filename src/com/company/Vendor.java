package com.company;

public class Vendor
{
    // Fields:
    private int price;
    private int stock;
  private int deposit;



          /**
           * Constructs a Vendor
           * @param price the price of a single item in cents (int)
           * @param stock number of items to place in stock (int)
           */
          public Vendor(int a , int b)
          {
            price = a;
            stock = b;
            deposit = 0;

    }

    /**
     * Sets the quantity of items in stock.
     * @param qty number of items to place in stock (int)
     */
    public void setStock(int numberOfItems){
      stock = numberOfItems;

    }

    /**
     * Returns the number of items currently in stock.
     * @return number of items currently in stock (int)
     */
    public int getStock()
    {
      return stock;
    }

    /**
     * Adds a specified amount (in cents) to the
     * deposited amount.
     * @param number of cents to add to the deposit (int)
     */
    public void addMoney(int cents)
    {
    deposit = cents + deposit;

    }

    /**
     * Returns the currently deposited amount (in cents).
     * @return number of cents in the current deposit (int)
     */
    public int getDeposit()
  {
   return deposit;
    }

    /**
     * Implements a sale.  If there are items in stock and
     * the deposited amount is greater than or equal to
     * the single item price, then adjusts the stock
     * and calculates and sets change and returns true;
     * otherwise refunds the whole deposit (moves it into
     * change) and returns false.
     * @return true for a successful sale, false otherwise (boolean)
     */
  public boolean makeSale()
    {
    if(stock > 0 && deposit >= price) {
      stock = stock - 1;
      deposit = deposit - price;
      return true;
    }
    else{
      
    }

    /**
     * Returns and zeroes out the amount of change (from
     * the last sale or refund).
     * @return number of cents in the current change (int)
     */
//  ... getChange ...
//    {
//    ...
//    }
}
