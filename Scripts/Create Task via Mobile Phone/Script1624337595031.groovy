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
	
	//5.Click plus icon
	Mobile.tap(findTestObject('Object Repository/android.widget.fab"'), 0 )

	//6.Click 'e.g. Portuguese class every weekday'
	WebUI.delay(500);
	Mobile.tap(findTestObject('Object Repository/android.widget.message"'), 0 )
	
	//7.Type Task 1 in e.g. Portuguese class every weekday'
	WebUI.delay(500);
	Mobile.setText(findTestObject('Object Repository/android.widget.message"'),'Task 1', 0 )
	
	//8. Click Add 
	WebUI.delay(500);
	Mobile.tap(findTestObject('Object Repository/android.widget.button1"'), 0 )
	
	//9. Click Task 1
	WebUI.delay(500);
	Mobile.tap(findTestObject('Object Repository/android.widget.TextView[@text]"'),'Task 1', 0 )
	
	//10. Click Inbox to view created task
	WebUI.delay(500);
	Mobile.tap(findTestObject('Object Repository/android.widget.item_parent'), 0 )

	Mobile.closeApplication()

