package pl.itdetails.guzzler.service;

import com.mongodb.client.MongoClient;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.PanacheQuery;
import pl.itdetails.guzzler.database.entity.Recipe;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class RecipeService {

    public List<Recipe> getRecipe() {
        return Recipe.listAll();
    }
}
