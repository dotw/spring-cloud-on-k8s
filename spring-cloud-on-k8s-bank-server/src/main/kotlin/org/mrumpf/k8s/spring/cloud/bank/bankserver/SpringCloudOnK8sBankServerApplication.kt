package org.mrumpf.k8s.spring.cloud.bank.bankserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudOnK8sBankServerApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudOnK8sBankServerApplication>(*args)
}
