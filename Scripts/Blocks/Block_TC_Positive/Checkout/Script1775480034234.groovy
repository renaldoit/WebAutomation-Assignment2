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

WebUI.click(findTestObject('Object Repository/Page Automation Practice Site/ToolbarShop'))

WebUI.click(findTestObject('Object Repository/Page Products Automation Practice Site/Add to basket'))

WebUI.click(findTestObject('Object Repository/Page Products Automation Practice Site/Add to basket_1'))

WebUI.click(findTestObject('Object Repository/Page Products Automation Practice Site/Toolbar_shop 2 item'))

WebUI.click(findTestObject('Object Repository/PageBasketAutomationPracticeSite/List Product_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingfirstname'), 'asdsad')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillinglastname'), 'asdasd')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputCompanyNamebillingcompany'), 
    'asdasdsad')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingemail'), 'asdasd@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingphone'), '08123123123123')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingaddress1'), 'test')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingaddress2'), 'test')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingcity'), 'test')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingpostcode'), '123123123213123')

WebUI.click(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputPayPalExpressCheckoutplaceorder'))

WebUI.verifyElementText(findTestObject('Object Repository/Page Checkout Automation Practice Site/LabelThank you. Your order has been received'), 
    'Thank you. Your order has been received.')

