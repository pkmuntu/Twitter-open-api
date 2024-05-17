package com.muntu.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Datum {
    public Attachments attachments;
    public Date created_at;
    public Entities entities;
    public String id;
    public String text;
}
