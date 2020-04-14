package com.codemo.iroads.Domain.crowdSourcing;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.couchbase.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Location {
    @Field
    private double longitude;
    @Field
    private double latitude;
    @Field
    private long timeStamp;

}
