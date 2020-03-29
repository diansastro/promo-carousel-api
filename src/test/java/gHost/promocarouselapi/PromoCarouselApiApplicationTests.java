package gHost.promocarouselapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@AutoConfigureMockMvc
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PromoCarouselApiApplication.class)
public class PromoCarouselApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetUserModules() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get( "/api/v1/user/1");
		this.mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(MockMvcResultMatchers.jsonPath("$.module.length()").value(5));
	}

	@Test
	public void testGetModuleNullUser() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get( "/api/v1/user/4");
		this.mockMvc.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isNotFound());
	}

}
