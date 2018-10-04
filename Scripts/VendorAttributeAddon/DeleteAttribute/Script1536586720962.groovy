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

WebUI.navigateToUrl('http://46.101.72.110/admin_stage/admin/index/index/key/6179d2611c845079ec2ae3e70da4e0efdabf7e6cb1d29321cea6461333372126/')

WebUI.setText(findTestObject('Page_Magento Admin/input_Username_loginusername (1)'), 'adminStage2')

WebUI.setEncryptedText(findTestObject('Page_Magento Admin/input_Password_loginpassword (1)'), 'o/jRBTHHC5MhWaNKJm55gg==')

WebUI.click(findTestObject('Page_Magento Admin/button_Sign in'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Dashboard  Magento Admin/a_Marketplace'))

WebUI.delay(3)

WebUI.scrollToPosition(150, 60)

WebUI.click(findTestObject('Page_Dashboard  Magento Admin/a_Vendor Attributes'))

WebUI.setText(findTestObject('Page_Manage Vendor Attributes  Mana/input_Step Number_attribute_co (1)'), 'testattrib125')

WebUI.click(findTestObject('Page_Manage Vendor Attributes  Mana/button_Search (1)'))

WebUI.verifyElementPresent(findTestObject('Page_Manage Vendor Attributes  Mana/div_1 (1)'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Manage Vendor Attributes  Mana/td_testattrib125 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_testattrib125  Product Attribu/button_Delete Attribute'))

WebUI.delay(3)

WebUI.focus(findTestObject('Page_testattrib125  Product Attribu/button_OK'))

WebUI.click(findTestObject('Page_testattrib125  Product Attribu/button_OK'))

WebUI.closeBrowser()


