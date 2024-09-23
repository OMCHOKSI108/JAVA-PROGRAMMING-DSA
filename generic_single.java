 class Solution<T> {
    T data; 
    public Solution(T data) {
        this.data = data;
    }
 
    public T getData() {
        return data;
    }

     public void setData(T data) {
        this.data = data;
    }
}

public class generic_single {
    public static void main(String[] args) {
         
        Solution<Integer> intSolution = new Solution<>(100);
        System.out.println("Integer data: " + intSolution.getData());
 
        Solution<String> strSolution = new Solution<>("Hello Generics");
        System.out.println("String data: " + strSolution.getData());
    }
}
