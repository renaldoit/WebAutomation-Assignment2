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

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingfirstname'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillinglastname'), LastName)

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputCompanyNamebillingcompany'), 
    companyName)

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingemail'), Email)

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingphone'), Phone)

//WebUI.click(findTestObject('Page_Checkout  Automation Practice Site/span_India'))
//
//WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input_Country_s2id_autogen1_search'), CountryName)
//
//WebUI.click(findTestObject('Page_Checkout  Automation Practice Site/span_India'))
if (CountryName == 'Indonesia') {
    WebUI.click(findTestObject('Page_Checkout  Automation Practice Site/span_India'))

    WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input_Country_s2id_autogen1_search'), 'Indonesia')

    WebUI.click(findTestObject('Page_Checkout  Automation Practice Site/span_Indonesia' // Tidak melakukan apapun dan lanjut ke step berikutnya
            ))
} else {
    WebUI.comment('Negara bukan Indonesia, skip langkah pemilihan negara.')
}

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingaddress1'), 'test')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingaddress2'), 'test')

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingcity'), 'test')

if (CountryName == 'Indonesia') {
    WebUI.click(findTestObject('Page_Checkout  Automation Practice Site/span_Select an option'))

    WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input__s2id_autogen2_search'), 'DKI Jakarta')

    WebUI.click(findTestObject('Page_Checkout  Automation Practice Site/ul_DKI Jakarta' // Tidak melakukan apapun dan lanjut ke step berikutnya
            ))
} else {
    WebUI.comment('Negara bukan Indonesia, skip langkah pemilihan negara.')
}

WebUI.setText(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputbillingpostcode'), '123123123213123')

//WebUI.click(findTestObject('Page_Checkout  Automation Practice Site/input_Direct Bank Transfer_payment_method_cheque'))
WebUI.comment('User melakukan check Programs')

//WebUI.click(findTestObject('Page_MakeAppointment/input_Medicaid_program'))
switch (PaymentMethod) {
    case 'Direct':
        WebUI.check(findTestObject('Page_Checkout  Automation Practice Site/input__payment_method_bacs'))

        break
    case 'Check':
        WebUI.check(findTestObject('Page_Checkout  Automation Practice Site/input_Direct Bank Transfer_payment_method_cheque'))

        break
    case 'COD':
        WebUI.check(findTestObject('Page_Checkout  Automation Practice Site/input_Check Payments_payment_method_cod'))

        break
    default:
        WebUI.check(findTestObject('Page_Checkout  Automation Practice Site/input_Cash on Delivery_payment_method_ppec_paypal'))

        break
}

WebUI.click(findTestObject('Object Repository/Page Checkout Automation Practice Site/inputPayPalExpressCheckoutplaceorder'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page Checkout Automation Practice Site/LabelThank you. Your order has been received'), 
//    'Thank you. Your order has been received.')
switch (PaymentMethod) {
    case 'Direct':
        WebUI.verifyElementVisible(findTestObject('Page_Checkout  Automation Practice Site/li_Payment MethodDirect Bank Transfer'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case 'Check':
        WebUI.verifyElementVisible(findTestObject('Page_Checkout  Automation Practice Site/li_Payment MethodCheck Payments'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case 'COD':
        WebUI.verifyElementVisible(findTestObject('Page_Checkout  Automation Practice Site/li_Payment MethodCash on Delivery'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    default:
        WebUI.waitForElementVisible(findTestObject('Page_Checkout  Automation Practice Site/ul_Payment errorAn error (2) occurred while processing your PayPal payment.  Please contact the store owner for assistance'), 
            0)

        break
}

