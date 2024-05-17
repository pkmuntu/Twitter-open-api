package com.muntu.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchTweetResponse {

    public ArrayList<Datum> data;
    public Includes includes;
    public Meta meta;

}


