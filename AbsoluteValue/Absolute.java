public class Absolute{

    public static int absolute_value(int x){
        if (x>=1){
            return x;
        }
        else{
            return -x;
        }
    }

    public static void main(String[] args) {
        System.out.println(Absolute.absolute_value(5));
        System.out.println(Absolute.absolute_value(-5));
        System.out.println(Absolute.absolute_value(0));
        System.out.println(Absolute.absolute_value(1));
    }
  
}

