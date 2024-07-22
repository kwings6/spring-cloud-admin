package indi.yuluo.sca.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

@EnableAdminServer
@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootAdminServerB {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootAdminServerB.class, args);
	}
}
