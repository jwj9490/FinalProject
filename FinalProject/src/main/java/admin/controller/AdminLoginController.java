package admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import admin.model.AdminBean;
import admin.model.AdminDao;

@Controller
public class AdminLoginController {

	private final String command = "login.admin";
	private final String getPage = "adminLoginForm";
	private final String gotoPage = "redirect:/list.admin";
	
	@Autowired
	AdminDao adao;
	
	@Autowired
	ServletContext servletContext;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String doAction() {
		
		
		return getPage;
	}
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView doActionPost(AdminBean ab, HttpSession session, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println("ab.getUsername() : " + ab.getUsername());
		System.out.println("ab.getPassword() : " + ab.getPassword());
		
		// 로그인한 사람 정보 가져오기
		AdminBean AdminLogin = adao.getAdmin(ab.getUsername());
		PrintWriter pw = response.getWriter();
		
		if(AdminLogin == null) { // 일치하는 id X
			pw.println("<script type='text/javascript'>alert('일치하는 유저명이 없습니다.')</script>");
			pw.flush();
			return new ModelAndView(getPage);
		}else { // 일치하는 id O
			if(AdminLogin.getPassword().equals(ab.getPassword())) { // id와 비번 모두 일치
				
				session.setAttribute("AdminLogin", AdminLogin);
				
				return new ModelAndView((String)session.getAttribute("destination"));
				
			}else { // id일치, 비번 일치 X
				pw.println("<script>alert('비밀번호가 일치하지않습니다.')</scrpit>");
				pw.flush();
				
				return new ModelAndView(getPage);
			}
		}
	}
}
