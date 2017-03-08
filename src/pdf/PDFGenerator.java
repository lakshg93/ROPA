
package pdf;

import beans.RopaMemberBean;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PDFGenerator {

    static JasperReport jasperReport;

    public static void generatePDF (ArrayList<RopaMemberBean> reportDataList,String fileAddress) {
        


        try {

            String templatePath = "E:\\Projects\\ROPA\\ropaReport.jasper";
            InputStream inputStream = new FileInputStream(templatePath);
            String reportPath = fileAddress+".PDF";
             //System.out.println(reportPath);


           // ArrayList<TestBean> reportDataList = new ArrayList<TestBean>();
            //List reportDataList = new ArrayList();

//            TestBean testBean = new TestBean();
//            testBean.setName("john_1");
//            testBean.setAge(23);
            //reportDataList.add(testBean);
           // System.out.println(testBean.getAge());
            
            //   System.out.println(testBean);
//            testBean = new TestBean();
//            testBean.setName("kane_1");
//            testBean.setAge(43);
           // reportDataList.add(testBean);

          //  TestBean dataBean = new TestBean();
         //   dataBean.setSubReport1DataList(reportDataList);
         //  allDataList.add(dataBean);

          //  System.out.println(reportDataList);


            //------------
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(reportDataList, false);

            Map dataMap = new HashMap();
            try{
            dataMap.put("seniorYear",reportDataList.get(0).getSeniorYear());}
            catch (Exception e){
                System.out.println("error");
            }
            

            //------------------------
            loadJasperTemplate(inputStream);

//            JasperReport jasperReport = JasperCompileManager.compileReport(fileName);

//--------------------
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,dataMap, beanColDataSource);

            //-------------------
            JasperExportManager.exportReportToPdfFile(jasperPrint, reportPath);


        } catch (FileNotFoundException | JRException e) {
            e.printStackTrace();
            System.out.println("Error in try");
        }
    }

    public static void loadJasperTemplate(InputStream inputStream){
        try {
            jasperReport = (JasperReport) JRLoader.loadObject(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in loadjasperTemplate");
        }
    }
}
