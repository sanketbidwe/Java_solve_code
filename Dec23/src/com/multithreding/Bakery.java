package com.multithreding;

public class Bakery {
    private int goodsAvailable;
    private final int MAX_GOODS_PER_DAY = 30;
    private int goodsProducedToday;

    public synchronized void bakeGoods() throws InterruptedException
    {
        while (goodsAvailable > 0)
        {
            wait();
        }
        if (goodsProducedToday < MAX_GOODS_PER_DAY)
        {
            goodsAvailable = 10;
            goodsProducedToday += goodsAvailable;
            System.out.println("Baker bake 10 goods, Total produced :" + goodsProducedToday);
            notifyAll();
        }
        
    }

    public synchronized void buyGoods(String customerName) throws InterruptedException
    {
        if (goodsAvailable == 0)
        {
            wait();
        }
        goodsAvailable--;

        System.out.println(customerName + " purchased a good, Goods left :" + goodsAvailable);

        if (goodsAvailable == 0)
        {
            notifyAll();
        }
    }

    public boolean isProductionFinished()
    {
    //	if(MAX_GOODS_PER_DAY<=20) {
    		 return goodsProducedToday >= MAX_GOODS_PER_DAY && goodsAvailable == 0;

    	//}
      // return true;
    }

}




