class Test<T,S>{
    
    T obj1;
    S obj2;
    
    Test(T obj1,S obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    
    public T getObj1(){
        return this.obj1;
    }
    public S getObj2(){
        this.obj2 = obj2;
        return this.obj2;
    }
}

public class test_generic{
    
    public static void main(String[] args){
        
        Test<Integer,String> t1 = new Test<Integer,String>(30,"Sanskruti");
        System.out.println(t1.getObj1() + " "+ t1.getObj2());
        
        Test<Integer,String>  s1 = new Test<Integer,String>(10,"OM");
        System.out.println(s1.getObj1() + " "+ s1.getObj2());
    }
}