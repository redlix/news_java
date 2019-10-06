package com.nwnu.news.controller;

import com.nwnu.news.service.SinaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/10/04     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/10/4 9:34 AM
 * @since 1.0.0
 */
@Controller
@RequestMapping("/news")
@Slf4j
public class NewsController {

	private final SinaService sinaService;

	public NewsController(SinaService sinaService) {
		this.sinaService = sinaService;
	}

	@RequestMapping("/index")
	public String index() {
		return "/index";
	}

	@RequestMapping("/list")
	public String list(@RequestParam("type") String type) {
		if (type.equals("sina")) {
			return "/sina_list";
		} else if (type.equals("sohu")) {
			return "/sohu_list";
		} else {
			return "/tianya_list";
		}
	}

	@PostMapping("/data")
	@ResponseBody
	public Page data(@RequestParam("type") String type, @RequestParam("pageNo") int pageNum,
					 @RequestParam("pageSize") int pageSize) {
		if (type.equals("sina")) {
			return sinaService.findAll(pageNum, pageSize);
		} else if (type.equals("sohu")) {
			return null;
		} else {
			return null;
		}
	}

//	@RequestMapping("/sina_detail_index")
//	public String sina_detail_index() {
//		return "/sina_detail";
//	}

	@RequestMapping("/sina_detail")
	public ModelAndView sina_detail(@RequestParam("id") String id) {
		log.info(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("SinaEntity", sinaService.findById(id));
		mav.setViewName("/sina_detail");
		return mav;
	}
}
