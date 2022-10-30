# 24 TV Clone Application
This application consists of two pages. 
- One of them home page that shows live feed and news
- Second one is details page that shows the news details. 

## Overview
### Architecture
This project follows MVVM architecture

### API Calls
Using the following APIs:
- [24TV Example API]


## Technology
### Presentation
- [View Binding](https://developer.android.com/topic/libraries/view-binding) - generates binding classes which hold reference to XML id'd elements
- [Recycler View](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView) - Displays lists of elements
- [Hilt](https://dagger.dev/hilt/) - Dependency Injection library based on dagger
- [Jetpack Navigation](https://developer.android.com/guide/navigation/navigation-getting-started) - Navigation library
- [SafeArgs](https://developer.android.com/guide/navigation/navigation-getting-started#ensure_type-safety_by_using_safe_args) - Type safe navigation
- [Picasso](https://square.github.io/picasso/) - A powerful image downloading and caching library for Android

### Networking
- [Retrofit](https://square.github.io/retrofit/) - Rest Client

## Screens

Home Page | Details Page | PiP Mode Live Feed
:-------------------------:|:-------------------------:|:-------------------------:
![](https://github.com/busrakizilaslan/FoodApp/blob/master/screenshots/splashscreen.png)|![](https://github.com/busrakizilaslan/FoodApp/blob/master/screenshots/loginpage.png)|![](https://github.com/busrakizilaslan/FoodApp/blob/master/screenshots/homepage.png)

Details Page             |  Cart Page
:-------------------------:|:-------------------------:
![](https://github.com/busrakizilaslan/FoodApp/blob/master/screenshots/fooddetail.png)|![](https://github.com/busrakizilaslan/FoodApp/blob/master/screenshots/cartpage.png)