package ca.bendennerley.app;

import ca.bendennerley.utilities.NameObject;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

public class Function {

    @FunctionName("main")
    public NameObject main(
            @HttpTrigger(
                    name = "req",
                    methods = {HttpMethod.GET},
                    authLevel = AuthorizationLevel.ANONYMOUS
            )
            String req,
            ExecutionContext ctx
    ) {
        return new NameObject("Ben");
    }

}
