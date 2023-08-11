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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.actitime.com/')

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Time Tracking Software for _dce142/span_Features'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Time Tracking Software for _dce142/div_Time Tracking'))

WebUI.click(findTestObject('Object Repository/Page_Flexible Time Tracking Software/a_Start Using actiTIME'))

WebUI.setText(findTestObject('Object Repository/Page_Free Timesheet Online Trial/input__FirstName'), 'Gadiparthi')

WebUI.setText(findTestObject('Object Repository/Page_Free Timesheet Online Trial/input__LastName'), 'Nandhini')

WebUI.setText(findTestObject('Object Repository/Page_Free Timesheet Online Trial/input__Email'), 'ahamadunnisa18072002@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Free Timesheet Online Trial/input_Company_Company'), 'student')

WebUI.click(findTestObject('Object Repository/Page_Free Timesheet Online Trial/a_Lets Go'))

WebUI.setText(findTestObject('Object Repository/Page_Free Timesheet Online Trial/input_ahamadunnisa18072002gmail.com_verify-_37dbc1'), 
    '5')

WebUI.closeBrowser()

