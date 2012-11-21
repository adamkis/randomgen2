package models;

import java.util.Date;

import javax.persistence.Lob;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.modules.morphia.Model;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;
 
@Entity
public class RandomNumber extends Model {
   
    @Required
    public int value;

    
    public RandomNumber(int value) {
        this.value = value;
    }

 
}