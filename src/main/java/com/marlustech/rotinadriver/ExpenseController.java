package com.marlustech.rotinadriver;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/expenses")
public class ExpenseController {

    @Autowired
    private ChatClient chatClient;

    @PostMapping("/analyze")
    public ResponseEntity<Map<String, String>> analyzeExpense(@RequestBody Map<String, Object> payload) {
        String description = payload.get("description") != null ? payload.get("description").toString() : "";
        String amount = payload.get("amount") != null ? payload.get("amount").toString() : "0";

        String prompt = "Analise a despesa: " + description + " no valor de RS " + amount;
        String response = this.chatClient.call(prompt);

        Map<String, String> result = new HashMap<>();
        result.put("analysis", response);

        return ResponseEntity.ok(result);
    }
}