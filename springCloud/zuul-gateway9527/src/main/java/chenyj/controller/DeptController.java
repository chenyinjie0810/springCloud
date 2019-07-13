package chenyj.controller;

import com.chenyj.pojo.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 21:48
 * 陈银杰专属测试
 */
@RestController
public class DeptController {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dept/getDept/{id}")
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod  ="processHystrix_Get" )
    public String getDept(@PathVariable("id") Long id){
        System.out.println("当前端口：8004");
        Dept dept=new Dept(id, "陈银杰", "cloud8004");
        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dept.toString();
    }


    public String processHystrix_Get(@PathVariable("id") Long id)
    {
        return new Dept().setId(id).setLastName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL").toString();
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> stringList=discoveryClient.getServices();
        logger.info("stringList===》"+stringList);
        List<ServiceInstance> list= discoveryClient.getInstances("provider-user");
        for (ServiceInstance value:list){
            logger.info(value.getServiceId()+"\t"+value.getHost()+"\t"+value.getPort()+"\t"+value.getUri());
        }
        return this.discoveryClient;
    }
}
