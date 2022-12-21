package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class IRCTCHooks {

	// Hooks can be written in either Step-definations class or in stand-alone Java
	// class. It can't be written in feature files
	// @Before & @After will be executed before & after to each scenario.
	// @BeforeStep & @AfterStep will be executed before & after to each steps in the
	// scenario.
	// Can write multiple @Before & @After and can declare Order
	
	@Before("@Smoke") // This hook will execute only with scenario where @Smoke tag is applied
	public void setup_UI() {
		System.out.println("********** Before SetUp : UI --> Smoke ********** ");
	}

	@Before() // This hook will execute for all scenario 
	public void setup_DB() {
		System.out.println("<<<<<<<<<< Before SetUp : DB >>>>>>>>>>");
	}
	
	/*
	 * @Before(order = 1) public void setup_UI() {
	 * System.out.println("********** Before SetUp : UI ********** "); }
	 * 
	 * @Before(order = 2) public void setup_DB() {
	 * System.out.println("\t<<<<<<<<<< Before SetUp : DB >>>>>>>>>>"); }
	 * 
	 * @After(order = 1) public void tearDown_UI() {
	 * System.out.println("**********  After TearDown : UI ********** "); }
	 * 
	 * @After(order = 2) public void tearDown_DB() {
	 * System.out.println("\t<<<<<<<<<< After TearDown : DB >>>>>>>>>> "); }
	 * 
	 * @BeforeStep() public void setup_step() {
	 * System.out.println("\t\t++++++++++ Before Each Step ++++++++++"); }
	 * 
	 * @AfterStep() public void tearDown_step() {
	 * System.out.println("\t\t++++++++++ After Each Step ++++++++++"); }
	 */
}
