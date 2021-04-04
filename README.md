# Mobile Developer Challenge

The purpose of this challenge is to give us a better understanding of your coding skills. If you have any questions or need any clarifications for this challenge, please get in touch!

## Goal:

#### Develop a Currency Conversion App that allows a user view exchange rates for any given currency

- [X] Create a Project for a Mobile Phone
- [X] Android: _Kotlin_ | iOS: _Swift_ (sorry, no Objective-C or Java please! You can learn Kotlin/Swift easily I'm sure:))

### Functional Requirements:
- [X] Exchange rates must be fetched from: https://currencylayer.com/documentation  
- [X] Use free API Access Key for using the API
- [X] User must be able to select a currency from a list of currencies provided by the API(for currencies that are not available, convert them on the app side. When converting, floating-point error is accpetable)
- [X] User must be able to enter desired amount for selected currency
- [X] User should then see a list of exchange rates for the selected currency
- [X] Rates should be persisted locally and refreshed no more frequently than every 30 minutes (to limit bandwidth usage)
- [X] Write unit testing

### UI Suggestion:
- [X] Some way to select a currency
- [X] Some text entry widget to enter the amount
- [X] A list/grid of exchange rates
- [X] It doesn’t need to be super pretty, but it shouldn’t be broken as well ;)

### What we're looking for:
- [X] An App that meets the Functional Requirements above
- [X] Your coding style! Show us how you like to write your code
- [X] Architecture, how you've structured your code
- [X] Principles, how you belive code should be written
- [X] Qualities, how you guarantee your code is functioning

### When you're done...

Zip your completed Project and email the .zip file.
If you want to instead make a github repo and just send us a link to it, that's fine too but please do __not__ fork this repo thanks!

Have fun!

![UI Suggested Wireframe](ui_suggestion.png)# PayPayAssessment

# Project designing

MVVM pattern can adopt for feature module posts and comments, also giving the provision to developers to opt for any type of patterns, like MVVM, MVP, Viper, MVC, etc.

It shows how to split an app in logical vertical slices, how to handle in-feature and across feature navigation (using navigation components), how each module can be tested and how to organize dependencies and build.gradle files. 

![Modularized architecture](https://github.com/anandmampuzhakal/CucumberTest/blob/main/readme/modularized_architecture.png)

Note that all code runs and executes, but the screens only contain data in xml preview. This means running the app provides a very "empty experience", but it also keeps the example simple and focused.

# Features 
This Module is intent to provide a template with basic MVVM architecture framework with task 
![MVVM pattern](https://github.com/anandmampuzhakal/CucumberTest/blob/main/readme/mvvmpattern.png)

Advantages:

- Simple, easy to read
- Use few libs, save time for gradle syncing
- No dagger or any other DI lib

## MVVM
Usually, a viwemodel can only aware the destroy of its owner in onClear() method. But after making it implements LifecycleObserver and observing owner's lifecycle in ViewModelProvider.Factory. It can use onCreate() or other lifecycle event now.
Check these codes in MVVMViewModelFactory.kt
