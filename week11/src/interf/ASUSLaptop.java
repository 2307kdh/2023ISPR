package interf;

public class ASUSLaptop extends Laptop implements USBA,USBC{
    void CType(){}

    @Override
    public String shapeA() {
        return "rectangle shape interface";
    }

    @Override
    public String shapeC() {
        return "rounded shape interface";
    }
}
