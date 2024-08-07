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

WebUI.navigateToUrl('www.google.com')

WebUI.navigateToUrl('https://www.bing.com/ck/a?!&&p=5f1d4b59ed2e7addJmltdHM9MTcyMjQ3MDQwMCZpZ3VpZD0xMjMwZmQ3Ni1mZmE0LTZiNGMtMzkyMC1lOWQ3ZmU2ZDZhODYmaW5zaWQ9NTQ1NA&ptn=3&ver=2&hsh=3&fclid=1230fd76-ffa4-6b4c-3920-e9d7fe6d6a86&psq=www.google.com&u=a1aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS9tYXBz&ntb=1')

WebUI.delay(2)

WebUI.closeBrowser()

