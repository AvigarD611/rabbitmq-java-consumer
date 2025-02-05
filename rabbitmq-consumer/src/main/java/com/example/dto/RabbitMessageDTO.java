package com.example.dto;

public class RabbitMessageDTO {
    private String id;
    private String event_type;
    private String object_id;
    private MetadataDTO metadata;

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEvent_type() { return event_type; }
    public void setEvent_type(String event_type) { this.event_type = event_type; }

    public String getObject_id() { return object_id; }
    public void setObject_id(String object_id) { this.object_id = object_id; }

    public MetadataDTO getMetadata() { return metadata; }
    public void setMetadata(MetadataDTO metadata) { this.metadata = metadata; }

    @Override
    public String toString() {
        return "RabbitMessageDTO{" +
                "id='" + id + '\'' +
                ", event_type='" + event_type + '\'' +
                ", object_id='" + object_id + '\'' +
                ", metadata=" + metadata +
                '}';
    }
}
