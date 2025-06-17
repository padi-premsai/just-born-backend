package com.just_born.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.just_born.entity.Categories;
import com.just_born.persistence.CategoriesPersistence;
@Service
public class CategoriesService implements CategoriesServiceDec{
	private CategoriesPersistence cp;
	@Autowired
	public CategoriesService(CategoriesPersistence cp) {
		this.cp=cp;
	}
	@Override
	@Transactional
	public List<Categories> allcategories() {
		
		return cp.findAll();
	}
	@Override
	@Transactional
	public Categories byid(int category_id) {
		Categories c = cp.findById(category_id).get();
		return c;
	}
	@Override
	@Transactional
	public void insetandupdate(Categories categories) {
		cp.save(categories);
		
	}
	@Override
	@Transactional
	public void delete(int category_id) {
		cp.deleteById(category_id);
	}


}
