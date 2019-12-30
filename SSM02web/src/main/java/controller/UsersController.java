package controller;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpServletRequest;
import entity.Users;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;
import service.UsersService;


@Controller
public class UsersController {
		@Resource
		private UsersService usersService;
		
		@RequestMapping("/findAll")
		public String findAll(Model model){
			model.addAttribute("list", usersService.findAll());
			return "/index.jsp";
		}
		@RequestMapping("/add")
		public String add(Model model,HttpServletRequest request){
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			Users users=new Users();
			users.setUsername(username);
			users.setPassword(password);
			usersService.add(users);
			model.addAttribute("list", usersService.findAll());
			return "/index.jsp";
		}
		@RequestMapping("/delete")
		public String delete(Model model,HttpServletRequest request){
			String id=request.getParameter("id");
			usersService.delete(Integer.parseInt(id));
			model.addAttribute("list", usersService.findAll());
			return "/index.jsp";
		}
		@RequestMapping("/gai")
		public String gai(Model model,HttpServletRequest request){
			String id=request.getParameter("id");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			Users users=new Users();
			users.setId(Integer.parseInt(id));
			users.setUsername(username);
			users.setPassword(password);
			usersService.gai(users);
			model.addAttribute("list", usersService.findAll());
			return "/index.jsp";
		}
		@RequestMapping("/chaid")
		public String chaid(Model model,HttpServletRequest request){
			String id=request.getParameter("id");
			model.addAttribute("user", usersService.chaid(Integer.parseInt(id)));
			return "/add.jsp";
		}
}
