package kr.hs.study.main;

import java.util.List;

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
//		LoginDTO dto=ctx1.getBean(LoginDTO.class);
		
//		dto.setUserid("lee");
//		dto.setUserpass(1111);
//		dao.insert_data(dto);
		/* --------------------------------------------------- */
//		LoginDTO bean2=ctx1.getBean(LoginDTO.class);
//		
//		bean2.setUserid("kin");
//		bean2.setUserpass(2222);
//		
//		dao.update_data(bean2);
		
//		LoginDTO bean3=ctx1.getBean(LoginDTO.class);
//		bean3.setUserid("kin");
//		
//		dao.delete_date(bean3);
		
//		LoginDTO bean4=ctx1.getBean(LoginDTO.class);
		List<LoginDTO> list=dao.select_data();
		for(LoginDTO bean4:list) {
			System.out.println(bean4.getUserid());
			System.out.println(bean4.getUserpass());
		}
		System.out.println("완료");
		ctx1.close();
	}
}
