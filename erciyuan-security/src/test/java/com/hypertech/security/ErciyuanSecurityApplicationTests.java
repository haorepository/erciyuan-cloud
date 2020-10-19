package com.hypertech.security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ErciyuanSecurityApplicationTests {

    @Test
    void contextLoads() {
    }

    public void forMethod(){
        int i = 10;

        for (int j = 0; j < 100; j++) {
            if(i!=10){
                continue;
            }
            i++;
        }

        for (int j = 0; j < 100; j++) {
            if(i==10){
                i++;
            }
        }
    }

}
