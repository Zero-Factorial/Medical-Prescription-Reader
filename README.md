Medical Prescription Reader
=============================
The objective of this project is the use of Android and computer vision together
by developing an Android application that spreads awareness among general
people about medicine. The specific function of the application is to allow a
User to take a picture of the Medical Prescription and then quickly display the
Medicine information 

## What does this app do ---->

After opening the app,a landing page or home page will be launched.Next we need to press prescription button to capture the image of a prescription

                  
  <br />                
                  
                  
<div align="left">
    <img src="https://github.com/Zero-Factorial/Medical-Prescription-Reader/blob/master/images/Landing_Page.png" width="320px"</img> 
    <img src="https://github.com/Zero-Factorial/Medical-Prescription-Reader/blob/master/images/captured.png" width="380px"</img> 
</div>
   


<br /> 
<br />


 Here the captured image is selected if it is in good quality by ok button otherwise recapture image by retry button.



<br />

<div align="left">
    <img src="https://github.com/Zero-Factorial/Medical-Prescription-Reader/blob/master/images/result_page.png" width="440px"</img> 
    <img src="https://github.com/Zero-Factorial/Medical-Prescription-Reader/blob/master/images/Special.png" width="380px"</img> 
    
</div>


<br />
<br />

Finally the details information of the medicines is displayed. If a medicine has a high side effect rate it's side effect rate will display as 
yellow marked text.



`

### Setup ------->


* Open Android Studio and select `File->Open...` or from the Android Launcher select `Import project ( Gradle, etc.)` and navigate to the root directory of your project.
* Select the directory or drill in and select the file `build.gradle` in the cloned repo.
* Click 'OK' to open the the project in Android Studio.
* A Gradle sync should start, but you can force a sync and build the 'app' module as needed.

### Gradle
* Add the dependencies: `compile 'com.google.android.gms:play-services-vision:11.4.0'`


## Running the App

Connect an Android device to your development machine.

### Android Studio

* Select `Run -> Run 'app'` (or `Debug 'app'`) from the menu bar
* Select the device you wish to run the app on and click 'OK'

