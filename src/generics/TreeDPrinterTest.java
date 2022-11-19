package generics;

public class TreeDPrinterTest {

    public static void main(String[] args) {

        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();

        printer.setMaterial(new Powder());

        Powder powder = printer.getMaterial();

    }
}
