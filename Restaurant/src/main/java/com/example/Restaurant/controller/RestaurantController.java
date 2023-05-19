package com.example.Restaurant.controller;

import com.example.Restaurant.model.Restaurant;
import com.example.Restaurant.service.Restaurant_Services;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurant-app")
public class RestaurantController {
private final Restaurant_Services restaurantServices;
public RestaurantController(Restaurant_Services restaurantServices){

    this.restaurantServices=restaurantServices;
}
    @PostMapping("/add-restaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant){

restaurantServices.addRestaurant(restaurant);
    }
    @GetMapping("find-restaurant/id/{id}")
    public Restaurant findRestaurantById(@PathVariable int id){
        return restaurantServices.findById(id);

    }
    @GetMapping("find-all")
    public List<Restaurant> findAllRestaurants(){
        return restaurantServices.findAll();

    }
    @PutMapping("update-restaurant/id/{id}")

    public void updateRestaurant(@PathVariable int id,@RequestBody Restaurant restaurant){
restaurantServices.updateRestaurant(id,restaurant);
    }
    @DeleteMapping("delete-restaurant/id/{id}")
    public void deleteRestaurant(@PathVariable int id ){
restaurantServices.deleteRestaurant(id);

    }
}
