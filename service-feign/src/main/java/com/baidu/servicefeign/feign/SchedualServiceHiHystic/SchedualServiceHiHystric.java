package com.baidu.servicefeign.feign.SchedualServiceHiHystic;

import com.baidu.servicefeign.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author yuxiaoxing
 * @date 2018/4/20 13:56
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
