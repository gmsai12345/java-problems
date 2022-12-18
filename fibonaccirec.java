public class fibonaccirec{
    public int fibonaccirec(int n){
        if (n <=1 )
        {
            return n;
        }
        else{
            return fibonaccirec(n-1) + fibonaccirec(n-2);
        }
    }
}