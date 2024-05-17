package com.muntu.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medium {
    public int height;
    public String media_key;
    public String type;
    public String url;
    public int width;
    public int duration_ms;
    public String preview_image_url;
    public PublicMetrics public_metrics;
}
