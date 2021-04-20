package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx1=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		 //LoginDTO 가져오기
	      //LoginDTO.
	      //LoginDAO 가져오기(id: bean1)
	      //bean1에 kin, 1111세팅
	      
	      //dao의 메서드 호출
		
		LoginDAO dao=ctx1.getBean(LoginDAO.class);
		LoginDTO dto=ctx1.getBean(LoginDTO.class);
		
		dto.setUserid("kin");
		dto.setUserpass(1111);
		
		dao.insert_data(dto);
		System.out.println("저장완료");
		ctx1.close();
	}
}
