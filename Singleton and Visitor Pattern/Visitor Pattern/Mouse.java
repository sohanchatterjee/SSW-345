//Sohan Chatterjee
//SSw 345
//Mouse for Visitor Pattern
//April 25, 2023
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}