public class besttimetobuyandsell {
    public int maxProfit(int[] prices) {
        int[] less = new int[prices.length];
        int[] high = new int[prices.length];

        for(int i=0 ; i< less.length ; i++)
        {
            if( i==0 ) less[i] = prices[i];
            else{
                if(less[i-1]<prices[i])
                {
                    less[i] = less[i-1];
                }
                else{
                    less[i] = prices[i];
                }
            }
        }

         for(int i=high.length-1 ; i>=0 ; i--)
        {
            if( i==high.length-1 ) high[i] = prices[i];
            else{
                if(high[i+1]>prices[i])
                {
                    high[i] = high[i+1];
                }
                else{
                    high[i] = prices[i];
                }
            }
        }

        int ans =0 ;

        for( int i=0 ; i<prices.length-1 ; i++)
        {
            if( (high[i+1]-less[i])>ans ) ans = high[i+1]-less[i];
        }
        return ans;
    }

}
