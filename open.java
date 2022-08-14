Intent zvx = getPackageManager().getLaunchIntentForPackage("com.packge");
if (zvx != null) {
 // Start
	startActivity(zvx);
} else if(zvx == null){
// not found
	
}
