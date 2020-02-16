package com.example.springsocial.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestResponseLoggingFilter extends OncePerRequestFilter {
    private final static Logger logger = LoggerFactory.getLogger(RequestResponseLoggingFilter.class);
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        //logger.info("########## path {}" ,httpServletRequest.getPathInfo() );
        logger.info("===========================request begin================================================");
        logger.debug("URI         : {}", httpServletRequest.getRequestURL());
        logger.debug("Method      : {}", httpServletRequest.getMethod());
        logger.debug("QueryString     : {}", httpServletRequest.getQueryString() );
        //logger.debug("Headers     : {}", httpServletRequest.getHeaders() );
        //logger.debug("Request body: {}", new String(body, "UTF-8"));
        httpServletRequest.getSession(true);
        logger.info("==========================request end================================================");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
