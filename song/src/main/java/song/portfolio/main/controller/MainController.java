package song.portfolio.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	 /**
	 * 메인 페이지 이동
	 * @param 
	 * @return "/main/login"
	 * @exception Exception
	 */
	
	@RequestMapping( value = "/main.do")
	public ModelAndView mainPage(ModelAndView mav) throws Exception {
		
		System.out.println("메인");
		
		mav.setViewName("song/portfolio/main/main");
		return mav;
	}
}
