package ApachePOI;


import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        // önce exceli açarım, sheete ulaşırım
        // işlemlerime eklerim (hafızada)
        // yazma modunda açıp, hafızadaki işlemleri kaydederim

        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);

        //HAFIZADA İŞLEMLERE DEVAM EDİYORUM
        Row yeniSatir=sheet.createRow(sheet.getPhysicalNumberOfRows());
        Cell yeniHucre=yeniSatir.createCell(0);
        yeniHucre.setCellValue("Merhaba Dünya");

        // Sıra kaydetmeye geldi, ama önce Okuma modundan çıkıp Yazma modunu açmamız lazım
        inputStream.close(); // okuma modu kapatıldı.

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream); // SAVE işlemi yapıldı

        //hafızayı boşaltmak için;
        workbook.close();
        outputStream.close();

        System.out.println("Yazma işlemi yapıldı.");


    }
}
