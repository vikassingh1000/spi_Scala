package org.vik.spi.service.impl;

import org.vik.spi.service.RuleExecutor;

import java.util.Map;

public class RIRuleExecutor implements RuleExecutor {

    @Override
    public Map<String, String> execute(Map<String, String> input) {
        input.put("RI", "1");
        return input;
    }
}
