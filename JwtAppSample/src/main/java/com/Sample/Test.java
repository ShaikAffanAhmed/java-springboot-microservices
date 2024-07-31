package com.Sample;

import com.Sample.util.JwtUtil;

import io.jsonwebtoken.Claims;

//import java.util.Base64;
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;

public class Test {

	public static void main(String[] args) {
//		String key = "NIT";
//
//		// Token Generation
//		String token = Jwts.builder().setId("A5266") // id
//				.setSubject("Ajio") // subject
//				.setIssuer("Mike") // provider
//				.setIssuedAt(new Date(System.currentTimeMillis())) // token get date
//				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(1))) // valid until?
//				.signWith(SignatureAlgorithm.HS256, // sign Alog
//						Base64.getEncoder().encode(key.getBytes())) // secretkey
//				.compact(); // String
//		System.out.println(token);
//
//		// ************Reading Token/ Parsing Token **************
//		Claims c = 
//				Jwts.parser()
//				.setSigningKey(Base64.getEncoder().encode(key.getBytes())) // secretKey
//				.parseClaimsJws(token)
//				.getBody();
//
//		System.out.println("Subject : "+ c.getSubject());
//		System.out.println("Id : " + c.getId());
//		System.out.println("Issuer : " + c.getIssuer());
//		System.out.println("IssueAt : " + c.getIssuedAt());

		
		JwtUtil util = new JwtUtil();
//		String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJBQTg4NSIsInN1YiI6Ik1pa2UiLCJpc3MiOiJKaG9uIiwiaWF0IjoxNzIxMzA4NDM4LCJleHAiOjE3MjEzMDkwMzh9.WvkfciPxFvENHn66uFU8Obp7_65wXojF2XNXCnO1rIc";
//	    util.generateToken("AA885", "Mike", "MIT");
//		System.out.println(token);

		String token = util.generateToken("AA885", "Mike", "MIT");
		System.out.println(token);

		Claims c = util.getClaims("MIT", token);
		System.out.println(c.getId());
		System.out.println(c.getSubject());
		System.out.println(c.getExpiration());
	}
}
