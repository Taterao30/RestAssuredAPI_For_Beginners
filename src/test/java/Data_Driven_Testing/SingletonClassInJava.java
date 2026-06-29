package Data_Driven_Testing;

public class SingletonClassInJava {

    // Step 1: Create a static object reference
    private static SingletonClassInJava instance;

    // Step 2: Make the constructor private
    private SingletonClassInJava() {

    }

    // Step 3: Create a public method to return the object
    public static SingletonClassInJava getInstance() {
        if (instance == null) {
            instance = new SingletonClassInJava();
        }
        return instance;
    }

    // Example method
    public String getBrowser() {
        return "Chrome";
    }

    public String getUrl() {
        return "https://www.google.com";
    }
}