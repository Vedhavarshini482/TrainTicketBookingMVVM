package com.ticketbooking.adminview;

import java.util.ArrayList;
import java.util.List;

import com.ticketbooking.repository.Repository;

public class AdminModel {

	private AdminView view;

	AdminModel(AdminView view) {
		this.view = view;
	}

	public void bookings() {
		List<ArrayList<String>> userList = Repository.getInstance().bookings();
		view.printBookings(userList);
	}

	public void trainDetails() {
		List<ArrayList<String>> trainList = Repository.getInstance().trainDetails();
		view.printTrainDetails(trainList);
	}

}