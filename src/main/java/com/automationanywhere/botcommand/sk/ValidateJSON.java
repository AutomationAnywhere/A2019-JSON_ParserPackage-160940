
package com.automationanywhere.botcommand.sk;



import static com.automationanywhere.commandsdk.model.AttributeType.TEXT;
import static com.automationanywhere.commandsdk.model.DataType.STRING;

import com.automationanywhere.botcommand.data.impl.BooleanValue;
import com.automationanywhere.commandsdk.annotations.BotCommand;
import com.automationanywhere.commandsdk.annotations.CommandPkg;
import com.automationanywhere.commandsdk.annotations.Idx;
import com.automationanywhere.commandsdk.annotations.Pkg;
import com.automationanywhere.commandsdk.annotations.rules.NotEmpty;
import com.automationanywhere.commandsdk.model.DataType;
import com.automationanywhere.commandsdk.annotations.Execute;


/**
 * @author Stefan Karsten
 *
 */

@BotCommand
@CommandPkg(label = "Validate JSON", name = "jsonvalidate",
        description = "Check if string is a valid JSON string",
        node_label = "Validate JSON", icon = "pkg.svg", comment = true ,  text_color = "#76aea8" , background_color =  "#76aea8" ,
        return_type=DataType.BOOLEAN, return_label="Result", return_required=true)
public class ValidateJSON {
	   
	@Execute
    public BooleanValue  action(@Idx(index = "1", type = TEXT)  @Pkg(label = "JSON String" , default_value_type = STRING) @NotEmpty String jsonstring 
    							   )throws Exception
     {
		
		JSONUtils parser = new JSONUtils();
		
		BooleanValue valid = parser.validateJSON(jsonstring);
		
		return valid;
	}

		
	
}