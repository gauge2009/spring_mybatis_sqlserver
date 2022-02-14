package com.gauge.viewmodel;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class AtsResult implements Serializable {

    private String key_id ;
    private String emp_id;
    private Date ats_date;




    @Override
    public String toString() {

        return "AtsResult [key_id=" + key_id + ", emp_id=" + emp_id + ", ats_date=" + ats_date
                + "]";
    }

    public String getKey_id() {
        return key_id;
    }
    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public String getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

//    public String getCode() {
//        return code;
//    }
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getaction_name() {
//        return action_name;
//    }
//    public void setaction_name(String action_name) {
//        this.action_name = action_name;
//    }
//
//    public String getservice_name() {
//        return service_name;
//    }
//    public void setservice_name(String service_name) {
//        this.service_name = service_name;
//    }
//
//    public String getname() {
//        return name;
//    }
//    public void setname(String name) {
//        this.name = name;
//    }
//
//    public String getvalue() {
//        return value;
//    }
//    public void setvalue(String value) {
//        this.value = value;
//    }
//
//    public String getpath() {
//        return path;
//    }
//    public void setpath(String path) {
//        this.path = path;
//    }

    public Date getoperate_dt() {
        return ats_date;
    }
    public void setoperate_dt(Date operate_dt) {
        this.ats_date = operate_dt;
    }

//    public String getdev_operate_by() {
//        return dev_operate_by;
//    }
//    public void setdev_operate_by(String dev_operate_by) {
//        this.dev_operate_by = dev_operate_by;
//    }
//
//    public String gettest_operate_by() {
//        return test_operate_by;
//    }
//    public void settest_operate_by(String test_operate_by) {
//        this.test_operate_by = test_operate_by;
//    }


}
