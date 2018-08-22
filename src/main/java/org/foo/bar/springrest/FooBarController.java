package org.foo.bar.springrest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * REST controller
 * 
 * @author p454uej
 *
 */
@RestController
@RequestMapping("/foo") 
public class FooBarController {
	
	private final String SUCCESS_RESPONSE = "FOOBAR SUCCESS";
	
    @RequestMapping("/bar") 
	public  @ResponseBody ResponseEntity getServiceConfigJson(){
      	return new ResponseEntity(SUCCESS_RESPONSE);
		
	}

}
