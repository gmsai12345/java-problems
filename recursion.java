public class recursion {
    public void recursion(int arr[],int size,int i,int val){
        if(size-1 == i)
        {
            System.out.println(size-1);
        }
        else if(arr[size-1] == val){
            size = i;
            
        }
        else{
            recursion(arr,--size,i,val);
        }
        
    }
}