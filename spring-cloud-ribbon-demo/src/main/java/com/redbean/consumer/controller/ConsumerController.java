package com.redbean.consumer.controller;

import com.redbean.consumer.service.ComputeService;

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
  ComputeService computeService;

  @RequestMapping("/add")
  public String add(){
    return this.computeService.addService();
  }

}
