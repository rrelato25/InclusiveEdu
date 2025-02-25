package com.inclusiveedu;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class PerformanceAnalytics {

    public List<String> getPerformanceAnalytics() {
        return Arrays.asList(
                "Analytics 1: Weekly progress reports for students.",
                "Analytics 2: Comparative analysis of student performance.",
                "Analytics 3: Predictive analytics to identify at-risk students."
        );
    }
}