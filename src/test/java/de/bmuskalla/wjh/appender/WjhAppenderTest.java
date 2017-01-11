package de.bmuskalla.wjh.appender;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import org.junit.BeforeClass;
import org.junit.Test;

public class WjhAppenderTest {

	@BeforeClass
	public static void setUpLog4J() {
		ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();
		builder.setStatusLevel(Level.ERROR);
		builder.add(builder.newAppender("test", "wjh"));
		builder.add(builder.newRootLogger(Level.ERROR).add(builder.newAppenderRef("test")));
		Configurator.initialize(builder.build());
	}
	
	@Test
	public void getLogger() throws Exception {
		LogManager.getLogger(WjhAppender.class);
	}
}
