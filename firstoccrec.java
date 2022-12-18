public class firstoccrec{
    public int firstoccrec(int arr[], int size, int i, int val){
        if(i == size){
            System.out.print("");
        }
        if(arr[i] == val)
        {
            System.out.print(i);
            i = size;
        }
        else{
            firstoccrec(arr,size,++i,val);
        }
        return;
    }
}