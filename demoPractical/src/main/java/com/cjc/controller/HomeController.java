package com.cjc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;

@RestController
public class HomeController {
@GetMapping("/getData")
public String data()
{
	return "hello";
}
@GetMapping("/saveData")
public void m2(@RequestBody Student stu)
{
	System.out.println(stu);
}

@PostMapping("/save")
public void m1(@RequestBody List<Student>li)
{
	for(Student stu:li)
	{
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
	}
}
@PostMapping("/{rollno}/{name}")
public void m3(@PathVariable("rollno") int rn,@PathVariable("name")String nm)
{
	System.out.println("Roll no:"+rn);
	System.out.println("Name:"+nm);

}

}
