package com.muntu;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
public class TwitterOpenApiApplication {

	private static final String API_KEY = "0sclx9QdsRb0peh9lPgnPn9ZF";
	private static final String API_SECRET_KEY = "I8ihU3uRh5JCQRN7BeO3l4yuNUmRR6W7NJf2WMN3TNlGVgVFaf";
	private static final String ACCESS_TOKEN = "1420314780670119937-dSeySS301Ioql69NIVrfPsYMB04Itu";
	private static final String ACCESS_TOKEN_SECRET = "egCe1HphcbB4pN0bPwkWcxW3IxqcBanDsSj5s4UVrKlnF";

	public static void main(String[] args) {
		SpringApplication.run(TwitterOpenApiApplication.class, args);


	}

}
