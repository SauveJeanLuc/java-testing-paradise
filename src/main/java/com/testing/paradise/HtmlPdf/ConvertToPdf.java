package com.testing.paradise.HtmlPdf;




import com.lowagie.text.DocumentException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



public class ConvertToPdf {

    public static Document turnHTMLToPDF(String htmlLoc) throws IOException {
        File inputHTML = new File(htmlLoc);

        Document document = Jsoup.parse(inputHTML, "UTF-8");
        document.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        return document;
    }



    public static void main(String[] args) throws IOException {
        String html = "/home/sauve/Documents/Dev-Box/Tutorials/java-testing-paradise/src/main/java/com/testing/paradise/HtmlPdf/certificate.html";
        String pdf = "/home/sauve/Documents/Dev-Box/Tutorials/java-testing-paradise/src/main/java/com/testing/paradise/HtmlPdf/certificate.pdf";

        try (FileOutputStream outputStream = new FileOutputStream(pdf)) {
            ITextRenderer renderer = new ITextRenderer();
            SharedContext sharedContext = renderer.getSharedContext();
            sharedContext.setPrint(true);
            sharedContext.setInteractive(false);
            renderer.setDocumentFromString(turnHTMLToPDF(html).html());
            renderer.layout();
            renderer.createPDF(outputStream);

            System.out.println(renderer);

        } catch (DocumentException e) {
            e.printStackTrace();
        }


    }

}
