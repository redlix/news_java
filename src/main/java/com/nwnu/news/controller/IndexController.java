package com.nwnu.news.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * index
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/11/13     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/11/13 8:40 AM
 * @since 1.0.0
 */
@Controller
@RequestMapping("/news")
@Slf4j
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/index1")
	public String index1() {
		return "index1";
	}
	@RequestMapping("/index2")
	public String index2() {
		return "index2";
	}
	@RequestMapping("/list")
	public String list(@RequestParam("type") String type) {
		if (type.equals("sina")) {
			return "sina_list.html";
		} else if (type.equals("sohu")) {
			return "sohu_list.html";
		} else if (type.equals("tianya")) {
			return "tianya_list.html";
		} else if (type.equals("sinaSearch")) {
			return "sina_search.html";
		} else if (type.equals("sohuSearch")) {
			return "sohu_search.html";
		} else if (type.equals("tianyaSearch")) {
			return "tianya_search.html";
		} else {
			return "index.html";
		}
	}
}
