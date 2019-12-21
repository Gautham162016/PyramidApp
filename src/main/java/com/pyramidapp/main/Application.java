package com.pyramidapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import com.test.controller.PyramidController;



@SpringBootApplication
@ComponentScan(basePackageClasses = PyramidController.class)
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(Application.class);

      //  springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);


        /**
         //@Override
         protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(Application.class);
         }

         public static void main(String[] args) {	
         SpringApplication.run(Application.class, args);
         }
         //**/
    }
}
