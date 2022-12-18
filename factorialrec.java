public class factorialrec{
    public int factorialrec(int n){
        if(n > 1){
            return n*factorialrec(n-1);
        }
        else{
            return 1;
        }
        
    }
}