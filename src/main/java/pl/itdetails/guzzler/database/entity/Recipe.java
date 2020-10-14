package pl.itdetails.guzzler.database.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.time.LocalDate;

@MongoEntity(collection = "Recipe")
public class Recipe extends PanacheMongoEntity {
    private String name;

    @BsonProperty("createDate")
    private LocalDate createDate;
}
