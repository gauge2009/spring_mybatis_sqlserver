package com.gauge.docdocker.dao;


import com.gauge.viewmodel.AtsResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface IAtsInspectDAO {
    public boolean doCreate(AtsResult vm) ;
    public AtsResult findById(String key_id) ;
    public List<AtsResult> findAll() ;
}