package com.muntu.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.muntu.DTO.SearchTweetResponse;
import com.muntu.DTO.UserTweets;
import com.muntu.config.ApplicationPropertyReader;
import com.muntu.exception.TwitterAPIServiceUnavailableException;
import com.muntu.utils.HTTPUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("TwitterAPIService")
public class TwitterAPIService {

    private final ApplicationPropertyReader applicationPropertyReader;

    public TwitterAPIService(ApplicationPropertyReader applicationPropertyReader) {
        this.applicationPropertyReader = applicationPropertyReader;

    }

    public SearchTweetResponse searchTweets(String keyword) {
        final Map<String, String> headers;
        SearchTweetResponse searchTweetResponse=null;
        String responseBody = null;
        String url = null;
        try {
            headers = new HashMap<>();
            headers.put("USER_AGENT", applicationPropertyReader.getProperty("USER_AGENT"));
            headers.put("Authorization", "Bearer "+applicationPropertyReader.getProperty("token"));

            url = buildSearchURl(applicationPropertyReader.getProperty("searchUrl"), keyword);
            responseBody = HTTPUtil.connection(url, null, "GET", headers);
            ObjectMapper objectMapper = new ObjectMapper();
            searchTweetResponse = objectMapper.readValue(responseBody, SearchTweetResponse.class);

        } catch (Exception e) {
            e.printStackTrace();
            throw new TwitterAPIServiceUnavailableException("SearchTweetResponse", e.getMessage());
        }
        return null;
    }

    public UserTweets getUserTweets(String user) {

        final Map<String, String> headers;
        UserTweets userTweets = null;
        String responseBody = null;
        String url = null;
        try {

            headers = new HashMap<>();

            headers.put("USER_AGENT", applicationPropertyReader.getProperty("USER_AGENT"));
            headers.put("Authorization", "Bearer "+applicationPropertyReader.getProperty("token"));
            url = buildUserTweetsURl(applicationPropertyReader.getProperty("userTweetsUrl"), user);
            responseBody = HTTPUtil.connection(url, null, "GET", headers);
            ObjectMapper objectMapper = new ObjectMapper();
            userTweets=objectMapper.readValue(responseBody,UserTweets.class);


        } catch (Exception e) {
            e.printStackTrace();
            throw new TwitterAPIServiceUnavailableException("WeatherForecast", e.toString());
        }
        return userTweets;
    }

    private String buildSearchURl(String baseURL, String location) {
        return baseURL + "?query=" + location;
    }

    private String buildUserTweetsURl(String baseURL, String name) {
        return baseURL + name;
    }

}
