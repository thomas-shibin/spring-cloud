package com.spring.cloud.limitsservice.rest;

import com.spring.cloud.limitsservice.config.LimitsPropertyConfiguration;
import com.spring.cloud.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shibthom on 8/26/2020.
 */
@RestController
public class LimitsConfigController {

    @Autowired
    private LimitsPropertyConfiguration configuration;

    @GetMapping("/limits")
    public LimitConfiguration getLimitsConfigurations(){
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
