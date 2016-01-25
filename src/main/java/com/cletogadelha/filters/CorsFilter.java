package com.cletogadelha.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class CorsFilter implements Filter {

	public CorsFilter() { }

	public void init(FilterConfig fConfig) throws ServletException { }

	public void destroy() {}

	public void doFilter(
		ServletRequest request, ServletResponse response, 
		FilterChain chain) throws IOException, ServletException {
		
		HttpServletResponse resp = (HttpServletResponse)response;
		resp.addHeader("Access-Control-Allow-Origin", "*");
		resp.addHeader("Access-Control-Allow-Headers", "content-type");
		resp.addHeader("Access-Control-Allow-Methods",
	               "POST, GET, DELETE, PUT, OPTIONS");
		
		chain.doFilter(request, response);
	}
}