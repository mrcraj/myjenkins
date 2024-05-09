package com.Mydocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping(value = "/getdocker")
	public String get() {
		return "Hi hero have done docker run";
	}

}
