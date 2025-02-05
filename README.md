# Java RabbitMQ Consumer

This is a **Java-based RabbitMQ consumer** that listens for messages from a RabbitMQ queue and processes JSON payloads.

---

### 1. Clone the Repository
```sh
git clone https://github.com/AvigarD611/rabbitmq-java-consumer.git
cd rabbitmq-java-consumer
```

### 2. Set Up Environment Variables
```sh
cp .env.example .env
```
Edit the .env file and add your RabbitMQ credentials:
```sh
RABBITMQ_HOST=your_hostname
RABBITMQ_PORT=your_port
RABBITMQ_USERNAME=your_username
RABBITMQ_PASSWORD=your_password
RABBITMQ_QUEUE=your_queue_name
```

### 3. Build the project
```sh
mvn clean package
```

### 4. Run the Consumer (Application)
You should see:

```json
[*] Waiting for messages...
[x] Received message: { "id": "...", "event_type": "...", "object_id": "...", "metadata": { ... } }
```
