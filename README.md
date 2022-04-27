# News Test APP | Новостное приложение(тестовое)

### Мингалеев Динар | Mingaleev Dinar
> Mingaleev-D92

## Description | Описание

+ Это очень маленький пример приложения, которое я создал,
+ чтобы продемонстрировать, как использовать retrofit2 для извлечения данных в представление recycler.

 + *Вы можете заметить, что некоторые изображения отсутствуют, если вы проверяете журналы, это потому, что api не предоставляет ни одного для этих статей

  + This is a very small sample app that I created to demonstrate how to use retrofit2 to retrieve data into a recycler view.

   + *You may notice that some images are missing, if you check the logs, it's because the api provides none for those articles.


![testNews](https://user-images.githubusercontent.com/61611031/162547869-b85f98de-b534-4a03-b102-dcf42a1ea762.gif)

## Stack | Технологии

 + RelativeLayout
 + Retrofit
 + RecyclerView
 + Glide
 + API https://github.com/Mingaleev-D92/Travel-Nav-Component/blob/master/app/src/main/res/raw/croatia.json


## Dependency | Зависимость

```kotlin

  //Android
     implementation 'androidx.recyclerview:recyclerview:1.1.0'
     implementation 'androidx.cardview:cardview:1.0.0'

     //Coroutines
     implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7'
     implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5'

     //Retrofit2
     implementation 'com.squareup.retrofit2:retrofit:2.7.1'
     implementation 'com.squareup.retrofit2:converter-gson:2.0.0'

     //Glide
     implementation 'com.github.bumptech.glide:glide:4.11.0'

```
