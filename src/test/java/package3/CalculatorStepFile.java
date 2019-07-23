package package3;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CalculatorStepFile {
@Given ("I enter 50 in the calculator")
public void I_enter_50_in_the_calculator() {
	System.out.println("I enter 50 in the calculator");
}
@And ("I press add")
public void I_press_add() {
	System.out.println("I press add");
}
@And ("I have entered 50 in the calculator")
public void I_have_entered_50_in_the_calculator() {
	System.out.println("I have entered 50 in the calculator");
}
@And ("I press equal symbol")
public void I_press_equal_symbol() {
	System.out.println("I press equal symbol");
}
@Then ("The result should be 100 on the screen")
public void The_result_should_be_100_on_the_screen() {
	System.out.println("The result should be 100 on the screen");
}

@Given ("I enter 5 in the calculator")
public void I_enter_5_in_the_calculator() {
	System.out.println("I enter 5 in the calculator");
}
@And ("I press sub")
public void I_press_sub() {
	System.out.println("I press add");
}
@And ("I have entered 5 in the calculator")
public void I_have_entered_5_in_the_calculator() {
	System.out.println("I have entered 5 in the calculator");
}
@And ("I press equals symbol")
public void I_press_equals_symbol_() {
	System.out.println("I press equals symbol");
}
@Then ("The result should be 0 on the screen")
public void The_result_should_be_0_on_the_screen() {
	System.out.println("The result should be 0 on the screen");
}
}
