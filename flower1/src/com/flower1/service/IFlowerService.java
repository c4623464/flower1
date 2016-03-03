package com.flower1.service;

import java.util.List;

import com.flower1.model.Flower;

public interface IFlowerService {
		public List getNewFlower();
		public List getFlowerByCatalogidPaging(int catalogid,int currentPage,int pageSize);
		public int getTotalByCatalog(int catalogid);
		public Flower getFlowerById(int id);
		public boolean addOrUpdateFlower(Flower flower);
		public List getAllFlower();
		public boolean deleteFlowerById(int id);
}
