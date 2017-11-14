package controller;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Air;

import service.AirService;

@Controller
public class AirController {
	@Autowired
	private AirService as;

	public AirService getAs() {
		return as;
	}

	public void setAs(AirService as) {
		this.as = as;
	}

	@RequestMapping("/getAll")
	public String getAll(@RequestParam(defaultValue = "1") int indexpage,
			HttpServletRequest request) {
		if (indexpage < 1) {
			return "index.jsp";
		} else {
			int page = (indexpage - 1) * 3;
			List<Air> all = as.getAll(page, 3);
			request.getSession().setAttribute("all", all);
			request.getSession().setAttribute("indexpage", indexpage);
			int zong=as.count();
			int zongnum=zong%3==0?zong/3:zong/3+1;
			request.getSession().setAttribute("zongnum", zongnum);
			return "index.jsp";
		}
	}

	@RequestMapping("/add")
	public String getAlldid(HttpServletRequest request) {
		List<Air> all = as.getAlldid();
		request.getSession().setAttribute("all", all);
		return "add.jsp";
	}

	@RequestMapping("/insert")
	public void insert(Air a,HttpServletRequest request ,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out =response.getWriter();
		int num = as.insert(a);
		if (num > 0) {
			out.print("<script>alert('添加成功!');location.href='getAll'</script>");
			
		} else {
			out.print("<script>alert('添加失败！');location.href='getAll'</script>");
			
		}
	}
}
