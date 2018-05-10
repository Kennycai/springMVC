package com.lr.springMVC.handlers;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lr.springMVC.entities.Address;
import com.lr.springMVC.entities.User;

@SessionAttributes("user")
@Controller
public class Test {
	
	//使用@ModelAttribute
	//有 @ModelAttribute 标记的方法, 会在每个目标方法执行之前被 SpringMVC 调用! 
	
	/**
	 * 将值放入session
	 * @SessionAttributes 除了可以通过属性名指定需要放到会话中的属性外(实际上使用的是 value 属性值),
	 * 还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中(实际上使用的是 types 属性值)
	 * 
	 * 注意: 该注解只能放在类的上面. 而不能修饰方法. 
	 */
	@RequestMapping("/testSessionMap")
	public String testSessionMap(Map<String, Object>map) {
		User user = new User(1, "cky", "123", new Address("dg"));
		map.put("user", user);
		return "success";
	}
	//通过map传值给视图
	@RequestMapping("/testMap")
	public String testMap(Map<String, Object> map){
		System.out.println(map.getClass().getName()); 
		map.put("names", Arrays.asList("Tom", "Jerry", "Mike"));
		return "success";
	}
	
	/**
	 * Spring MVC 会按请求参数名和 POJO 属性名进行自动匹配， 自动为该对象填充属性值。支持级联属性。
	 * 如：dept.deptId、dept.address.tel 等
	 */
	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println(user);
		return "success";
	}

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
