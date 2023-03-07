package ticketbooking.login;

import com.ticketbooking.dto.User;
import com.ticketbooking.repository.Repository;
import com.ticketbooking.dto.Admin;

public class LoginModel {

	private LoginView view;

	LoginModel(LoginView view) {
		this.view = view;
	}

	public void validAdmin(String userName, String password) {
		Admin admin = Repository.getInstance().validAdmin(userName, password);
		if (admin != null)
			view.validAdmin("\t\tHello " + admin.getUserName());
		else
			view.invalidAdmin("\t\tInvalid login attempt");
	}

	public void validLogin(String name, String password) {
		User user = Repository.getInstance().validUser(name, password);
		if (user != null)
			view.validUser("\t\tHello " + user.getName());
		else
			view.invalidUser("\t\tInvalid Login attempt");
	}

	public void createAccount(String name, String password, String address, long mobileNumber, String mailID) {
		Repository.getInstance().createAccount(name, password, address, mobileNumber, mailID);
		view.accountCreated("Your account created successfully");
	}

}