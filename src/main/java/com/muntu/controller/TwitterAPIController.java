package com.muntu.controller;

import com.muntu.DTO.SearchTweetResponse;
import com.muntu.DTO.UserTweets;
import com.muntu.service.TwitterAPIService;
import com.muntu.utils.Constants;
import com.muntu.api.RestResponse;
import com.muntu.config.ApplicationPropertyReader;
import com.muntu.utils.RestAPICode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/twitter-api")
public class TwitterAPIController {

    private final TwitterAPIService twitterAPIService;
    private final ApplicationPropertyReader propertyReader;

    public TwitterAPIController(final TwitterAPIService twitterAPIService,ApplicationPropertyReader propertyReader){
        this.twitterAPIService=twitterAPIService;
        this.propertyReader=propertyReader;
    }

    @GetMapping("/search")
    public RestResponse<SearchTweetResponse> getWeatherForecastSummery(@RequestParam("keyword") String keyword){
        return RestResponse.of(twitterAPIService.searchTweets(keyword), propertyReader.getProperty(Constants.SEARCH_TWEET_MESSAGE),
                RestAPICode.OK_STATUS_CODE);
    }

    @GetMapping("/user-tweets")
    public RestResponse<UserTweets> getWeatherForecastHourly(@RequestParam("user") String user){
        return RestResponse.of(twitterAPIService.getUserTweets("user"), propertyReader.getProperty(Constants.USER_TWEET_MESSAGE),
                RestAPICode.OK_STATUS_CODE);
    }

}
