package contracts;

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        url '/primenumbers'
        body([
                from:1,
                to:10
        ])
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }
    response {
        status 200
        body([
                primeNumbers: [2,3,5,7],
                instanceId: value(consumer('numbers-service-005887b1ff2a0c4cf0b94414d6e74a3a'),
                        producer(regex('numbers-service-[a-fA-F0-9]{32}')))
        ])
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}