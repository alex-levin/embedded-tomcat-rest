package rest.config;

import org.glassfish.jersey.server.ResourceConfig;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class RestConfig extends ResourceConfig {
	public RestConfig() {
		packages("rest");
        register(JacksonJsonProvider.class);
	}
}