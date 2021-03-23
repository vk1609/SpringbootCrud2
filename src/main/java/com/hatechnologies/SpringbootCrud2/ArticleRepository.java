package com.hatechnologies.SpringbootCrud2;

import org.springframework.data.repository.CrudRepository;


public interface ArticleRepository extends CrudRepository<Article, Long> {

}
