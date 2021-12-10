package fico.unimatic.springcloudsleuth2072;

import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    /**
     * SleuthAnnotationUtils#findAnnotation(...) will successfully find the NewSpan annotation for this method,
     * but because it is not public, it will catch and log a NoSuchMethodException when it checks for @ContinueSpan.
     */
    @NewSpan("service-method")
    protected String test() {
        return "result";
    }
}
