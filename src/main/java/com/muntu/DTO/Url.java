package com.muntu.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Url {
    public int start;
    public int end;
    public String url;
    public String expanded_url;
    public String display_url;
}
