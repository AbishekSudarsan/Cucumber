package ScenarioOutline;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolyTester {
@Given ("I am a {word} tester")
public void a(String a1) {
	System.out.println("I am a " +a1+ " tester");
}
@When("I go to work")
public void b() {
	System.out.println("I go to work");
}
@Then("I {word} test")
public void c(String a1) {
	System.out.println("I "+a1+ " test");
}

@And("My boss {word} me")
public void d(String a1) {
	System.out.println("My boss "+a1+" me");
}

@But("The developer {word} me")
public void e(String a1) { 
	System.out.println("The developer "+a1+" me");
}
}
