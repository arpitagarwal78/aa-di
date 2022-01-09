package guru.springframework.aadi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("guru") // this will automatically bind properties
public class AaConstructorConfig {

    // as final we can only get them not change them so configuration is constant cant be changed on fly
    private final String username;
    private final String password;
    private final String jdbcUrl;

    public AaConstructorConfig(String username, String password, String jdbcUrl) {
        this.username = username;
        this.password = password;
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
