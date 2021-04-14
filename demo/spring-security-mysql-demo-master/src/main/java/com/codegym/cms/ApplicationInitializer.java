package com.codegym.cms;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private  static Logger logger = LoggerFactory.getLogger(ApplicationInitializer.class);

    @Override
    protected Class<?>[] getRootConfigClasses() {
        logger.debug("call");
        return new Class[]{ApplicationConfig.class, SecurityWebApplicationInitializer.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        return new Filter[] { characterEncodingFilter};
    }
}
