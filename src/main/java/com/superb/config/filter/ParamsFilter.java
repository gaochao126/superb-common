package com.superb.config.filter;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.*;
import java.io.IOException;

public class ParamsFilter implements Filter {



    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Execute cost="+(System.currentTimeMillis()-start));
    }

    @Override
    public void destroy() {
        System.out.println("destroy:========");
    }
}
