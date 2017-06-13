package step_definitions;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import cucumber.api.java.en.*;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.Scenario;
import cucumber.api.PendingException;

import implementation.*;

public class PrismCalculationSteps {

	private static final PrintStream ORIGINAL_OUT = System.out;
	private static final ByteArrayOutputStream OUT_CONTENT = new ByteArrayOutputStream();	

	
    @Before
    public void beforeCallingScenario() {
    }

	
    @After
    public void afterRunningScenario(Scenario scenario) {
		System.setOut(ORIGINAL_OUT);
    }
	
	@Then("^when the program Estimate_Prism is run$")
	public void whenTheProgramEstimate_PrismIsRun() throws Throwable {
		System.setOut(new PrintStream(OUT_CONTENT, true));
		
		Estimate_Prism.main(null);
	}
	
	@Given("^a number of spheres (\\d+), each of dimension (\\d+), (\\d+), and (\\d+)$")
	public void aNumberOfSpheresEachOfDimensionAnd(int numSpheres, int length, int width, int height) throws Throwable {
		String s = String.format("%d%n%d%n%d%n%d%n",numSpheres, length, width, height);
        Shared.provideKeyboardInput(s);                              
	}

	@Then("^the total cost to paint them should be close to (\\d+)\\.(\\d+)$")
	public void theTotalCostToPaintThemShouldBeCloseTo(int dollars, int cents) throws Throwable {
		String expectedOut = String.format("%d.%d",dollars, cents);
        assertThat(OUT_CONTENT.toString()).contains(expectedOut);
	}
	
}	