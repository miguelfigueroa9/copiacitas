package uniajc.edu.co.generador_citas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import uniajc.edu.co.generador_citas.app.ws.pojos.Ips;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
 class IpsControllerTest {
	
	@LocalServerPort
	int randomServerPort;
	
	String url = "http://localhost:";
	
	@Test
	public void testGetCitas() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = url + randomServerPort + "/apis1/ips";
		URI uri = new URI(baseUrl);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization","Bearer " +"7f2658b5-51f2-4b34-b4b8-a256d35d570f");
		HttpEntity<String> request = new HttpEntity<>(headers);
		ResponseEntity<String> result = restTemplate.exchange(uri,HttpMethod.GET,request,String.class);
	    assertEquals(200, result.getStatusCodeValue());
	}
	
	@Test
	public void testPostIps() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = url + randomServerPort + "/apis1/ips";
		URI uri = new URI(baseUrl);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization","Bearer " +"7f2658b5-51f2-4b34-b4b8-a256d35d570f");
		Ips ips = new Ips();
		ips.setIdIps(7);
		ips.setCentroMedico("Jamundi");
		HttpEntity<Ips> request = new HttpEntity<>(ips,headers);
		ResponseEntity<String> result = restTemplate.exchange(uri,HttpMethod.POST,request,String.class);
	    assertEquals(200, result.getStatusCodeValue());
	}
	
	@Test
	public void testPutIps() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = url + randomServerPort + "/apis1/ips";
		URI uri = new URI(baseUrl);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization","Bearer " +"7f2658b5-51f2-4b34-b4b8-a256d35d570f");
		Ips ips = new Ips();
		ips.setIdIps(7);
		ips.setCentroMedico("Jamundi");
		HttpEntity<Ips> request = new HttpEntity<>(ips,headers);
		ResponseEntity<String> result = restTemplate.exchange(uri,HttpMethod.PUT,request,String.class);
	    assertEquals(200, result.getStatusCodeValue());
	}
	
	@Test
	public void testDeleteIps() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = url + randomServerPort + "/apis1/ips";
		URI uri = new URI(baseUrl);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization","Bearer " +"7f2658b5-51f2-4b34-b4b8-a256d35d570f");
		Ips ips = new Ips();
		ips.setIdIps(7);
		ips.setCentroMedico("Jamundi");
		HttpEntity<Ips> request = new HttpEntity<>(ips,headers);
		ResponseEntity<String> result = restTemplate.exchange(uri,HttpMethod.DELETE,request,String.class);
	    assertEquals(200, result.getStatusCodeValue());
	}
	

}
