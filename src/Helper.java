class A{
    int x ;
    int b ;
    public int getX() {
        return x;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public void setX(int x) {
        this.x = x;
    }
}

public class Helper{
    public static void main(){
        System.out.println("Helper");
        A a = new A();
        a.setX(10);
        a.setB(20);

    }
}
