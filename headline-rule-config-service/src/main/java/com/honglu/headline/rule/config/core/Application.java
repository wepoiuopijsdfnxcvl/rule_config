package com.honglu.headline.rule.config.core;

import com.honglu.headline.common.core.redis.RedisRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.CountDownLatch;

/**
 * Spring Boot 启动类
 *
 * @author SteveGuo
 * @date 2017-12-07 3:13 PM
 */
@MapperScan(value = "com.honglu.headline.rule.config.mapper")
@SpringBootApplication(scanBasePackages = "com.honglu.headline")
public class Application {

    private static final Logger LOGGER = LogManager.getLogger(Application.class);

    @Bean
    public CountDownLatch closeLatch() {
        return new CountDownLatch(1);
    }

    @Bean
    public RedisRepository redisRepository(RedisTemplate redisTemplate) {
        return new RedisRepository(redisTemplate);
    }

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Application.class)
                .web(false)
                .run(args);

        LOGGER.info("Started the headline-rule-config-service Application of Dubbo Provider by Spring Boot !");
        CountDownLatch closeLatch = context.getBean(CountDownLatch.class);
        closeLatch.await();
    }


}
