package ejercicio1;

import org.xml.sax.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class LeerPeliculas extends DefaultHandler {
	
	private StringBuilder value;
	public LeerPeliculas() {
		this.value = new StringBuilder();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes)
			throws SAXException {
		this.value.setLength(0);
		
	}
	
	public void characters(char ch[], int start, int length)
            throws SAXException {
 
        this.value.append(ch, start, length);
    }
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch (qName) {
		case "Pelicula":
            System.out.println("");
            break;
        case "Titulo":
            System.out.println("Titulo: " + this.value.toString());
            break;
        case "Duracion":
            System.out.println("Duracion: " + this.value.toString());
            break;
        case "Genero":
            System.out.println("Genero: " + this.value.toString());
            break;
        case "Sinopsis":
            System.out.println("Sinopsis: " + this.value.toString());
            break;
        case "Actor":
            System.out.println("Actor: " + this.value.toString());
            break;
        case "Fecha":
           if(this.value.toString().equals("0")) {
        	   System.out.println("Fecha: No especificada");
           } else {
        	   System.out.println("Fecha: " + this.value.toString());
           }
            break;
		}
	}
	
	
	
}
