package abstractexample.abstractkeyword.interfacekeyword;

interface Printable {
    void print();
}

interface PrintableFormat extends Printable {
    void printPDF();
    void printWord();
    void printImage();
}


interface Showable {
    void show();
}

public class ShowDemo implements Printable, Showable, PrintableFormat {

    @Override
    public void printPDF() {

    }

    @Override
    public void printWord() {

    }

    @Override
    public void printImage() {

    }
    @Override
    public void print() {
        System.out.println("Print my page PDF , Hello");
    }

    @Override
    public void show() {
        System.out.println("Showing my page PDF , Hello");
    }

    public static void main(String[] args) {
        ShowDemo showDemo = new ShowDemo();

        showDemo.printImage(); //Width ,
        showDemo.print();
        showDemo.show();

    }


}
