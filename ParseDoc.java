package application;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Parse {

   public static void main(String[] args) {

      try {
         File inputFile = new File("curriculo.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Elemento raiz :" + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("POS-DOUTORADO");
         System.out.println("---Pos-Doutorado---");
         if(nList.getLength() == 0) {
        	 System.out.println("Não possui pós-doutorado");
         }
           
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
