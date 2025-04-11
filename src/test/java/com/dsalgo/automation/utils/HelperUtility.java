package com.dsalgo.automation.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HelperUtility {
	
    public static List<String> extractUserDetails(Map<String, String> rowData) {
        if (rowData == null || rowData.isEmpty()) {
            throw new IllegalArgumentException("Row data is empty or null");
        }

        String username = rowData.getOrDefault("Username", ""); // Handles null values
        String password = rowData.getOrDefault("Password", "");
        String confirmPassword = rowData.getOrDefault("ConfirmPassword", "");

        return Arrays.asList(username, password, confirmPassword);
    }

}
