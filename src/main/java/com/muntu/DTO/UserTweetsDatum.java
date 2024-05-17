package com.muntu.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTweetsDatum {
    public Date created_at;
    public String id;
    public String name;
    public String pinned_tweet_id;
    public String username;
}
