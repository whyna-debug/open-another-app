Intent zvx = getPackageManager().getLaunchIntentForPackage("com.package");
if (zvx != null) {
 // Start
  startActivity(zvx);
} else if(zvx == null){
// not found
	
}
