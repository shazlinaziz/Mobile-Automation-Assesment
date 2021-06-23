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
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys


		//Upload APK File
		Mobile.startApplication('C:\\Users\\linaz\\Downloads\\APK TODOIST\\com.todoist_15.0.4-6030_minAPI21(nodpi)_apkmirror.com.apk', true)
	
		//Wait Page Load
		WebUI.waitForPageLoad(30)
		
		//1.Click 'Contiune with email'
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
	
		Mobile.closeApplication()



