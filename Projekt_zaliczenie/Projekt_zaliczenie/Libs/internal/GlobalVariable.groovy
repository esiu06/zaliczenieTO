package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile demobank.dev : Adres www Demobank</p>
     */
    public static Object url
     
    /**
     * <p>Profile demobank.dev : Nazwa u&#380;ytkownika</p>
     */
    public static Object user_id
     
    /**
     * <p>Profile demobank.dev : Has&#322;o u&#380;ytkownika</p>
     */
    public static Object password
     
    /**
     * <p>Profile demobank.dev : Nr konta</p>
     */
    public static Object nr_konta
     
    /**
     * <p>Profile demobank.dev : Kwota przelewu</p>
     */
    public static Object kwota
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            url = selectedVariables['url']
            user_id = selectedVariables['user_id']
            password = selectedVariables['password']
            nr_konta = selectedVariables['nr_konta']
            kwota = selectedVariables['kwota']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
