package com.offcn.bar;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.DefaultCategoryDataset;

public class Bar1 {
	public static String getBar(HttpSession session) throws IOException{
		//准备数据集合
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		dataset.setValue(100, "北京", "苹果");
		dataset.setValue(100, "北京", "葡萄");
		dataset.setValue(100, "北京", "例子");
		dataset.setValue(100, "北京", "香蕉");
		
		//创建图标对象
		JFreeChart chart3d = ChartFactory.createBarChart3D("水果向量图", "地区", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);
		
		//利用jfreechart工具类servletutils
		String filename = ServletUtilities.saveChartAsJPEG(chart3d, 800, 600, session);
		return filename;
	}
}
