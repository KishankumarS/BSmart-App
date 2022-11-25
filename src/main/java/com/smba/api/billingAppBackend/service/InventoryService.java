package com.smba.api.billingAppBackend.service;

import java.util.List;

import com.smba.api.billingAppBackend.model.Inventory;

public interface InventoryService {
	Inventory saveInventory(Inventory inventory);
	Inventory updateInventory(Inventory inventory);
	List<Inventory> getAllInventories();
}
