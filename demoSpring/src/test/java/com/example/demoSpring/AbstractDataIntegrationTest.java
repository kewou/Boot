/**
 * 
 */
package com.example.demoSpring;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author joel.noumia
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = IntegrationTestConfiguration.class, initializers = ConfigFileApplicationContextInitializer.class)
@SpringBootTest
@ActiveProfiles({ "test" })
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public abstract class AbstractDataIntegrationTest {

}
