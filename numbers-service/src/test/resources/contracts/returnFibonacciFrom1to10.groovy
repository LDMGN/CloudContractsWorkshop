package contracts;

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        url '/fibonaccinumbers'
        body(
                [until:10]
        )
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }
    response {
        status 200
        body(
                [
                        fibonacciNumbers: [0,1,1,2,3,5,8],
                        instanceId: value(consumer('numbers-service-005887b1ff2a0c4cf0b94414d6e74a3a'),
                                producer(regex('numbers-service-[a-fA-F0-9]{32}')))
                ]
        )
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}
