package interator;

public class ArrayCollection extends Collection{
    private  int[] arr = {1,2,3,4};
    public int getItem(int i){
        return arr[i];
    }
    public int count(){
        return arr.length;

    }

    @Override
    Iterator createItertor() {
        return new ArrayInterator(this);
    }
}
