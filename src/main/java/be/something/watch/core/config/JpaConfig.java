package be.something.watch.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("be.something.watch.core.repositories")
public class JpaConfig {
}
