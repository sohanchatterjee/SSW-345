//Sohan Chatterjee
//SSw 345
//Computer Part Visitor Interface
//April 25, 2023
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
