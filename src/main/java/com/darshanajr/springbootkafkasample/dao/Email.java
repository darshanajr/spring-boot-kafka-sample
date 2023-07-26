package com.darshanajr.springbootkafkasample.dao;

import lombok.Data;

import java.util.List;

@Data
public class Email {
    private String from;
    private List<String> to;
    private String heading;
    private String message;
}
