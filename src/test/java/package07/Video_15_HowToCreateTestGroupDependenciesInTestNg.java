package package07;

import org.testng.annotations.Test;

public class Video_15_HowToCreateTestGroupDependenciesInTestNg {
	
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Smoke 1");
	}
	
	@Test(groups = "smoke")
	public void test2() {
		System.out.println("Smoke 2");
	}
	
	@Test(groups = "sanity")
	public void test3() {
		System.out.println("sanity 1");
	}
	
	@Test(groups = "sanity")
	public void test4() {
		System.out.println("sanity 2");
	}
	
	@Test(groups = "regression")
	public void test5() {
		System.out.println("regression 1");
	}
	
	@Test(groups = "regression")
	public void test6() {
		System.out.println("regression 2");
	}
	
	@Test(dependsOnGroups = {"smoke","sanity","regression"})
	public void test0() {
		System.out.println("Main Test");
	}

}
