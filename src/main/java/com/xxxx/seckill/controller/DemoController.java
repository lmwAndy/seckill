package com.xxxx.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试
 */
@Controller
@RequestMapping("/demo")
public class DemoController {


	/**
	 * 功能描述: 测试页面跳转
	 *
	 * @param:
	 * @return:
	 */
	@RequestMapping("/hello")
	public String hello(Model model){
		model.addAttribute("name","xxxx");
		return "hello";
	}

}