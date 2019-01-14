package io.acari.computeappone.rest

import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions.resources

/**
 * Forged in the flames of battle by alex.
 */
@Component
class PreBuiltRouterComponent {

  @Bean
  fun staticRouterFunction(): RouterFunction<*> =
      resources("/**", ClassPathResource("static/"))

}