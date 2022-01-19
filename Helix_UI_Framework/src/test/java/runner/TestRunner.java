package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="D://Helix_Workspaces//Helix_UI_Framework//src//test//resources//features//AdminTools.feature", 
				 glue = {"stepDefinitions","ApplicationBasePage"}, tags = "")

public class TestRunner{
	
	


	//git commit 2

	//git commit 3
}
