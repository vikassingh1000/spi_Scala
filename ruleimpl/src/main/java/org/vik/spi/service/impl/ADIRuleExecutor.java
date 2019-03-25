package org.vik.spi.service.impl;

import org.vik.spi.service.RuleExecutor;

import java.util.Map;

public class ADIRuleExecutor implements RuleExecutor {

    public Map<String, String> execute(Map<String, String> input) {
        input.put("ADI", "1");
        input.put("SER", "2");
        input.put("SEQ", "3");

        return input;
    }
}
