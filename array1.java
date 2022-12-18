class array1 {
    int remove_duplicate(int A[],int N){
        int B[] = new int[N+1];
        for(int i = 0;i<N-1;i++)
        {
            for(int j = j+1; j < N-1;j++)
            {
                if(A[i] == A[j])
                {
                    A[i] = B[i];
                }
            }
        }
        for(int k = 0;k < B.length; k++ )
        {
            System.out.print(B[i] + " ");
        }
    }
}