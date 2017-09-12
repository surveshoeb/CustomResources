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
	
	        compile 'com.github.surveshoeb:CustomResources:1.1.1'
	
	}
