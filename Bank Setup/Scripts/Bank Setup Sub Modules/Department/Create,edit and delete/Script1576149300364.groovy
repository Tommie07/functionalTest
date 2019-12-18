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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Department/Page_Icon Login/input_WELCOME BACK_username'), 'TOMMIE')

WebUI.setEncryptedText(findTestObject('Object Repository/Department/Page_Icon Login/input_WELCOME BACK_password'), 'RlZsoEm1HLfPO8dtOqKUMA==')

WebUI.click(findTestObject('Object Repository/Department/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/a_Department'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/button_Create Department'))

WebUI.setText(findTestObject('Object Repository/Department/Page_icon-app/input_Code_ant-input'), 'TOM099')

WebUI.setText(findTestObject('department spy/Page_icon-app/input_Name_ant-input'), 'TEST')

WebUI.click(findTestObject('department spy/Page_icon-app/div_group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('department spy/Page_icon-app/li_TEST_DPT_GRP'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/button_Submit'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/button_TEST_DPT_GRP_table__btn ant-btn ant-_7646cc'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/a_ Edit'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/button_Edit'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/button_TEST_DPT_GRP_table__btn ant-btn ant-_7646cc'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('Object Repository/Department/Page_icon-app/button_Yes'))

WebUI.closeBrowser()
