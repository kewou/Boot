/**
 * 
 */
package com.example.demoSpring;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * @author joel.noumia
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.example.demo.ipg.model")
public class IntegrationTestConfiguration {

	@Bean
	@Primary
	DataSource testDataSource() {
		// Par défaut on écrit en mémoire les données du batchs
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		return builder.setType(EmbeddedDatabaseType.H2).build();
	}

}
