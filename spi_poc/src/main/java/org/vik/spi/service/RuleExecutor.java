package org.vik.spi.service;

import java.util.Map;

public interface RuleExecutor {
    Map<String, String> execute(Map<String, String> input);
}
