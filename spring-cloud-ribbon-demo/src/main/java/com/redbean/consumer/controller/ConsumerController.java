package com.redbean.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by GL on 2017/5/3.
 */
@RestController
public class ConsumerController {

  @Autowired
  RestTemplate restTemplate;

  @RequestMapping("/add")
  public String add(){
    return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=2",String.class).getBody();
  }

}
