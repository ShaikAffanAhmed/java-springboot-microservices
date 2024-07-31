package com.app.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.app.service.EmployeeService;
import com.app.service.JwtServiceImpl;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {
	
	@Autowired
	private JwtServiceImpl serviceImpl;
	@Autowired
	private EmployeeService service;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		 String authHeader=request.getHeader("Authorization");
		  String token=null;
		  String username=null;
		  if(authHeader!=null && authHeader.startsWith("Bearer "))
		  {
			  token=authHeader.substring(7);
			  username=serviceImpl.extractUsernameFromToken(token);
		  }
		  
		  
		  if (username!=null && SecurityContextHolder.getContext().getAuthentication()==null)
	        {
	            UserDetails userDetails= service.loadUserByUsername(username);
	            if (serviceImpl.validateToken(token,userDetails))
	            {
	                UsernamePasswordAuthenticationToken authenticationFilter=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
	                authenticationFilter.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	                SecurityContextHolder.getContext().setAuthentication(authenticationFilter);
	            }
	        }
	        filterChain.doFilter(request,response);
		
		
	}

}
