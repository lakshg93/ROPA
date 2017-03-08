package com.mycompany.app;

import com.mycompany.app.beans.DataBean;
import com.mycompany.app.beans.TestBean;
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

/**
 * Created by dinelkag on 11/7/2016.
 */
public class ReportGenerator {

    static JasperReport jasperReport;

    public static void main(String[] args) {
        System.out.println("hello");


        try {

            String templatePath = "C:\\Users\\dinelkag\\Documents\\iReports\\sub_reports\\main_report.jasper";
            InputStream inputStream = new FileInputStream(templatePath);
            String reportPath = "D:\\report.PDF";



            List<DataBean> allDataList = new ArrayList<DataBean>();
            List reportDataList = new ArrayList();

            TestBean testBean = new TestBean();
            testBean.setName("john_1");
            testBean.setAge(23);
            reportDataList.add(testBean);

            testBean = new TestBean();
            testBean.setName("kane_1");
            testBean.setAge(43);
            reportDataList.add(testBean);

            DataBean dataBean = new DataBean();
            dataBean.setSubReport1DataList(reportDataList);
            allDataList.add(dataBean);





            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(allDataList, false);

            Map dataMap = new HashMap();
            dataMap.put("Month","May");
            dataMap.put("Index","123s");

            loadJasperTemplate(inputStream);

//            JasperReport jasperReport = JasperCompileManager.compileReport(fileName);

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,dataMap, beanColDataSource);

            JasperExportManager.exportReportToPdfFile(jasperPrint, reportPath);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public static void loadJasperTemplate(InputStream inputStream){
        try {
            jasperReport = (JasperReport) JRLoader.loadObject(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
