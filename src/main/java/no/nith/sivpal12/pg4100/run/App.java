package no.nith.sivpal12.pg4100.run;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Source: http://kielczewski.eu/2013/11/using-embedded-jetty-spring-mvc/
 */

public class App {
    private static final Logger LOG = LogManager.getLogger();

    private static final String CONTEXT_PATH = "/";
    private static final String CONFIG_PACKAGE_LOCATION = "no.nith.sivpal12.pg4100.spring.config";
    private static final String MAPPING_URL = "/";

    private App(){
    }

    public static void main(String[] args) throws Exception {
        LOG.info("Starting server");
        Server server = new Server(8080);
        server.setHandler(getServletContextHandler(getContext()));
        server.start();
        LOG.info("Server started");
        server.join();
    }

    private static WebAppContext getServletContextHandler(WebApplicationContext context) throws IOException {
        WebAppContext contextHandler = new WebAppContext();
        contextHandler.setErrorHandler(null);
        contextHandler.setContextPath(CONTEXT_PATH);
        contextHandler.addServlet(new ServletHolder(new DispatcherServlet(context)), MAPPING_URL);
        contextHandler.addEventListener(new ContextLoaderListener(context));
        contextHandler.setResourceBase(new ClassPathResource("webapp").getURI().toString());
        LOG.info("Context handler initialized");
        return contextHandler;
    }

    private static WebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation(CONFIG_PACKAGE_LOCATION);
        LOG.info("Context initialized");
        return context;
    }

}
