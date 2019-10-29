package com.jcombat.client;

import java.util.List;

public interface ProfileRepository {
	List<Profile> getAllProfiles();
	Profile getProfile(String userId);
	List<Location> getAllLocations();
	List<GasReport> getgasInventory();
	List<Item> getgasItems();
}