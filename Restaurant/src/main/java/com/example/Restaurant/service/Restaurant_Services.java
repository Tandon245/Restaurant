package com.example.Restaurant.service;

import com.example.Restaurant.model.Restaurant;

import org.springframework.stereotype.Service;


import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class Restaurant_Services {

   private  static List<Restaurant> restaurants=new ArrayList<Restaurant>();
   private  static int restaurantCount=0;
   static {
       restaurants.add(new Restaurant(++restaurantCount, "Tandon Cafe","Bhopal",9782,"Biryani",4));
       restaurants.add(new Restaurant(++restaurantCount, "Sikku Cafe","Chennai",9001,"Ice Cream",6));
       restaurants.add(new Restaurant(++restaurantCount, "Vishal Cafe","Indore",7223,"Coffee",2));
       restaurants.add(new Restaurant(++restaurantCount, "Hukum Cafe","Delhi",6262,"Egg Curry",1));
   }

   public List<Restaurant> findAll(){

       return  restaurants;
   }
   public Restaurant findById(int id){



       Predicate<? super Restaurant> predicate = restaurant -> restaurant.getId()==id;
       Restaurant restaurant=restaurants.stream().filter(predicate).findFirst().get();
       return restaurant;

   }

   public  void addRestaurant(Restaurant restaurant){

       restaurants.add(restaurant);
   }
   public  void  deleteRestaurant(int id){
       Predicate<? super Restaurant> predicate=restaurant -> restaurant.getId()==id;
       restaurants.removeIf(predicate);
   }
   public void  updateRestaurant(int id,Restaurant newrestaurant){
       Restaurant restaurant=findById(id);
       restaurant.setId(newrestaurant.getId());

   }
}
