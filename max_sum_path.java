class max_sum_path
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    void maxPathSum(int ar1[], int ar2[])
    {
        int c = 0;
        int m = 0;
        int s1 = 0;
        int s2 = 0;
        for(int i = 0; i < ar1.length-1;i++)
        {
            for(int j = i+1; j < ar2.length;j++)
            {
                if(ar1[i] == ar2[j])
                {
                 m = i;
                 c = j;
                }
            }
        }
        for(int l = 0; l < c+1;l++)
        {
              s1 = s1 + ar2[l];
        }
        for(int n = m+1; n < ar1.length;n++)
        {
              s2 = s2 + ar1[n];
        }
        //System.out.println(m);
         //System.out.println(s1);
         //System.out.println(s2);
           System.out.println(s1+s2);
        
    }
}