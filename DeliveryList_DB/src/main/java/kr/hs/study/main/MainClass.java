package kr.hs.study.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.ListDAO;
import kr.hs.study.dto.ListDTO;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		ListDAO dao=ctx.getBean(ListDAO.class);
		Scanner scan=new Scanner(System.in);
		System.out.println("********** 음식을 배달시켜 보세요 **********");
		
		int num=0;
		
		while(num != 5) {
			System.out.println("1. 음식 시키기");
			System.out.println("2. 주문한 음식 주소 바꾸기");
			System.out.println("3. 주문한 음식 취소하기");
			System.out.println("4. 주문한 음식 보기");
			System.out.println("5. 나가기");
			System.out.print(">> ");
			num=scan.nextInt();
			switch(num) {
				case 1:{
					System.out.print("음식 : ");
					String name=scan.next();
					System.out.print("가격 : ");
					int price=scan.nextInt();
					System.out.print("수량 : ");
					int count=scan.nextInt();
					System.out.print("주소 : ");
					String address=scan.next();
					System.out.print("기타 요구 사항 : ");
					String wanted=scan.next();
					
					ListDTO dto=ctx.getBean(ListDTO.class);
					dto.setName(name); dto.setPrice(price);
					dto.setCount(count);   dto.setAddress(address);
					dto.setWanted(wanted);
					dao.insert_data(dto);
					break;
				}
				case 2:{
					System.out.println("********** 현재 주문 내역 **********");
					List<ListDTO> list=dao.select_data();
					for(ListDTO food:list) {
						System.out.println("이름 :" + food.getName());
						System.out.println("가격 : " + food.getPrice());
						System.out.println("수량 : " + food.getCount());
						System.out.println("주소 : " + food.getAddress());
						System.out.println("기타 요구 사항 :"+ food.getWanted());
						System.out.println("-------------------------------- ");
					}
					System.out.print("바꾸고 싶은 이름을 작성해주세요 >> ");
					String name=scan.next();
					System.out.print("바꿀 주소를 입력해주세요. >> ");
					String address=scan.next();
					ListDTO dto=ctx.getBean(ListDTO.class);
					 dto.setName(name);  dto.setAddress(address); 
					dao.update_data(dto);
					break;
				}
				case 3:{
					System.out.println("********** 현재 주문 내역 **********");
					List<ListDTO> list=dao.select_data();
					for(ListDTO food:list) {
						System.out.println("이름 :" + food.getName());
						System.out.println("가격 : " + food.getPrice());
						System.out.println("수량 : " + food.getCount());
						System.out.println("주소 : " + food.getAddress());
						System.out.println("기타 요구 사항 :"+ food.getWanted());
						System.out.println("-------------------------------- ");
					}
					System.out.print("주문 취소할 음식을 입력해주세요. >> ");
					String name=scan.next();
					ListDTO dto=ctx.getBean(ListDTO.class);
					dto.setName(name);
					dao.delete_data(dto);
					System.out.println("주문에 들어갔습니다.");
					break;
				}
			}
		}

		System.out.println("완료");
		
		ctx.close();
	}
}
