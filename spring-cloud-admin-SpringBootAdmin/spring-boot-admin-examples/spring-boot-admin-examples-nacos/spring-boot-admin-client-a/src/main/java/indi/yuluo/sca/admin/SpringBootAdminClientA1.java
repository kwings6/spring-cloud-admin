package indi.yuluo.sca.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootAdminClientA1 {

	public static void main(String[] args) {

		System.setProperty("spring.profiles.active", "a1");
		SpringApplication.run(SpringBootAdminClientA1.class, args);
	}
}
