package org.nabihi.haithamportfolio.auth0.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Auth0PermissionResponseModel {

    @JsonProperty("permission_name")
    private String name;

    @JsonProperty("resource_server_identifier")
    private String resourceServerIdentifier;

    @JsonProperty("description")
    private String description;
}
