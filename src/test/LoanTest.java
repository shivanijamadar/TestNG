package test;

import org.testng.annotations.Test;

public class LoanTest extends BaseClass {
	
	@Test(groups= {"sanity"}, priority=1)
	public void HomeLoanTest() {
		System.out.println("Inside Home Loan Test");
	}
	
	@Test(description="Describing Personal Loan", priority=2)
	public void PersonalLoanTest() {
		System.out.println("Inside Personal Loan Test");
	}
	
	@Test(priority=0)
	public void PersonalLoanTest1() {
		System.out.println("Inside Personal Loan Test 1");
	}
}
