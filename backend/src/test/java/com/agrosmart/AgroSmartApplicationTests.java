package com.agrosmart;

import com.google.cloud.firestore.Firestore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
public class AgroSmartApplicationTests {

    @MockitoBean
    private Firestore firestore;

    @Test
    public void contextLoads() {
        // Verifies Spring ApplicationContext boots successfully
    }
}
