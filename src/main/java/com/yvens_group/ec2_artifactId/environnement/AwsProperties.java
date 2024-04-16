package com.yvens_group.ec2_artifactId.environnement;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.aws")
public class AwsProperties {
  
  private String docker_secret;
  private String docker_secret_2;
  
  public String getDocker_secret() {
    return docker_secret;
  }
  public void setDocker_secret(String docker_secret) {
    this.docker_secret = docker_secret;
  }
  public String getDocker_secret_2() {
    return docker_secret_2;
  }
  public void setDocker_secret_2(String docker_secret_2) {
    this.docker_secret_2 = docker_secret_2;
  }

  
}
