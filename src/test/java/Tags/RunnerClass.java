package Tags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@regression,@login"} ,
//plugin="html:target\\HtmlReport") 
plugin="json:target\\Jsonreport.json")
//plugin="junit:target\\xmlreport.xml")
public class RunnerClass {

}

