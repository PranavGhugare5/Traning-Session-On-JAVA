public class User_Defined_Dunction {
    public static void main(String[] args) {
        System.out.println("Hello World");
        add();
        User_Defined_Dunction d = new User_Defined_Dunction();
        d.sub();
        int x= d.div();
    }
    public static void add(){
        int a = 1;
        int b = 2;
        int c =a+b ;
        System.out.println("Addition"+c);
    }
    public  void sub(){
        int a = 1;
        int b = 2;
        int c =a-b ;
        System.out.println("Subtraction"+c);
    }
    public int div(){
        int a = 1;
        int b = 2;
        int c =a/b ;
        System.out.println("Division"+c);
     return c;}

}
