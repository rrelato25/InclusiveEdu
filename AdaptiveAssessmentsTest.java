package com.inclusiveedu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AdaptiveAssessmentsTest {

    @Autowired
    private AdaptiveAssessments adaptiveAssessments;

    @Test
    public void testGetAssessments() {
        List<String> assessments = adaptiveAssessments.getAssessments();
        assertEquals(3, assessments.size());
    }
}