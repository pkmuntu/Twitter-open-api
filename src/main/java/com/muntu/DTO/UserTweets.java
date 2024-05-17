package com.muntu.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTweets {

    public ArrayList<UserTweetsDatum> data;

    public UserTweetsInclude includes;
}
