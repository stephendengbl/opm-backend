package com.h3c.opm.opmmoduleinfra.feign;


import com.h3c.opm.opmmoduleinfra.feign.fallback.DemoFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "demo-service", url = "http://**.**.**.**",fallback = DemoFeignFallBack.class)
public interface DemoFeign {

    /**
    * 服务调用接口
    *
    * @return
    */
    @GetMapping(value = "/demo")
   public Object demo();

}
