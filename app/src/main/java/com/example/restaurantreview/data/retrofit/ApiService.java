package com.example.restaurantreview.data.retrofit;

import com.example.restaurantreview.data.response.RestaurantResponse;
import com.example.restaurantreview.data.response.PostReviewResponse;
import retrofit2.Call;
import retrofit2.http.*;

public interface ApiService {
    @GET("detail/{id}")
    Call<RestaurantResponse> getRestaurant(@Path("id") String id);

    @FormUrlEncoded
    @Headers({"Authorization: token 1234"})
    @POST("review")
    Call<PostReviewResponse> postReview(
            @Field("id") String id,
            @Field("name") String name,
            @Field("review") String review
    );
}
