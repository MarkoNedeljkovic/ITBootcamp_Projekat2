package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import app.Calculator;

public class CalculatorTest {

	Calculator calc;
	double oldValue;

	@BeforeClass
	public void setup() {
		calc = new Calculator();
	}

	@BeforeMethod
	public void getValue() {
		oldValue = calc.getValue();
	}

	 @Test (dataProvider = "ulazneVrednosti")
	public void addTest(double value) {
		Assert.assertEquals(calc.add(value).getValue(), oldValue + value);
	}

	@Test(dataProvider = "ulazneVrednosti")
	public void divTest(double value) {
		if (value != 0) {
			Assert.assertEquals(calc.div(value).getValue(), oldValue / value);
		}

		else {
			Assert.assertEquals(calc.div(value).getValue(), oldValue);
		}
	}
	
	@Test (dataProvider = "ulazneVrednosti")
	public void setValueTest(double value) {
		Assert.assertEquals(calc.setValue(value).getValue(), value);
	}

	@DataProvider
	private Object[][] ulazneVrednosti() {

		return new Object[][] { { 10 }, { 0 }, { -5 }, { 15 } };
	}
}
