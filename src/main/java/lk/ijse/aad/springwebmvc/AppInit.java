package lk.ijse.aad.springwebmvc;

import lk.ijse.aad.springwebmvc.config.WebAppRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    //config 1
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                WebAppRootConfig.class
        };
    }
    //config 2
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebAppRootConfig.class
        };
    }


    //Dispatcher
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}


//complete eken pennanne Application Context eka