package com.redbean;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by GL on 2017/5/4.
 */
@FeignClient("compute-service")
public interface ComputeClient {


  @RequestMapping("/add")
  Integer add(@RequestParam("a") Integer a, @RequestParam("b")Integer b);

}
