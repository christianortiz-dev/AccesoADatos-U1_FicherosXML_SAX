package ejercicio2;

import org.xml.sax.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class LeerRSS extends DefaultHandler {
	
	private StringBuilder value;
	Boolean tituloEsTitulo = false;
	public LeerRSS() {
		this.value = new StringBuilder();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes)
			throws SAXException {
		this.value.setLength(0);
		
		if (qName == "item") {
			tituloEsTitulo = true;
		}	
		
	}
	
	public void characters(char ch[], int start, int length)
            throws SAXException {
 
        this.value.append(ch, start, length);
    }
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		
		if (tituloEsTitulo) {
			switch (qName) {
			case "item":
	            System.out.println("");
	            break;
	            
	        case "title":
	        	System.out.println("Titulo: " + this.value.toString());
	            break;
	            
	        case "pubDate":
	           if(this.value.toString().equals("0")) {
	        	   System.out.println("Fecha: No especificada");
	           } else {
	        	   System.out.println("Fecha: " + this.value.toString());
	           }
	            break;
			}
		}
		
	}
	
	
	
}
