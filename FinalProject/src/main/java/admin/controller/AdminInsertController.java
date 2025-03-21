package admin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import admin.model.AdminBean;
import admin.model.AdminDao;

@Controller
public class AdminInsertController {

	private final String command = "insert.admin";
	private final String getPage = "adminInsert";
	private final String gotoPage = "redirect:/list.admin";
	
	@Autowired
	AdminDao adao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public ModelAndView doAction() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(getPage);
		return mav;
	}
	
	// adminInsert.jsp 에서 '추가' 누르면 이쪽으로 넘어옴
	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView doAction(@ModelAttribute("Admin") @Valid AdminBean ab, BindingResult result) {
		
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) { // 유효성체크
			mav.setViewName(getPage);
			return mav;
		}
		
		adao.insertAdmin(ab); 
		mav.setViewName(gotoPage);
		
		return mav;
	}
	
}
