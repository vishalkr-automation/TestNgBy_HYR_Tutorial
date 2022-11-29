package package14;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListnerClass extends BaseClass implements ITestListener {

	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		captureScreenShot(result.getMethod().getMethodName());
	}

}
