package com.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class MyController {
	
	
	@GetMapping("/hello")
	public ResponseEntity<?> getHello(){
		return ResponseEntity.ok("Hello ! endpoint called.. ");
	}
	
	
	@GetMapping("/")
	public ResponseEntity<?> getIndexPage(){
		return ResponseEntity.ok("Hello ! Index Page Called");
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<?> getName(@PathVariable(name = "its Working ",required = false) String name){
		return ResponseEntity.ok("Hello !"+name +" :)");
	}

}

