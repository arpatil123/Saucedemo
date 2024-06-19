package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	

	@CucumberOptions (tags = "", features = {".//Resourse"},
	glue = {"StepDefiniton"},
	plugin = {"pretty", "html:target/htmlreport.html"})

	public class CucumberTestRunner  {
		
	}

