package org.vik.spi.service.impl;

import org.vik.spi.service.RuleExecutor;

import java.util.Map;

public class WSIRuleExecutor implements RuleExecutor {

    public Map<String, String> execute(Map<String, String> input) {
        input.put("WSI", "3");
        return input;
    }
}
