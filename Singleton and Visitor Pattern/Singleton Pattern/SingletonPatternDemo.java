//Sohan Chatterjee
//SSw 345
//Singleton Pattern Demo
//April 25, 2023
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
