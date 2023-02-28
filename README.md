Inventory App
==================================

Code from completing Android Basics in Kotlin  Read and update data with Room

Introduction
------------

This app is an Inventory tracking app. Demos how to add, update, sell, and delete
 items from the local database.
This app demonstrates the use of Android Jetpack component [Room](https://developer.android.com/training/data-storage/room) database.  

The app also leverages [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel),
[LiveData](https://developer.android.com/topic/libraries/architecture/livedata),
[Flow](https://developer.android.com/kotlin/flow),
[View Binding](https://developer.android.com/topic/libraries/view-binding),
and [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/)
with the SafeArgs plugin for parameter passing between fragments.

![ItemList](https://user-images.githubusercontent.com/92341925/221746902-aaef4473-9f3d-4598-acfb-c4958c38b197.png)
![ItemDetails](https://user-images.githubusercontent.com/92341925/221746922-10789236-f185-4a5f-b8aa-4908c66c05c7.png)
![editItemMenu](https://user-images.githubusercontent.com/92341925/221746962-727aff88-ec87-412c-8a1d-c25bf0a2ecfd.png)
![AddItem](https://user-images.githubusercontent.com/92341925/221747020-681be2c9-fd54-4fec-a25f-33bd248bdb4b.png)

# There are three major components in Room:

- Data entities represent tables in your app's database. They are used to update the data stored in rows in tables, and to create new rows for insertion.

- Data access objects (DAOs) provide methods that your app uses to retrieve, update, insert, and delete data in the database.

- Database class holds the database and is the main access point for the underlying connection to your app's database. The database class provides - your app with instances of the DAOs associated with that database.


# In Summary

- Define your tables as data classes annotated with @Entity. Define properties annotated with @ColumnInfo as columns in the tables.

- Define a data access object (DAO) as an interface annotated with @Dao. The DAO maps Kotlin functions to database queries.

- Use annotations to define @Insert, @Delete, and @Update functions.

- Use the @Query annotation with an SQLite query string as a parameter for any other queries.

- Use Database Inspector to view the data saved in the Android SQLite database.

- Kotlin provides an ability to extend a class with new functionality without having to inherit from the class or modify the existing definition of the class. This is done via special declarations called extensions.

- To consume the Flow data as a LiveData value, use the asLiveData() function.

- The copy() function is provided by default to all the instances of data classes. It lets you copy an object and change some of its properties, while keeping the rest of its properties unchanged.
