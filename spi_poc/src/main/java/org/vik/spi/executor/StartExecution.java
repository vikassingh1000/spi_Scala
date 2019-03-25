package org.vik.spi.executor;

import org.vik.spi.service.RuleExecutor;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class StartExecution {

    public static void main(String[] args) {
        ServiceLoader<RuleExecutor> ruleExecutorServiceLoader = ServiceLoader.load(RuleExecutor.class);
        Map<String, String> input = new HashMap<>();
        ruleExecutorServiceLoader.iterator().forEachRemaining(rule -> {
            rule.execute(input);
        });
        input.forEach((key, val) -> {
            System.out.println(key + "=" + val);
        });
    }
}
