package tutorial

import hello.GreetingController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * The main entry point to the application
 */
@EnableAutoConfiguration
@Configuration
class Application {
    @Bean
    fun controller() = GreetingController()

    @Bean
    fun secondController() = FirstController()
}

/**
 * Run the application
 * @param args The command line arguments
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}