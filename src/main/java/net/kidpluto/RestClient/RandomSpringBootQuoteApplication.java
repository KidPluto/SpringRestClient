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
public class RandomSpringBootQuoteApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RandomSpringBootQuoteApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RandomSpringBootQuoteApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			RandomSpringBootQuote quote = restTemplate.getForObject(
					"http://gturnquist-quoters.cfapps.io/api/random", RandomSpringBootQuote.class);
			log.info(quote.toString());
		};
	}
}
