package com.ofs.my_first_app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/profile")
public class ProfileController {

	// import org.springframework.http.MediaType
	@PostMapping(path = "/store", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> storeProfile(@RequestBody Profile obj) {
		return ResponseEntity.status(201).body(obj);
	}
	
	@GetMapping(path = "/test")
	public ResponseEntity<Object> greet() {
		Map<String, String> map = new HashMap<>();
		map.put("message", "Welcome to Webservice");
		return ResponseEntity.status(200).body(map);
	}
	// if path parameter name and method parameter name's are same then no need to mention parameter name in @PathVariable
	@GetMapping(path = "/{id}/{name}")
	public ResponseEntity<Object> updateProfileNameById(@PathVariable int id, @PathVariable("name") String name) {
		// service layer logic must be called - which we are not writing
		String message = "Hello "+name+", your id is "+id+", HTTP GET";
		return ResponseEntity.status(201).body(message); // 201 status is used when its success and created some resource
	}
	@PostMapping(path = "/{id}/{name}")
	public ResponseEntity<Object> updateProfileNameById2(@PathVariable int id, @PathVariable("name") String name) {
		// service layer logic must be called - which we are not writing
		String message = "Hello "+name+", your id is "+id+", HTTP POST";
		return ResponseEntity.status(201).body(message); // 201 status is used when its success and created some resource
	}
	
}
