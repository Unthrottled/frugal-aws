package io.acari.computeappone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@EnableWebFlux
@SpringBootApplication
class ComputeAppOneApplication

fun main(args: Array<String>) {
  runApplication<ComputeAppOneApplication>(*args)
}

