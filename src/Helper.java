class A{
    int x ;

    public int getX() {
        return x;
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
        System.out.println(a.getX());

    }
}
