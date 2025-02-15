package com.app.service;

import java.util.Date;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Service
public class JwtServiceImpl {
	
	 private String SECRET_KEY = "556A586E3272357538782F413F4428472B4B6250655368566D5979sjkfgdjkfgndfjkgndfjklgdlgxkfgvndlxjkrg";

	 
	 
	 public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {

	        final Claims claims = getAllClaimsFromToken(token);
	        return claimsResolver.apply(claims);
	    }
	 
	 private Claims getAllClaimsFromToken(String token) {

	        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();

	    }

	
	public String extractUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	}

	 public boolean validateToken(String token, UserDetails userDetails) {
	        final String userName = extractUsernameFromToken(token);
	        return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	    }
	    private Boolean isTokenExpired(String token) {
	        final Date expiration = getExpirationDateFromToken(token);
	        return expiration.before(new Date());
	    }
	    public Date getExpirationDateFromToken(String token) {
	        return getClaimFromToken(token, Claims::getExpiration);
	    }

	    public String generateToken(String username) {
	        return Jwts.builder().setSubject(username)
	                .setIssuedAt(new Date(System.currentTimeMillis()))
	                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
	                .signWith(SignatureAlgorithm.HS512, SECRET_KEY).compact();
	    }


}
