package com.hundsun;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hundsun.domin.Person;


@Controller
public class HelloWorldController {
	@RequestMapping("/byZero")
	public int byZero (){
		return 100/0;
	}

	@ResponseBody
	@RequestMapping("/")
	public String helloWrold() {
		return "Hello Wrold";
	}

	@RequestMapping("/test")
	public String test() {

		return "test";
	}

	@ResponseBody
	@RequestMapping("/getFastJson")
	public String getFastJson() {
		List<Person> list = Person.findAll();
		Map<String, Person> map = new HashMap<>();
		for (Person p : list) {
			map.put(String.valueOf(p.getId()), p);
		}
		return JSONObject.toJSONString(map);
	}
}
