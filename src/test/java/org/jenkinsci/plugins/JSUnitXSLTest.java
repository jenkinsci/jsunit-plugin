package org.jenkinsci.plugins;

import hudson.plugins.jsunit.JSUnitInputMetric;
import org.junit.Test;

public class JSUnitXSLTest extends AbstractXUnitXSLTest {

    @Test
    public void testcase1() throws Exception {
        convertAndValidate(JSUnitInputMetric.class, "testcase1/input.xml", "testcase1/junit-result.xml");
    }

}
