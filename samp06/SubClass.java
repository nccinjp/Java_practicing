package samp06;

public class SubClass extends SuperClass{
    private int b;

    public SubClass(){
        //super(); 自動的に呼び出されている
        this.b = 1;
    }

    public SubClass(int m ,int n){
        super(m);
        this.b = n;
    }

    public int getB(){
        return this.b;
    }
}
