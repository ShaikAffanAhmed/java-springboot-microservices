package com.app.globalResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalResponseEntity <T>{
	
	private int statusCode;
	
	private String message;
	
	private T data;
}
