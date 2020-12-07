//import java.awt.*;
//import java.awt.geom.Point2D;
//import java.awt.geom.Rectangle2D;
//import java.io.*;
//
//import com.spire.pdf.PdfPageBase;
//import com.spire.pdf.graphics.*;
//
//public class CreatePdfDocumentInJava {
//
//    public static void main(String[] args) throws FileNotFoundException, IOException {
//
//        //创建PdfDocument对象
//        PdfDocument doc = new PdfDocument();
//
//        //添加一页
//        PdfPageBase page = doc.getPages().add();
//
//        //标题文字
//        String title = "Java基础语法";
//
//        //创建单色画刷对象
//        PdfSolidBrush brush1 = new PdfSolidBrush(new PdfRGBColor(Color.BLUE));
//        PdfSolidBrush brush2 = new PdfSolidBrush(new PdfRGBColor(Color.BLACK));
//
//        //创建TrueType字体对象
//        PdfTrueTypeFont font1= new PdfTrueTypeFont(new Font("Arial Unicode MS",Font.PLAIN,14),true);
//        PdfTrueTypeFont font2= new PdfTrueTypeFont(new Font("Arial Unicode MS",Font.PLAIN,10),true);
//
//        //创建PdfStringFormat对象
//        PdfStringFormat format1 = new PdfStringFormat();
//        format1.setAlignment(PdfTextAlignment.Center);//设置文字居中
//
//        //使用drawString方法绘制标题文字
//        page.getCanvas().drawString(title, font1, brush1, new Point2D.Float(page.getActualBounds(true).width / 2, 0),format1);
//
//        //从txt文件读取内容到字符串
//        String body = readFileToString("C:\\Users\\Administrator\\Desktop\\bodyText.txt");
//
//        //创建PdfStringFormat对象
//        PdfStringFormat format2 = new PdfStringFormat();
//        format2.setParagraphIndent(20);//设置段首缩进
//
//        //创建Rectangle2D对象
//        Rectangle2D.Float rect = new Rectangle2D.Float(0, 30, page.getActualBounds(true).width,page.getActualBounds(true).height);
//
//        //使用drawString方法在矩形区域绘制主体文字
//        page.getCanvas().drawString(body, font2, brush2, rect,format2);
//
//        //保存到PDF文档
//        doc.saveToFile("ouput.pdf");
//    }
//
//    //自定义方法读取txt文件内容到字符串
//    private static String readFileToString(String filepath) throws FileNotFoundException, IOException {
//
//        StringBuilder sb = new StringBuilder();
//        String s ="";
//        BufferedReader br = new BufferedReader(new FileReader(filepath));
//
//        while( (s = br.readLine()) != null) {
//            sb.append(s + "\n");
//        }
//        br.close();
//        String str = sb.toString();
//        return str;
//    }
//}