package com.muntu.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tweet {

    public String author_id;
    public Date created_at;
    public String id;
    public String text;
}
