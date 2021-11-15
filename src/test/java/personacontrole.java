package one.digitalinnovation.test.Controller;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;Import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

        @RestControllerEndpoint()
        @RequestMapping("/api/v1/people")
public class personacontrole {

            @GetMapping
            public String getbook() {
                return "api teste!";
            }

}


