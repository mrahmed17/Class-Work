package testxmldemo;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class TestXMLDemo {

    public static void main(String[] args) {

        // Create factory object
        SAXParserFactory saxpf = SAXParserFactory.newInstance();
        System.out.println("Parser will " + (saxpf.isNamespaceAware() ? "" : "not ") + "be namespace aware");
        System.out.println("Parser will " + (saxpf.isValidating() ? "" : "not ") + "validate XML");
        SAXParser parser = null; // Stores parser reference
        
        try {
            parser = saxpf.newSAXParser(); // Create parser object
        } catch (ParserConfigurationException | SAXException e) {// Thrown if a parser cannot be created
            // that is consistent with the 
            e.printStackTrace(System.err); // configuration in spf
            System.exit(1);
        }
        // Thrown for any other error
        System.out.println("Parser object is: " + parser);
    }

}
