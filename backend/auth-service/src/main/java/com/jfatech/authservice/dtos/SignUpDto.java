package com.jfatech.authservice.dtos;

/**
 * @author Fellipe Toledo
 */
public record SignUpDto(String firstName, String lastName, String login, char[] password) { }
