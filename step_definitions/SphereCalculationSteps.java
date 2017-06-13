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

public class SphereCalculationSteps {
	
	private static final PrintStream ORIGINAL_OUT = System.out;
	private static final ByteArrayOutputStream OUT_CONTENT = new ByteArrayOutputStream();	

	
    @Before
    public void beforeCallingScenario() {
    }

	
    @After
    public void afterRunningScenario(Scenario scenario) {
		System.setOut(ORIGINAL_OUT);
    }

	
	@Then("^when the program VolumeSphere is run$")
	public void whenTheProgramEstimate_PrismIsRun() throws Throwable {
		System.setOut(new PrintStream(OUT_CONTENT, true));
		
		VolumeSphere.main(null);
	}
	
	
    @Given("^a sphere of radius (\\d+)$")                                              
	public void aSphereOf(double radius) throws Throwable {                              
        String s = String.format("%f%n",radius);
        Shared.provideKeyboardInput(s);                                                 
    }                                                                               
        
		
    @Then("^the total volume should be close to (\\d+)\\.(\\d+)$")                           
    public void theTotalVolumeShouldBeCloseTo(int arg1, int arg2) throws Throwable {    
		String expectedOut = String.format("%d.%d",arg1, arg2);
        assertThat(OUT_CONTENT.toString()).contains(expectedOut); 	
    }  
	
}	