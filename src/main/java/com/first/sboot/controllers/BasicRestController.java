package com.first.sboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.first.sboot.domain.Contact;

//curl http://localhost:8080/contacts
@RestController
@RequestMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
public class BasicRestController {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Contact> getAll(){
		
		Contact c1 = new Contact();
		c1.setId(1L);
		c1.setName("Fred");
		c1.setEmail("fred@gmail.com");
		c1.setPhone("1234567890");
		
		Contact c2 = new Contact();
		c2.setId(2L);
		c2.setName("Bob");
		c2.setEmail("bob@gmail.com");
		c2.setPhone("0987654321");
		
		List<Contact> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		
		return list;
		
	}
	
	//curl http://localhost:8080/contacts/234
	@RequestMapping(value="/{id}")
	public Contact get(@PathVariable Long id ){
		
		Contact c = new Contact();
		c.setId(id);
		c.setName("Foo");
		c.setEmail("foo@gmail.com");
		c.setPhone("0987654321");
		
		return c;
	}
	
	//curl -H "Content-Type: application/json" -X POST -d @result.txt http://localhost:8080/contacts
	//file result.txt = {"id":42424,"name":"Foo","email":"foo@gmail.com","phone":"0987654321"}
	@RequestMapping(method=RequestMethod.POST )
	public Contact create(@RequestBody Contact contact){
		
		
		return contact;
	}
	
	//curl -H "Content-Type: application/json" -X PUT -d @result.txt http://localhost:8080/contacts/234
	//file result.txt = {"id":42424,"name":"Foo","email":"foo@gmail.com","phone":"0987654321"}
	@RequestMapping(value="/{id}",  method=RequestMethod.PUT)
	public Contact update(@PathVariable Long id, @RequestBody Contact contact){
		
		contact.setName(contact.getName() + "1");
		
		return contact;
	}
	
	//curl -X DELETE http://localhost:8080/contacts/234
	@RequestMapping(value="/{id}",  method=RequestMethod.DELETE)
	public Contact update(@PathVariable Long id){
		
		Contact c = new Contact();
		c.setId(id);
		c.setName("Foo");
		c.setEmail("foo@gmail.com");
		c.setPhone("0987654321");
		
		return c;
	}

}
