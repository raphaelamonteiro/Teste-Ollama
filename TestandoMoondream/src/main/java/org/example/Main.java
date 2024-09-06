package org.example;

import io.github.ollama4j.OllamaAPI;
import io.github.ollama4j.exceptions.OllamaBaseException;
import io.github.ollama4j.models.response.OllamaResult;
import io.github.ollama4j.types.OllamaModelType;
import io.github.ollama4j.utils.OptionsBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws OllamaBaseException, IOException, InterruptedException {

        String host = "http://localhost:11434/";
        OllamaAPI ollamaAPI = new OllamaAPI(host);
        ollamaAPI.setRequestTimeoutSeconds(200);

        OllamaResult result = ollamaAPI.generateWithImageFiles("moondream",
                "What's in this image?",
                List.of(
                        new File("C:\\Users\\Fatec\\Downloads\\side-view-smiley-couple-indoors.jpg")),
                new OptionsBuilder().build()
        );
        System.out.println(result.getResponse());
    }
}