package de.bmuskalla.wjh.appender;

import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;

@Plugin(name = "WJH", category = "Core", elementType = Appender.ELEMENT_TYPE, printObject = true)
public class WjhAppender extends AbstractAppender {

	protected WjhAppender(String name, String delegate) {
		super(name, null, null);
	}

	@PluginFactory
	public static WjhAppender createAppender(@PluginAttribute("name") String name,
			@PluginAttribute("delegateAppender") String delegateAppender) {
		return new WjhAppender(name, delegateAppender);
	}

	@Override
	public void append(LogEvent event) {
		// TODO Auto-generated method stub
	}

}
