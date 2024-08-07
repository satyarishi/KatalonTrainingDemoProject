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

WebUI.navigateToUrl('https://www.bing.com/search?pglt=163&q=email+login&cvid=9bf42d6d8f064c13b8aeec92583d2a01&gs_lcrp=EgZjaHJvbWUqBggBEAAYQDIGCAAQRRg5MgYIARAAGEAyBggCEAAYQDIGCAMQABhAMgYIBBAAGEAyBggFEAAYQDIGCAYQABhAMgYIBxAFGEAyBggIEEUYQdIBCDMxNTdqMGoxqAIIsAIB&FORM=ANNTA1&PC=U711')

WebUI.switchToWindowTitle('email login - Search')

WebUI.click(findTestObject('Object Repository/Page_email login - Search/a_Gmail'))

WebUI.switchToWindowTitle('Gmail')

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_to continue to Gmail_identifier'), 'anshitaverma1408@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/a_Learn more_WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb'))

WebUI.click(findTestObject('Object Repository/Page_Gmail Private and secure email at no c_d3ebd8/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_to continue to Gmail_identifier'), 'anshitaverma1408@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/a_Learn more'))

WebUI.closeBrowser()

