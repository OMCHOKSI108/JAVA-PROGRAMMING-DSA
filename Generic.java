import java.util.ArrayList;
 
class Store<T> {
 
    private ArrayList<T> items;
 
    public Store() {
        items = new ArrayList<>();
    }
 
    public void addItem(T itm) {
        items.add(itm);
    }
 
    public T getItem(int idx) {
        if (idx < 0 || idx >= items.size()) {
            throw new IndexOutOfBoundsException("Index out of range.");
        }
        return items.get(idx);
    }

 
    public int size() {
        int count = 0;
        for (T itm : items) {
            count++;
        }
        return count;
    }
}

public class Generic{
    public static void main(String[] args) {
   
        Store<Integer> intStore = new Store<>();
        intStore.addItem(10);
        intStore.addItem(20);
        intStore.addItem(30);

 
        Store<String> strStore = new Store<>();
        strStore.addItem("Java");
        strStore.addItem("Generics");
        strStore.addItem("Code");

   
        try {
            System.out.println("Integer Store:");
            for (int i = 0; i < intStore.size(); i++) {
                System.out.println("Item " + i + ": " + intStore.getItem(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
 
        try {
            System.out.println("String Store:");
            for (int i = 0; i < strStore.size(); i++) {
                System.out.println("Item " + i + ": " + strStore.getItem(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
