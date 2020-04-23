package com.covid19shop.service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@ConfigurationProperties(prefix = "ibm.watson.assistant")
@Validated // Validación configuración
public class WatsonAssistantConfig {

    private String apikey;

    @NotNull(message = "Attendee id is required")
    @NotBlank(message = "Attendee id is required")
    @Pattern(regexp = "[a-z-A-Z0-9-]*", message = "Attendee id has invalid characters")
    private String id;

    @NotNull(message = "The url of the service is mandatory")
    @NotBlank(message = "The url of the service is mandatory")
    @Pattern(
            regexp = "https:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&\\/\\/=]*)",
            message = "Service url contains errors"
    )
    private String url;

    @NotNull(message = "The version date is mandatory")
    @NotBlank(message = "The version date is mandatory")
    @Pattern(
            regexp = "^\\d{4}(-)(((0)[0-9])|((1)[0-2]))(-)([0-2][0-9]|(3)[0-1])$",
            message = "Version date contains errors, must be in the format DD-MM-YYYY"
    )
    private String versionDate;


    // Getters
    public String getApikey() {
        return apikey;
    }
    public String getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }
    public String getVersionDate() {
        return versionDate;
    }
    // Setters
    public void setApikey(String apikey) { this.apikey = apikey; }
    public void setId(String id) { this.id = id; }
    public void setUrl(String url) { this.url = url; }
    public void setVersionDate(String versionDate) {
        this.versionDate = versionDate;
    }
}