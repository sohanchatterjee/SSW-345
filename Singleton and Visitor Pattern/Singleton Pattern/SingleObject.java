//Sohan Chatterjee
//SSw 345
//Singleton Class Single Object
//April 25, 2023
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world.");
    }
}