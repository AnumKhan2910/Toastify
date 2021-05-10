# Toastify
Your customized toast library

To get a Git project into your build:

<h2>Prerequisites</h1>

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
<h2>Add the dependency</h2>

	dependencies {
	        implementation 'com.github.AnumKhan2910:Toastify:1.0'
	}
  
  
  <h2>Usage</h2>
   
   To show success toast:
   
     Toastify.showToast(this, Toastify.SUCCESS, "My success toast", Toast.LENGTH_SHORT)
     
   To show failure toast:
    
     Toastify.showToast(this, Toastify.FAILED, "My failure toast", Toast.LENGTH_SHORT)
     
   To show info toast:
   
     Toastify.showToast(this, Toastify.INFO, "My info toast", Toast.LENGTH_SHORT)
     
   To show default toast:
    
     Toastify.showToast(this, Toastify.DEFAULT, "My default toast", Toast.LENGTH_SHORT)
     
   To show customized toast:
     
     Toastify.showCustomizedToast(this, "My customized toast",  /* drawable */, /* color */,  Toast.LENGTH_SHORT)
     
