package com.dimuthu.shop.infoapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "info.app")
public class InfoApp {
    private String names;
    private String description;
    private String version;

    public String getNames() {
        return names;
    }

    public void setName(String names) {
        this.names = names;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String   toString() {
        return "InfoApp{" +
                "name='" + names + '\'' +
                ", description='" + description + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
