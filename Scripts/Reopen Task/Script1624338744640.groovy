import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


	//Load the page
	WebUI.waitForPageLoad(30)
	
	//1. Contiune with email
	WebUI.delay(500);
	Mobile.tap(findTestObject('Object Repository/btn_welcome_continue_with_email'),0)
	
	//2.Set email name
	WebUI.delay(500);
	Mobile.setText(findTestObject('Object Repository/android.widget.EditText'),'Nisa Izzatul', 0 )

	//3.Set password
	WebUI.delay(500);
	Mobile.setText(findTestObject('Object Repository/android.widget.log_in_password"'),'******', 0 )
	
	//4.Click login btn
	Mobile.tap(findTestObject('Object Repository/android.widget.btn_log_in"'), 0 )
	
	//5.Click plus icon
	Mobile.tap(findTestObject('Object Repository/android.widget.fab"'), 0 )
	
	//6.Click 'e.g. Buy gift tomorrow at 6pm p1'
	Mobile.tap(findTestObject('Object Repository/android.widget.message"'), 0 )
	
	//7. Type Task 2 in 'e.g. Buy gift tomorrow at 6pm p1'
	WebUI.delay(500);
	Mobile.setText(findTestObject('Object Repository/android.widget.message"'),'Task 2', 0 )
	
	//8.Click 'Today'
	WebUI.delay(500);
	Mobile.tap(findTestObject('Object Repository/android.widget.schedule"'), 0 )
	
	//9.Click 'Today1'
	WebUI.delay(500);
	Mobile.tap(findTestObject('Object Repository/android.widget.TextView[@text]"'),'Today', 0 )
	
	//10.Click 'Add'
	WebUI.delay(500);
	Mobile.tap(findTestObject('Object Repository/android.widget.button1"'), 0 )
	
	//11.Send key event '4'
	Mobile.sendKeys(findTestObject, 'SendKeys 4')
	
	//12.Click 'Complete'
	WebUI.delay(500);
	Mobile.tap(findTestObject('Object Repository/android.widget.FrameLayout[4]//android.widget.CheckBox'), 0 )
	
	
	Mobile.closeApplication()
	
	
	
	
	