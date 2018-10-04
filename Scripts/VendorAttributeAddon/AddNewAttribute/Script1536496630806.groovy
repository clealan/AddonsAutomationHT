import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://46.101.72.110/admin_stage/admin/index/index/key/83f348aef1ab1267025c4f6ebf479c17e1de9cd81a89bb9a3a50f6ae7f861365/')

WebUI.setText(findTestObject('Page_Magento Admin/input_Username_loginusername'), 'adminStage2')

WebUI.setEncryptedText(findTestObject('Page_Magento Admin/input_Password_loginpassword'), 'o/jRBTHHC5MhWaNKJm55gg==')

WebUI.click(findTestObject('Page_Magento Admin/span_Sign in'))

WebUI.click(findTestObject('Page_Dashboard  Magento Admin/a_Marketplace'))

WebUI.delay(3)

WebUI.scrollToPosition(150, 60)

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Magento Admin/a_Vendor Attributes'))

WebUI.delay(1)


WebUI.click(findTestObject('Page_Manage Vendor Attributes  Mana/button_Add New Attribute'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_New Vendor Attribute  Product/input_Default Label_frontend_l'), 'testattrib125')

WebUI.rightClick(findTestObject('Page_New Vendor Attribute  Product/input_Attribute Code_attribute'))

WebUI.setText(findTestObject('Page_New Vendor Attribute  Product/input_Attribute Code_attribute'), 'testattrib125')

WebUI.selectOptionByValue(findTestObject('Page_New Vendor Attribute  Product/select_Text FieldText AreaDate'), 'textarea', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_New Vendor Attribute  Product/select_YesNo'), '1', true)

WebUI.setText(findTestObject('Page_New Vendor Attribute  Product/textarea_Default Value_default'), 'test')

WebUI.selectOptionByValue(findTestObject('Page_New Vendor Attribute  Product/select_YesNo_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_New Vendor Attribute  Product/select_NoneDecimal NumberInteg'), 'validate-number', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_New Vendor Attribute  Product/select_YesNo_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_New Vendor Attribute  Product/select_YesNo_3'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_New Vendor Attribute  Product/select_YesNo_4'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_New Vendor Attribute  Product/select_YesNo_5'), '1', true)

WebUI.click(findTestObject('Page_New Vendor Attribute  Product/button_Save Attribute'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Page_Manage Vendor Attributes  Mana/div_You saved the vendor attri'), 0)

WebUI.closeBrowser()

