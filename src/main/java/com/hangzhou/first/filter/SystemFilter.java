package com.hangzhou.first.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class SystemFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(SystemFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        /*logger.info("--------init--------");*/
    }

    @Override
    public void destroy() {
        /*logger.info("--------destroy--------");*/
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*logger.info("" + servletRequest.getLocalAddr()+ ":" + servletRequest.getServerPort());*/
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
