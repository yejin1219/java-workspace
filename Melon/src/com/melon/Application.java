package com.melon;
import com.melon.controller.AlbumController;
import com.melon.controller.PaymentInfoController;
import com.melon.controller.UserController;
import com.melon.model.Album;
public class Application {

	public static void main(String[] args) {
		
		
		AlbumController al = new AlbumController();
		PaymentInfoController pa = new PaymentInfoController();
		UserController us = new UserController();
		
		 
		
		
		al.uploadAlbum(null);
		al.viewAlbum(0);
		
		
		
		}

	public void updateAlbum() {
		al.updateAlbum( new Album(title,singer));
	}
}
