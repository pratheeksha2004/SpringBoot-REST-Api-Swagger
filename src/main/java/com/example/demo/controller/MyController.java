package com.example.demo.controller;

import com.example.demo.model.Item;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    @Operation(summary = "Get a simple greeting", description = "Returns a personalized greeting.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "text/plain", schema = @Schema(type = "string"))),
            @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    public String hello(@Parameter(description = "The name to greet") @RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }


    @PostMapping("/items")
    @Operation(summary = "Create a new item")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Item created successfully",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Item.class))),
            @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    public Item createItem(@RequestBody Item item) {
        // In a real application, you'd save this to a database
        item.setId(1L);  //Simulate setting an ID
        return item;
    }
}