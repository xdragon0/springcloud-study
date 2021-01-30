package com.xiaol.springcloud.service;

import com.xiaol.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value ="SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)  //这里的value对应注册中心的资源名
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id")Long id);

    @GetMapping("/dept/list")
    public List<Dept> queryA11();

    @PostMapping("/dept/add")
    public Boolean addDept(Dept dept);

}
