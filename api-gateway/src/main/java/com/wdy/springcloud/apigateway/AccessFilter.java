package com.wdy.springcloud.apigateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created on 2018/6/14 15:45
 * <p>Title:       []/p>
 * <p>Description: []</p>
 * <p>Company:     羚羊极速</p>
 *
 * @author [wudey]
 * @version 1.0
 */
public class AccessFilter extends ZuulFilter {
    Logger log = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info("send {} request to {}.", request.getMethod(), request.getRequestURI());

        String token = request.getParameter("accessToken");
        if(null == token)
        {
            log.warn("token is empty!");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            return null;
        }

        log.info("get token ok");
        return null;
    }
}
