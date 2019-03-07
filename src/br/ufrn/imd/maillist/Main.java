package br.ufrn.imd.maillist;

public class Main {

	public static void main(String[] args) {
		
		MailServer mailServer = new MailServer();
		MailClient mailClient1 = new MailClient(mailServer, "user1");
		MailClient mailClient2 = new MailClient(mailServer, "user2");
		MailClient mailClient3 = new MailClient(mailServer, "user1");

		mailClient1.sendMailItem("user2", "test email", "this is a simple test mail. \n :)");
		
		mailClient2.sendMailItem("user3", "test email", "this is a simple test mail. \n :)");
		mailClient2.sendMailItem("user1", "test email", "this is a simple test mail. \n :)");
		
		mailClient3.sendMailItem("user1", "test email", "this is a simple test mail. \n :)");

		//Counting emails for each user
		System.out.println("Number of emails for User1: " + mailServer.howManyMailItems("user1"));
		System.out.println("Number of emails for User2: " + mailServer.howManyMailItems("user2"));
		System.out.println("Number of emails for User3: " + mailServer.howManyMailItems("user3"));
		System.out.println();
		
		//print all emails inside emailServer
		for(int i = 0; i < mailServer.getItems().size(); i++) {
			System.out.println("Email " + i + ": ");
			mailServer.getItems().get(i).print();
			System.out.println("-----------------");
		}
	}
	
	

}
