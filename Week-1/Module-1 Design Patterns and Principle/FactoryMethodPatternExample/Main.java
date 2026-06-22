package FactoryMethodPatternExample;
public class Main {

    public static void main(String[] args) {

        DocumentFactory factory;

        factory = new WordFactory();
        Document doc = factory.createDocument();
        doc.open();

        factory = new PdfFactory();
        doc = factory.createDocument();
        doc.open();

        factory = new ExcelFactory();
        doc = factory.createDocument();
        doc.open();

    }

}