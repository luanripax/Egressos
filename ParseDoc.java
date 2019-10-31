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
        	 System.out.println("nao possui pos doutorado");
         }
         
         /*
         for (int i = 0; i < nList.getLength(); i++) {
             Node No = nList .item(i);
             // System.out.println("\nCurrent Element :" + nNode.getNodeName());
             
             if (No.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) No;
                //eElement.getElementsByTagName("DADOS-BASICOS-DO-TRABALHO");
                if(eElement.getAttribute("NOME-INSTITUICAO") != null) {
                	System.out.println("nao possui pos doutorado");
                }
                System.out.println("Titulo : " 
                   + eElement.getAttribute("TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO"));
                System.out.println("Instituicao : " 
                        + eElement.getAttribute("NOME-INSTITUICAO"));
                System.out.println("Ano de conclusão : " 
                                + eElement.getAttribute("ANO-DE-CONCLUSAO"));
             }
          }
         	*/

         
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
