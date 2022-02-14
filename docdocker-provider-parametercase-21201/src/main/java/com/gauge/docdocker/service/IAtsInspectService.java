package com.gauge.docdocker.service;


import com.gauge.viewmodel.AtsResult;
import com.gauge.viewmodel.CoolApi;

import java.util.List;


public interface IAtsInspectService {
    public AtsResult get(String key_id) ;
    public boolean add(AtsResult ats_result) ;
    public List<AtsResult> list() ;
}
