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
public class SpringBootAdminClientA2 {

	public static void main(String[] args) {

		System.setProperty("spring.profiles.active", "a2");
		SpringApplication.run(SpringBootAdminClientA2.class, args);
	}
}
