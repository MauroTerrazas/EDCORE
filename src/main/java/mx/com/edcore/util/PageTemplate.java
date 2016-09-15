package mx.com.edcore.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

public class PageTemplate extends PdfPageEventHelper{
    
    private PdfTemplate total;
    private Image background;
    
    @Override
    public void onOpenDocument(PdfWriter writer, Document document) {
        total = writer.getDirectContent().createTemplate(30, 16);
    }
    
    @Override
    public void onEndPage(PdfWriter writer, Document document) {
        
        PdfPTable table_header = new PdfPTable(3);
        PdfPTable table_footer = new PdfPTable(2);
        try {
            document.add(this.background);
            table_header.setWidths(new int[]{1, 2, 1});
            table_header.setTotalWidth(600);
            table_header.setLockedWidth(true);
            PdfPCell cell = new PdfPCell(new Paragraph(""));
            cell.setFixedHeight(125);
            cell.setBorder(Rectangle.NO_BORDER);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table_header.addCell(cell);
            cell = new PdfPCell(new Paragraph(""));
            cell.setFixedHeight(125);
            cell.setBorder(Rectangle.NO_BORDER);
            cell.setVerticalAlignment(Element.ALIGN_BOTTOM);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table_header.addCell(cell);
            cell = new PdfPCell(new Paragraph(""));
            cell.setFixedHeight(125);
            cell.setBorder(Rectangle.NO_BORDER);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table_header.addCell(cell);
            table_header.writeSelectedRows(0, -1, 10, 780, writer.getDirectContent());
            
            table_footer.setTotalWidth(550);
            cell = new PdfPCell(new Paragraph(String.format("pag.%2d /", writer.getPageNumber())));
            cell.setFixedHeight(50);
            cell.setBorder(Rectangle.NO_BORDER);
            cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table_footer.addCell(cell);
            cell = new PdfPCell(Image.getInstance(total));
            cell.setBorder(Rectangle.NO_BORDER);
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            table_footer.addCell(cell);
            table_footer.writeSelectedRows(0, -1, document.leftMargin(), document.bottomMargin()-65,writer.getDirectContent());
        }
        catch(DocumentException de) {
            throw new ExceptionConverter(de);
        }
    }
    @Override
    public void onCloseDocument(PdfWriter writer, Document document) {
        ColumnText.showTextAligned(total, Element.ALIGN_LEFT, new Phrase(String.valueOf(writer.getPageNumber() - 1)) , 2, 2, 0);
    }
    public void setBackground(Image background){
        this.background = background;
    }
}
