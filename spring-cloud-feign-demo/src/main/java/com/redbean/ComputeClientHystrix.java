package com.redbean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by GL on 2017/5/4.
 */
@Component
public class ComputeClientHystrix implements ComputeClient {


  @Override
  public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
    return -9999;
  }
}
