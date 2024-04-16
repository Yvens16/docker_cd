package com.yvens_group.ec2_artifactId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.yvens_group.ec2_artifactId.environnement.AwsProperties;
import com.yvens_group.ec2_artifactId.environnement.DataSourceProperties;
import com.yvens_group.ec2_artifactId.environnement.OtherProperties;

@SpringBootApplication
public class Ec2ArtifactIdApplication {

	@Autowired
	private OtherProperties otherProperties;

	@Autowired
	private AwsProperties awsProperties;

	@Autowired
	private DataSourceProperties dataSourceProperties;
	

	public static void main(String[] args) {
		SpringApplication.run(Ec2ArtifactIdApplication.class, args);
	}

	@Component
	public class MyCommandLineRunner implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {
			// Your initialization logic here
			System.out.println("@@@@@@@@@@@@@@@@ : " + otherProperties.getCustomEnv() + " " + dataSourceProperties.getUsername());
			System.out.println("AWS Properties : " + awsProperties.getDocker_secret());
			System.out.println("Application started, executing initialization logic...");
		}
	}
}
