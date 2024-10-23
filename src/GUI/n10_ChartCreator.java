package GUI;
import org.knowm.xchart.*;
import javax.swing.*;
import java.awt.*;

import java.util.List;

public class ChartCreator {

    // Tạo biểu đồ đường với các tham số đầu vào
    public static XYChart createLineChart(List<Integer> xData, List<Double> yData, 
                                          String title, String xAxisTitle, String yAxisTitle) {
        XYChart lineChart = new XYChartBuilder()
                .width(700)
                .height(600)
                .title(title)
                .xAxisTitle(xAxisTitle)
                .yAxisTitle(yAxisTitle)
                .build();
                                         
        lineChart.addSeries("Series1", xData, yData);
        
                                            
        return lineChart;
    }

    // Tạo biểu đồ nhiều cột với các tham số đầu vào
    public static CategoryChart createBarChart(List<String> xData, List<Double> yData1, 
                                               List<Double> yData2, String title, 
                                               String xAxisTitle, String yAxisTitle,String NameSeries1, String NameSeries2) {
        CategoryChart barChart = new CategoryChartBuilder()
                .width(700)
                .height(600)
                .title(title)
                .xAxisTitle(xAxisTitle)
                .yAxisTitle(yAxisTitle)
                .build();

        barChart.addSeries(NameSeries1, xData, yData1);
        barChart.addSeries(NameSeries2, xData, yData2);

        return barChart;
    }
}
