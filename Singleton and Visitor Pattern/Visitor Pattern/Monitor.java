//Sohan Chatterjee
//SSw 345
//Monitor for Visitor Pattern
//April 25, 2023
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}