package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile automationpractice.com : Adres strony automationpractice.com</p>
     */
    public static Object url
     
    /**
     * <p>Profile automationpractice.com : Adres email u&#380;ytkownika</p>
     */
    public static Object user_mail
     
    /**
     * <p>Profile automationpractice.com : Has&#322;o u&#380;ytkownika</p>
     */
    public static Object password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            url = selectedVariables['url']
            user_mail = selectedVariables['user_mail']
            password = selectedVariables['password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
