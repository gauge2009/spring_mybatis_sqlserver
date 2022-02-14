package com.gauge.docdocker;

import com.gauge.docdocker.service.IAtsInspectService;
import com.gauge.viewmodel.AtsResult;
import com.gauge.viewmodel.CoolApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;


@SpringBootTest(classes = ParameterCaseApi_21201_StartSpringCloudApplication.class )
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class IAtsInspectServiceTest {
    @Resource
    private IAtsInspectService atsInspectService;
    @Test
    public void testGet() {

        System.out.println(this.atsInspectService.get("0175b404-f454-407b-ae16-979a6c4c9330") );
    }

    @Test
    public void testAdd() {
        AtsResult atsResult = new AtsResult() ;
        atsResult.setEmp_id("111"  );
        System.out.println(this.atsInspectService.add(atsResult));
    }

    @Test
    public void testList() {

        System.out.println(this.atsInspectService.list());
    }

}
