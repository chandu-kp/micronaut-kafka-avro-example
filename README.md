## Micronaut Kafka Avro Example

### Prerequisite
- Install Docker

### Other tools
- Maven
- Intellij IDE
- Kadeck

### How to run
- Start the Docker Composer. This will start Zookeeper, Kafka and Schema Register in docker containers
  - `docker-compose up`
- Start the Producer App in one terminal
  - `cd producer-app`
  - `./mvnw exec:exec`
- Start the Consumer App in another terminal
  - `cd consumer-app`
  - `./mvnw exec:exec`
- Send request via postman
  - check `Micronaut-Kafka.postman_collection.json` for sample requests. Import this into postman.