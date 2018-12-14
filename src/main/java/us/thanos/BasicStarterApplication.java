package us.thanos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"us.thanos.*"})
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// 这句被注释掉的，exclude中的内容是避免SpringBoot自动注释
//@EnableAutoConfiguration
public class BasicStarterApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(BasicStarterApplication.class);

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(BasicStarterApplication.class, args);
	}
}
