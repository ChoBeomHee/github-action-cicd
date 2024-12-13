package resume.cicdprac.contorller;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    private final Environment environment;

    public PageController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/index")
    public String index(){
        String port = environment.getProperty("local.server.port");
        return "Second Push Currently running on port: " + port;
    }
}
