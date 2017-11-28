package com.iu.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.qna.QnADTO;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {

	@RequestMapping(value="qnaList")
	public ModelAndView list(ModelAndView mv, @RequestParam(defaultValue="0", required=false)int curPage)	{
		QnADTO qnADTO = new QnADTO();
		qnADTO.setTitle("test");
		qnADTO.setWriter("choa");
		qnADTO.setAge(28);
		mv.addObject("view", qnADTO);
		mv.setViewName("qna/qnaList");
		System.out.println("curPage : " +curPage);
		return mv;
	}
	
	@RequestMapping(value="qnaView")
	public String view(Model model)	{
		QnADTO qnADTO = new QnADTO();
		qnADTO.setTitle("test");
		qnADTO.setWriter("choa");
		qnADTO.setAge(28);
		model.addAttribute("view", qnADTO).addAttribute("board", "qna");

		return "qna/qnaView";
	}
	
	/*@RequestMapping(value="/qna/qnaWrite")
	public String write()	{
		return "qna/qnaWrite";
	}	*/
	
	@RequestMapping(value="qnaWrite", method = RequestMethod.GET)
	public void write()	{}
	
	@RequestMapping(value="qnaWrite", method = RequestMethod.POST)
	public String write(QnADTO qnADTO, String title)	{
		
		
		System.out.println(qnADTO.getTitle());
		System.out.println("title : "+title);
		System.out.println(qnADTO.getWriter());
		System.out.println(qnADTO.getAge());
		/*String [] names = request.getParameterValues("name");*/
		for(String s : qnADTO.getName())	{
			System.out.println(s);
		}
		
		return "redirect:./qnaList?curPage=5";
	}
	
	/*@RequestMapping(value="qnaWrite", method=RequestMethod.POST)
	public String write2()	{
		return "qna/qnaList";
	}*/
	
	
}
