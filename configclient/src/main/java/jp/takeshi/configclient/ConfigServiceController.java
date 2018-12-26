package jp.takeshi.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class ConfigServiceController {
    
    @Value("${system.name}")
    private String name;

    @Value("${system.file}")
    private String file;
    
    @GetMapping("/test")
    public String[] getConfigs() {
	return new String[] {
		this.name, 
		this.file
	};
    }

}
