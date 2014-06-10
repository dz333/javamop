package javamop.util;

public class Pair<A, B>{
    private A left;
    private B right;
    
    public Pair(A a, B b){
        this.left = a;
        this.right = b;
    }
    
    public A getLeft() {
        return left;
    }
    
    public B getRight() {
        return right;
    }
}
