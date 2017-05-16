package com.redbean.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GL on 2017/5/3.
 */
@RestController
public class ComputeController {

  private Logger logger = LoggerFactory.getLogger(getClass());

  @Autowired
  DiscoveryClient discoveryClient;

  @RequestMapping("/add")
  public Integer add(Integer a, Integer b) {
    ServiceInstance instance = this.discoveryClient.getLocalServiceInstance();
    Integer r = a + b;
    logger.info("/add  host:" + instance.getHost() + " ,service_id:" + instance.getServiceId() +
                    ",result:" + r);
    return r;
  }


}
