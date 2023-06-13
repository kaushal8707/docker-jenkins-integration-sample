package com.java.selfdeveloped.cloud.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationSampleApplication {
	static Logger log=LoggerFactory.getLogger(DockerJenkinsIntegrationSampleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
		log.info("My app is starting....."); 
	}

}
