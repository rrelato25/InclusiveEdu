package com.inclusiveedu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AccessibilityFeaturesTest {

    @Autowired
    private AccessibilityFeatures accessibilityFeatures;

    @Test
    public void testGetAccessibilityFeatures() {
        List<String> features = accessibilityFeatures.getAccessibilityFeatures();
        assertEquals(3, features.size());
    }
}