package com.flower1.service.impl;

import java.util.List;

import com.flower1.dao.ICatalogDAO;
import com.flower1.service.ICatalogService;

public class CatalogService implements ICatalogService {
	private ICatalogDAO catalogDAO;

	public ICatalogDAO getCatalogDAO() {
		return catalogDAO;
	}

	public void setCatalogDAO(ICatalogDAO catalogDAO) {
		this.catalogDAO = catalogDAO;
	}

	@Override
	public List getAllCatalogs() {
		// TODO Auto-generated method stub

		return catalogDAO.getAllCatalogs();
	}

}