package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        random();
    }
    

	public static void random() {
		
		new RandomNumber((int)( ((long)Integer.MAX_VALUE - (long)Integer.MIN_VALUE + 1 ) * 
				new Random().nextDouble() + Integer.MIN_VALUE )).save();
		
        List<RandomNumber> numbers = RandomNumber.q().asList();
        render(numbers);
	 
	}
	
	public static void flush() {
		
		RandomNumber.all().delete();
		random();
		
	}

}