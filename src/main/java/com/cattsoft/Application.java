package com.cattsoft;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序入口
 * java -jar xxxx.jar
 */
@SpringBootApplication
@ServletComponentScan
@EnableScheduling
public class Application extends SpringBootServletInitializer {

    private static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.debug("App running !!!");
    }

}

/**
 * 加载spring配置
 */
@Configuration
@ImportResource("/applicationContext.xml")
class XmlImportingConfiguration {
}