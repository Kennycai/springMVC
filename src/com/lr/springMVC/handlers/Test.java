package com.lr.springMVC.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

	/**
	 *使用put，delete请求
	 *1.需要在web.xml中配置HiddenHttpMethodFilter
	 *2.网页中发送POST请求，并使用隐藏域携带name="_method",值为DELETE,PUT
	 *rest风格的URL
	 *spring中获取链接id用@PathVariable
	 **/
		@RequestMapping(value="/Test/{id}", method=RequestMethod.POST)
		public String testPost(@PathVariable Integer id) {
			System.out.println("post:" + id);
			return "success";
		}
		
		@RequestMapping(value="/Test/{id}", method=RequestMethod.GET)
		public String testGet(@PathVariable Integer id) {
			System.out.println("get:" + id);
			return "success";
		}
		
		@ResponseBody
		@RequestMapping(value="/Test/{id}", method=RequestMethod.PUT)
		public String testPUT(@PathVariable Integer id) {
			System.out.println("PUT:" + id);
			return "success";
		}
		
		@ResponseBody
		@RequestMapping(value="/Test/{id}", method=RequestMethod.DELETE)
		public String testDelete(@PathVariable Integer id) {
			System.out.println("delete:" + id);
			return "success";
		}
}
