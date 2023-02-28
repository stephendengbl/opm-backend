package com.h3c.opm.opmmoduletask.feign.fallback;


import com.h3c.opm.opmmoduletask.feign.DemoFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoFeignFallBack implements DemoFeign {

    /**
    * 降级措施
    * @return
    */
    @Override
    public Object demo() {
      log.error("调用失败...");
      return null;
    }
}
