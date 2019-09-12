/**
 * 
 */
package com.spring.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author lenovo
 *
 */
@RepositoryRestResource(collectionResourceRel ="aliens",path="aliens")
public interface Alienrepo extends JpaRepository<Alien, Integer> {
	

}
