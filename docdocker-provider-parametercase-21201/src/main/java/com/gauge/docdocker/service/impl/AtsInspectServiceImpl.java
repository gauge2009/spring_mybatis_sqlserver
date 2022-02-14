package com.gauge.docdocker.service.impl;

import com.gauge.docdocker.dao.IAtsInspectDAO;
import com.gauge.docdocker.dao.ICoolApiDAO;
import com.gauge.docdocker.service.IAtsInspectService;
import com.gauge.docdocker.service.ICoolApiService;
import com.gauge.viewmodel.AtsResult;
import com.gauge.viewmodel.CoolApi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AtsInspectServiceImpl implements IAtsInspectService {
    @Resource
    private IAtsInspectDAO atsInspectDAO ;
    @Override
    public AtsResult get(String key_id) {
        return this.atsInspectDAO.findById(key_id);
    }

    @Override
    public boolean add(AtsResult ats_result) {

        return this.atsInspectDAO.doCreate(ats_result);
    }

    @Override
    public List<AtsResult> list() {
        return this.atsInspectDAO.findAll();
    }

}
