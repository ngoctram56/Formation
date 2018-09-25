package com.adaming.interfaces;

import java.util.List;

import com.adaming.entities.Article;

public interface IGeneric<T> {
	public void inserer(T obj);

	public List<T> findAll();

	public T findOne(int code);

	public void update(T obj);

	public void delete(Long code);

}
