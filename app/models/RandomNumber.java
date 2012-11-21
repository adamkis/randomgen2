package models;

import play.data.validation.Required;
import play.modules.morphia.Model;

import com.google.code.morphia.annotations.Entity;
 
@Entity
public class RandomNumber extends Model {
   
    @Required
    public int value;

    
    public RandomNumber(int value) {
        this.value = value;
    }

 
}