public class ArraySet <T>{
    T[] items;
    private int size;
    public int size(){
        return size;
    }

    public ArraySet(){
        items = (T[]) new Object[100];
        size = 0;
    }
    public boolean contains(T item){
        for (int i = 0; i < size ; i++) {
            if (items[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    public void add (T itm){
        if (itm == null){
            throw new IllegalArgumentException("can't add null");
        }
        if (this.contains(itm)){
            return ;
        }
        items[size] = itm;
        size++;
    }

}
