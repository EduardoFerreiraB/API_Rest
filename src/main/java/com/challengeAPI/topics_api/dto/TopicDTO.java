package com.challengeAPI.topics_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TopicDTO {

    @NotBlank(message = "Título é obrigatorio")
    @Size(min = 3, max = 100, message = "O titulo deve ter entre 3 e 100 caracteres")
    private String title;

    @NotBlank(message = "O conteudo é obrigatorio")
    private String description;

    public @NotBlank(message = "Título é obrigatorio") @Size(min = 3, max = 100, message = "O titulo deve ter entre 3 e 100 caracteres") String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank(message = "Título é obrigatorio") @Size(min = 3, max = 100, message = "O titulo deve ter entre 3 e 100 caracteres") String title) {
        this.title = title;
    }

    public @NotBlank(message = "O conteudo é obrigatorio") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "O conteudo é obrigatorio") String description) {
        this.description = description;
    }
}
