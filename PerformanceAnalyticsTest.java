package com.inclusiveedu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PerformanceAnalyticsTest {

    @Autowired
    private PerformanceAnalytics performanceAnalytics;

    @Test
    public void testGetPerformanceAnalytics() {
        List<String> analytics = performanceAnalytics.getPerformanceAnalytics();
        assertEquals(3, analytics.size());
    }
}