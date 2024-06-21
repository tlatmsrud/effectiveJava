package effectivaJava.src.main.java.org.ssk.item69;

public class Usecase1 {

    public static void main(String[] args) {
        MyClass[] range = new MyClass[5];
        range[0] = new MyClass();
        range[1] = new MyClass();
        range[2] = new MyClass();
        range[3] = new MyClass();
        range[4] = new MyClass();

        try{
            int i = 0;
            while(true){
                range[i++].myMethod();
            }
        }catch (ArrayIndexOutOfBoundsException e){

        }
        System.out.println("종료");
    }

    static class MyClass{

        public void myMethod(){
            System.out.println("call my method");
        }
    }
}
