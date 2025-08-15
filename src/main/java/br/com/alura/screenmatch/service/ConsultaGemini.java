package br.com.alura.screenmatch.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaGemini {
    public static String obterTraducao(String texto) {
        Client client = Client.builder().apiKey("AIzaSyBhms_wuUbGiFXfPgxIKA2ftbH5QO4izjg").build();
        GenerateContentResponse response = client.models.generateContent("gemini-2.5-flash", "Retorna apenas a tradução em portugês de: " + texto, null);
        return response.text();
    }
}

// gemini-2.5-flash: RPM-10, RPD-250, TPM-250,000
// RPM - Requests per minute
// RPD - Requests per day
// Tokens per minute(inout)