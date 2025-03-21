package admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import admin.model.AdminBean;
import admin.model.AdminDao;

@Controller
public class AdminListController {

	private final String command = "list.admin";
	private final String getPage = "adminList";
	
	@Autowired
	AdminDao adao;
	
	@RequestMapping(command)
	public ModelAndView doAction() {
		
		ModelAndView mav = new ModelAndView();
		
		int totalCount = adao.getTotalCount();
		
		List<AdminBean> lists = adao.getAllAdmin();
		mav.addObject("adminLists", lists);
		mav.addObject("totalCount", totalCount);
		mav.setViewName(getPage);
		return mav;
	}
}
