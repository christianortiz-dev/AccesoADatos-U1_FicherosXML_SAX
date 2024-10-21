package ejercicio1;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
 
            SAXParser parser = factory.newSAXParser();
 
            LeerPeliculas handler = new LeerPeliculas();
            parser.parse("peliculas.xml", handler);
 
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.getMessage());
        }
	}

}
