# CustomResources

CustomResources helps you to change your Components fonts  

#Avialabe Components

CustomButton, 
CustomCheckBox, 
CustomCheckedTextView, 
CustomEditText, 
CustomRadioButton, 
CustomTextView, 
CustomToggleButton.

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Gradle

Add it in your root build.gradle at the end of repositories:
	
	allprojects {

		repositories {

			maven { url 'https://jitpack.io' }
		
		}
	
	}
  
  
  Step 2. Add the dependency
  
  	dependencies {
	
	        compile 'com.github.surveshoeb:CustomResources:1.1.8'
	
	}
	
<strong>Steps in XML</strong>  
 ```* xmlns:custom="http://schemas.android.com/apk/res-auto"  in XML.```
 
 ```* custom:customfont="font_name" in component Tag.```

<strong>Avaialabe Font</strong>  
 * bellefair
 * droidSans
 * fresca
 * gotham
 * hind
 * lato
 * lora
 * merriweather
 * montserrat
 * notoSans
 * openSans
 * raleway
 * roboto

