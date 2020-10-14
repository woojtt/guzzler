package pl.itdetails.guzzler.resteasy;

import pl.itdetails.guzzler.database.entity.Recipe;
import pl.itdetails.guzzler.service.RecipeService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/recipe")
public class RecipeResource {

    @Inject
    private RecipeService recipeService;

    @GET
    public List<Recipe> getRecipe() {
        return recipeService.getRecipe();
    }
}
