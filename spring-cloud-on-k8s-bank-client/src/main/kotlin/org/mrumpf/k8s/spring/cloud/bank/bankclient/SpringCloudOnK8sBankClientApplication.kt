package org.mrumpf.k8s.spring.cloud.bank.bankclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudOnK8sBankClientApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudOnK8sBankClientApplication>(*args)
}
