# Scalability: Distributed and Parallelized Programming
## Table of Contents
- Context
  - Big Data
  - High Performance Computing (HPC)
- The Need for Scalability
  - Scale up: vertical/hardware-based scalability
  - Scale out: horizontal/software-based scalability
- Parallelization and Cluster Computing
  - A motivating example
  - Map and Reduce parallelized operations
- [Spark](https://spark.apache.org/docs/latest/index.html)
  - Services
    - Resource management
    - Distributed processing
      - Resilient Distributed Datasets (RDDs)
      - Operations
        - Transformations
        - Actions
  - Architecture
    <p align="center">
        <img src="https://spark.apache.org/docs/latest/img/cluster-overview.png"/>
    </p>
  - Components
    - Cluster manager
      - Spark Standalone
      - Mesos
      - YARN
      - Kubernetes
    - Driver program
      - SparkContext
    - Worker nodes
    - Executors
    - Tasks
  - Installation (Spark Standalone)
  - Deployment (Manual)
    - ./sbin/start-master.sh
    - ./sbin/start-worker.sh
  - Application Deployment
    - ./bin/spark-submit.sh
- Case Study: Ecommerce Product Rating