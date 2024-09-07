package com.api.keycloak;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SecurityScheme(
		name = "Keycloak"
		, openIdConnectUrl = "<keycloak_base_url>/realms/<realm_name>/.well-known/openid-configuration"
		, scheme = "bearer"
		, type = SecuritySchemeType.OPENIDCONNECT
		, in = SecuritySchemeIn.HEADER
)
@SpringBootApplication
public class KeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakApplication.class, args);
	}

}
