package com.melon;
import java.util.Scanner;

import com.melon.controller.AlbumController;
import com.melon.controller.MusicController;
import com.melon.controller.PaymentInfoController;
import com.melon.controller.UserController;
import com.melon.model.Music;
import com.melon.model.User;
public class Application {


	
	public static void main(String[] args) {
		
		
		AlbumController al = new AlbumController();
		PaymentInfoController pa = new PaymentInfoController();
		UserController us = new UserController();
		MusicController ms = new MusicController();
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 ");
		String id = sc.nextLine();
		System.out.print("비번");
		String password = sc.nextLine();
		System.out.print("이메일");
		String email = sc.nextLine();
		System.out.print("폰 번호");
		String phone = sc.nextLine();
		System.out.print("닉네임");
		String nickName= sc.nextLine();
		System.out.print("주소");
		String address= sc.nextLine();
		
		User user = new User(id,password,email,phone,nickName,address,null);
		
		
		
		
	     us.signUp(id,user);
		
		System.out.println(us.login(id,password));
		
		System.out.println(ms.uploadMusic(new Music("spicy","에스파")));
		
		System.out.println(ms.uploadMusic(new Music("퀸카","아이들")));
		
		System.out.println(ms.printAll());
		
		System.out.println(ms.viewMusic(0));
		
		ms.updateMusic(1, new Music("블랙맘바","에스파"));
		System.out.println(ms.printAll());
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println( ms.addatZero(new Music("으르렁","엑소")));
		System.out.println(ms.printAll());
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("뮤직 플레이어 리스트 추가 : " +  ms.addmyMusicList(us.viewUserInfo(id), new Music("spicy","에스파")));
		
		System.out.println("---------------------------------------------------------");
		
	
		System.out.println("뮤직 플레이어 리스트 추가 : " +  ms.addmyMusicList(us.viewUserInfo(id), new Music("퀸카","아이들")));
		System.out.println("---------------------------------------------------------");
		
		
		System.out.println(ms.viewmyMusicList(user));
	
		
		
		
		
		
		
		}

	


}