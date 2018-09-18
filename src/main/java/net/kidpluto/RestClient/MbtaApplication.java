package net.kidpluto.RestClient;

/*
 * Trying to implement this: https://github.com/KidPluto/gs-consuming-rest
 */
// Example of response from restful web service
//{
//    "type": "success",
//    "value": {
//        "id": 3,
//        "quote": "Spring has come quite a ways in addressing developer enjoyment and ease of use since the last time I built an application using it."
//    }
//}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MbtaApplication {
	
	private static final Logger log = LoggerFactory.getLogger(MbtaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MbtaApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		String request = "https://api-v3.mbta.com/schedules?filter[stop]=place-sstat&filter[min_time]=16:00&filter[max_time]=16:30&filter[route]=CR-Providence,CR-Worcester";
		return args -> {
			MbtaResponse mbtaResponse = restTemplate.getForObject( request, MbtaResponse.class);
			log.info(mbtaResponse.toString());
		};
	}
}
