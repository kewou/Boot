/**
 * 
 */
package com.example.demoSpring.testIntegration.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demoSpring.AbstractDataIntegrationTest;
import com.example.demoSpring.repository.UserRepository;

/**
 * @author joel.noumia
 *
 */
public class UserReposTest extends AbstractDataIntegrationTest {

	@Autowired
	private UserRepository userRepos;

	@Test
	public void testFindAll() {
		Assert.assertNotNull(userRepos.findAll());
	}

	@Test
	public void testFindOne() {
		Assert.assertNotNull(userRepos.findOne((long) 2));
	}

}
