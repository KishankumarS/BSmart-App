package com.smba.api.billingAppBackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smba.api.billingAppBackend.model.Inventory;
import com.smba.api.billingAppBackend.repository.InventoryRepository;
import com.smba.api.billingAppBackend.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {

	private InventoryRepository inventoryRepository;
	
	public InventoryServiceImpl(InventoryRepository inventoryRepositor) {
		super();
		this.inventoryRepository= inventoryRepositor;
	}
	
	@Override
	public Inventory saveInventory(Inventory inventory) {
		return inventoryRepository.save(inventory);
	}

	@Override
	public List<Inventory> getAllInventories() {
		return inventoryRepository.findAll();
	}

	@Override
	public Inventory updateInventory(Inventory inventory) {
		Inventory existingProduct = inventoryRepository.findById(inventory.getId()).orElse(null);
		existingProduct.setProduct_name(inventory.getProduct_name());
		existingProduct.setBarcode(inventory.getBarcode());
		existingProduct.setBrand(inventory.getBrand());
		existingProduct.setMrp(inventory.getMrp());
		existingProduct.setSp(inventory.getSp());
		existingProduct.setCp(inventory.getCp());
		existingProduct.setQuantity(inventory.getQuantity());
		return inventoryRepository.save(existingProduct);
	}

	
}
