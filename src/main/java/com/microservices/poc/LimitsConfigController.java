package com.microservices.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {
 
  @Autowired  
  Configuration config;
	 
	
	
  @GetMapping("/limits")
  public LimitConfiguration getAllLimits() {
	  return new LimitConfiguration(1,100);
  }
  @GetMapping("/limits1")
  public LimitConfiguration getAllLimitsfromProperties() {
	  return new LimitConfiguration(config.getMin(),config.getMax());
  }
}
