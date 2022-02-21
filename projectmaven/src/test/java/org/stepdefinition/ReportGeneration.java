package org.stepdefinition;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {
	public static void jvmreports(String json) {
		File file = new File("C:\\Users\\krishna\\Documents\\krishkp06\\projectmaven\\target");
		Configuration configuration= new Configuration(file, "Adactinpage");
		configuration.addClassifications("sample", "sammple");
		
		java.util.List<String> li = new ArrayList<String>();
		li.add(json);
		ReportBuilder builder = new  ReportBuilder(li, configuration);
		builder.generateReports();
		

	}

}


