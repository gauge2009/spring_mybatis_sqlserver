package com.gauge.docdocker.rest;

import com.gauge.docdocker.service.IAtsInspectService;

import com.gauge.viewmodel.AtsResult;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
public class AtsInspectRest {
    @Resource
    private IAtsInspectService atsInspectService;
    @Resource
    private DiscoveryClient client ;	// 进行Eureka的发现服务
    @RequestMapping("/atsinspect/discover")
    public Object discover() {	// 直接返回发现服务信息
        return this.client ;
    }

    @RequestMapping("/atsinspect/sessionId")
    public Object id(HttpServletRequest request) {

        return request.getSession().getId() ;
    }

    @RequestMapping(value="/atsinspect/get/{id}",method= RequestMethod.GET)
    public Object get(@PathVariable("key_id") String key_id) {

        return this.atsInspectService.get(key_id) ;
    }
    @RequestMapping(value="/atsinspect/add",method=RequestMethod.POST)
    public Object add(@RequestBody AtsResult ats_result) {

        return this.atsInspectService.add(ats_result) ;
    }
    @RequestMapping(value="/atsinspect/list",method=RequestMethod.GET)
    public Object list() {

        return this.atsInspectService.list() ;
    }
}
