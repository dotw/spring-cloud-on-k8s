package org.mrumpf.k8s.spring.cloud.bank.bankinfrastructure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudOnK8sBankInfrastructureApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudOnK8sBankInfrastructureApplication>(*args)
}
