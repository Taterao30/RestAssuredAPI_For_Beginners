package Data_Driven_Testing;


public class Test {

    public static void main(String[] args) {

    	SingletonClassInJava data = SingletonClassInJava.getInstance();

        System.out.println(data.getBrowser());
    }
}