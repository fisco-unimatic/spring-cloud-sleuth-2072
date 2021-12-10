package fico.unimatic.springcloudsleuth2072;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpringCloudSleuth2072ApplicationTests {

    @Autowired
    private MockMvc mvc;

    /**
     * This invokes the MyController#test(), which in turn invokes MyService#test().
     * If you look at the log, you'll see a scary stack trace for a NoSuchMethodException.
     */
    @Test
    void contextLoads() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/"))
                .andExpect(status().isOk())
                .andExpect(content().string("result"));
    }

}
