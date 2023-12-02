package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Exam\\eclipse-workspace\\SeleniumWorkspace\\Cucumber\\star-health_Phase2EndProject\\src\\test\\java\\features",
				glue= {"steps"},
				plugin= {"html:target/Cucumberreport.html",
						"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"		
})

public class StarHealthTestRunner {
	
}
