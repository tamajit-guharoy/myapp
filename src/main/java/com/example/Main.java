package com.example;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(URLEncoder.encode("hello@123", StandardCharsets.UTF_8.toString()));
	}
}
