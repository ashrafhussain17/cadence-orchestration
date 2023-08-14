package com.ashraf.mycadence;

import com.uber.cadence.client.WorkflowClient;
import com.uber.cadence.client.WorkflowClientOptions;
import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCadenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCadenceApplication.class, args);
        WorkflowClientOptions clientOptions = WorkflowClientOptions.newBuilder()
                .setDomain("default") // Specify the Cadence domain to use
                .build();
        WorkerFactory workerFactory = WorkerFactory.newInstance(WorkflowClient.newInstance("http://localhost:7933");
    }

}
