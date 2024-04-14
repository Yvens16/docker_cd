package com.yvens_group.ec2_artifactId.environnement;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "other")
public class OtherProperties {

  private String customEnv;

  public String getCustomEnv() {
    return customEnv;
  }

  public void setCustomEnv(String customEnv) {
    this.customEnv = customEnv;
  }

}
