//Sohan Chatterjee
//SSw 345
//Keyboard for Visitor Pattern
//April 25, 2023
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}