package com.example.Restaurant.controller;

import com.example.Restaurant.Model.Restaurant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    private List<Restaurant> restaurantList = new ArrayList<>();
    private AtomicLong idCounter = new AtomicLong();

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable Long id) {
        Restaurant restaurant = getRestaurantFromListById(id);

        if (restaurant != null) {
            return ResponseEntity.ok(restaurant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantList;
    }

    @PostMapping("/addres")
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant) {
        restaurant.setId(idCounter.incrementAndGet());
        restaurantList.add(restaurant);
        return ResponseEntity.status(HttpStatus.CREATED).body(restaurant);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable Long id, @RequestBody Restaurant updatedRestaurant) {
        Restaurant restaurant = getRestaurantFromListById(id);

        if (restaurant != null) {
            restaurant.setSpecialty(updatedRestaurant.getSpecialty());
            // Set other updated fields here

            return ResponseEntity.ok(restaurant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable Long id) {
        Restaurant restaurant = getRestaurantFromListById(id);

        if (restaurant != null) {
            restaurantList.remove(restaurant);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private Restaurant getRestaurantFromListById(Long id) {
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getId().equals(id)) {
                return restaurant;
            }
        }
        return null;
    }
}
