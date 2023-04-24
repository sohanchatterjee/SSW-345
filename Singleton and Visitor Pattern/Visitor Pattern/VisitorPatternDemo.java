//Sohan Chatterjee
//SSw 345
//Visitor Pattern Demo
//April 25, 2023
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
