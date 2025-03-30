package com.example.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class Item {

    @Schema(description = "The unique identifier of the item")
    private Long id;

    @Schema(description = "The name of the item")
    private String name;

    @Schema(description = "A description of the item")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}