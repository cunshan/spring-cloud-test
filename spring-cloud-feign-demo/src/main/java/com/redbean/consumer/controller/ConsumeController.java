package com.redbean.consumer.controller;

import com.redbean.ComputeClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GL on 2017/5/4.
 */
@RestController
public class ConsumeController {

  @Autowired
  ComputeClient computeClient;

  @RequestMapping("/add")
  public Integer add() {
    return this.computeClient.add(10, 20);
  }
}
