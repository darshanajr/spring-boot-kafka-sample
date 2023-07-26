package com.darshanajr.springbootkafkasample.dao;

import lombok.Data;

import java.util.List;

@Data
public class SMS {
    private String from;
    private List<String> to;
    private String message;
}
