package step_definitions;

import static org.junit.Assert.*;

import cucumber.api.java.en.*;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.Scenario;
import cucumber.api.PendingException;

import java.io.ByteArrayInputStream;

import implementation.*;

public class Shared {
	
	public static void provideKeyboardInput(String s) {
        System.setIn(new ByteArrayInputStream(s.getBytes()));
	}
	
}	