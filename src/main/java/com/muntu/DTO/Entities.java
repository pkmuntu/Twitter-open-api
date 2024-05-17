package com.muntu.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entities {
    public ArrayList<Hashtag> hashtags;
    public ArrayList<Mention> mentions;
    public ArrayList<Url> urls;
}
