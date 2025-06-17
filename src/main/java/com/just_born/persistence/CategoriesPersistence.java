package com.just_born.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.just_born.entity.Categories;
@RepositoryRestResource
public interface CategoriesPersistence extends JpaRepository<Categories, Integer> {

}
