package it.unisalento.myairbnb.serviceimpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.when;
import static org.mockito.BDDMockito.then;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.context.SpringBootTest;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.service.UserService;
//import it.unisalento.myairbnb.service.UserService;




@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class UserServiceUnitTest {
	
	@Mock
	private UserService userServiceMock;
	
	private User user;
	@Before
	private void setUp() {
		
		user= new User();
		user.setName("Provola");
		
		
		
	}
	@Test
	public void saveUserTest () {
		
		
		
	
	
		when(userServiceMock.saveOrUpdate(user)).thenReturn(user); //è come un if che quando viene invocato il metodo save di UserServiceJava sllora ritorna l'oggetto utente
		 
		 int id=userServiceMock.saveOrUpdate(user).getIduser();
		 assertThat(id).isNotNull();
	}

}
