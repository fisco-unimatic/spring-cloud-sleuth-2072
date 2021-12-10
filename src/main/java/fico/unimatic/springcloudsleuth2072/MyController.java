package fico.unimatic.springcloudsleuth2072;

import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @NewSpan("controller-method")
    @GetMapping()
    public String test() {
        return myService.test();
    }
}
